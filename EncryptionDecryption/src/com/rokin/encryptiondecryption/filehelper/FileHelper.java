/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.encryptiondecryption.filehelper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rokin
 */
public class FileHelper {
    
    
    public String readFile(String filePath) throws IOException
    {
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
        StringBuilder fileContent = new StringBuilder();
        String line = "";
        while((line= fileReader.readLine()) != null)
        {
            fileContent.append(line);
        }
        fileReader.close();
        return fileContent.toString();
    }
    
    
    
    public void writeFile(String fileContent, String filePath) throws IOException
    {
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath));
        fileWriter.write(fileContent);
        fileWriter.close();
    }
}
