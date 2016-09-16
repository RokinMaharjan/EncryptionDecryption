/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.encryptiondecryption.process;

import com.rokin.encryptiondecryption.filehelper.FileHelper;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rokin
 */
public class Decryption {
    Scanner input = new Scanner(System.in);
    
    public void decryptMessage() throws IOException
    {
        
        System.out.println("Enter the file path");
        String filePath = input.next();
        
        FileHelper fileHelper = new FileHelper();
        String fileContent = fileHelper.readFile(filePath);
        
        char[] fileCharArray = fileContent.toCharArray();
        
        System.out.println("Enter encryption key");
        int encryptionKey = input.nextInt();
        
        for(int i=0; i<fileCharArray.length; i++)
        {
            fileCharArray[i] = (char) ((int) fileCharArray[i] - encryptionKey);
            //System.out.println(fileCharArray[i]);
        }
        
        fileContent = new String(fileCharArray);
        
        fileHelper.writeFile(fileContent, filePath);
        
        System.out.println("File Decrypted Successfully!");
    }
}
