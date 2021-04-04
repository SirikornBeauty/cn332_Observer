/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;
import java.io.IOException;
import java.security.GeneralSecurityException;
/**
 *
 * @author sirik
 */
public class NewCustomer extends Observer{
    
    public NewCustomer(Customer customer_) {
        this.customer_ = customer_;
        this.customer_.addCustomers(this);
    }

    @Override
    public void update() throws IOException ,GeneralSecurityException {
        System.out.println("Update New Customer : " + customer_.getName());
    }
    
}
