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
public class LogFileEdit extends Observer{
    
    public LogFileEdit(Customer customer_) {
        this.customer_ = customer_;
        this.customer_.addCustomers(this);
    }

    @Override
    public void update() throws IOException, GeneralSecurityException  {
        boolean append = true;
        FileHandler handler = new FileHandler("default.log", append);
 
        Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
        logger.addHandler(handler);
         
        String[] s = customer_.getName().split("ooo");
        logger.warning(s[0] + " change to " + s[1]);
        
        System.out.println("Update Log File: " + s[0] + " change to " + s[1]);
    }
    
}
