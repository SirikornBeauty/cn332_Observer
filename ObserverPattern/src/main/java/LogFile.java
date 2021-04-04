/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 *
 * @author sirik
 */
public class LogFile extends Observer{
    public LogFile(Customer customer_) {
        this.customer_ = customer_;
        this.customer_.addCustomers(this);
    }

    @Override
    public void update() throws IOException, GeneralSecurityException {

        ArrayList<String> customerName = customer_.getArrayList();
        boolean append = true;
        FileHandler handler = new FileHandler("default.log", append);
 
        Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
        logger.addHandler(handler);
         
        for(int i=0; i < customerName.size(); i++){
            logger.severe(customerName.get(i));
        }
        
        System.out.println("-- Update Log File --");
    }
    
}
