/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

/**
 *
 * @author Nicholas
 */
  import java.io.*;
import java.util.*;
public class FileService {
    private TextReader r;
    private TextWriter w;

    public FileService(TextReader r, TextWriter w) {
        this.r = r;
        this.w = w;
    }
    
    public List<Map<String,String>> readFile(File file) throws IOException{
        return r.readFile(file);
    }
     
}
