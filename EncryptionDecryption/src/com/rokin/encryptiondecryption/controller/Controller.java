/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.encryptiondecryption.controller;

import com.rokin.encryptiondecryption.process.Decryption;
import com.rokin.encryptiondecryption.process.Encryption;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rokin
 */
public class Controller {
    
    Scanner input = new Scanner(System.in);
    
    public void menu() throws IOException
    {
        while(true)
        {
            System.out.println("1. Encrypt File");
            System.out.println("2. Decrypt File");
            System.out.println("Enter your choice [1-2]");

            switch(input.nextInt())
            {
                case 1:
                {
                    Encryption encryption = new Encryption();
                    encryption.encryptMessage();
                    break;
                }

                case 2:
                {
                    Decryption decryption = new Decryption();
                    decryption.decryptMessage();
                    break;
                }

                default:
                {
                    System.out.println("Invalid choice");
                    break;
                }
            }
            
            System.out.println("Continue? (Y/N)");
            if(input.next().equalsIgnoreCase("N"))
            {
                System.exit(0);
            }
        }
    }
}
