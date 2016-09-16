/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.encryptiondecryption;

import com.rokin.encryptiondecryption.controller.Controller;
import com.rokin.encryptiondecryption.process.Decryption;
import com.rokin.encryptiondecryption.process.Encryption;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rokin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try {
           
            Controller controller = new Controller();
            controller.menu();
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
