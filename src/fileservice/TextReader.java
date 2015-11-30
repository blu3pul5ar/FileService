/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nicholas
 */
public class TextReader {
    private TextFormatter t;

    public TextReader(TextFormatter t) {
        this.t = t;
    }
    
    public List<Map<String,String>>readFile(File data){
         BufferedReader in = null;
         String whole = "";
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		 whole += line + "\n";
		  line = in.readLine();
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! couldn't read this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        return t.decode(whole);
    }
   
    
    
}
