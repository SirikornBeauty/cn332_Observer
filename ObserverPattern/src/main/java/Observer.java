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
public abstract class Observer {
    Customer customer_;
    public abstract void update()throws IOException,GeneralSecurityException ;
}
