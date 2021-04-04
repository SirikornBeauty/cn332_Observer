/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/**
 *
 * @author sirik
 */
public class Customer {
    private ArrayList<Observer> customers = new ArrayList<Observer>();
    private ArrayList<String> customerName = new ArrayList<String>();
    private String name;
    
    public ArrayList<String> getArrayList() {
        return customerName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) throws IOException, GeneralSecurityException {
        this.name = name;
        customerName.add(name);
        notifyCustomers();
    }
    
    public void addCustomers(Observer customer){
      customers.add(customer);		
   }

   public void notifyCustomers() throws IOException, GeneralSecurityException{
      for (Observer customer : customers) {
         customer.update();
      }
   }
}
