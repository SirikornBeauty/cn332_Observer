/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author sirik
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, GeneralSecurityException {
//        Scanner sc= new Scanner(System.in);   
        System.out.println("--------- What do you want to do ? ---------");
        System.out.println("1.) Add new customer");
        System.out.println("2.) Edit log file");
        System.out.println("3.) Edit google sheet");
        System.out.println("Enter a number (1-3): Change number in ObserverPattern.java at String 's'.");  
//        String s = sc.next();   //reads string before the space  
        
        String s = "1";
        System.out.println("Your input number: " + s);
        
        Customer customer_ = new Customer();
        
        System.out.println("--------------------------------------------");
        
        if (s.equals("1")) {
            new NewCustomer(customer_);
            new LogFile(customer_);
            new SheetsQuickstart(customer_);
            
//            Scanner sc1 = new Scanner(System.in);    
//            System.out.print("Enter new customer's name: ");  
//            String s1 = sc1.next();
            System.out.println("Enter new customer's name at String 's1'.");
            String s1 = "baby";
            customer_.setName(s1);
            
      
        } 
        else if (s.equals("2")) {
            new LogFileEdit(customer_);
            
//            Scanner sc1 = new Scanner(System.in);    
//            System.out.print("Enter old customer's name: ");  
//            String s1 = sc1.next();
            String s1 = "baby";
            System.out.println("Enter old customer's name at String 's1'.");
            
//            Scanner sc2 = new Scanner(System.in); 
//            System.out.print("Enter new customer's name: ");  
//            String s2 = sc2.next();
            String s2 = "bay";
            System.out.println("Enter new customer's name at String 's2'.");
            
            customer_.setName(s1 + "ooo" + s2);

        }
        else if (s.equals("3")) {
            new GoogleEdit(customer_);
            String s1 = "baby";
            System.out.println("Enter old customer's name at String 's1'.");
            
            String s2 = "bay";
            System.out.println("Enter new customer's name at String 's2'.");
            
            customer_.setName(s1 + "ooo" + s2);
        }
        else {
            System.out.println("Invalid input (Please start program again).");
        }
        
        System.out.println("--------------------------------------------");
    }
    
}
