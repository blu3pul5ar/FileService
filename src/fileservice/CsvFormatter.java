/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nicholas
 */
public class CsvFormatter implements TextFormatter{
    

    @Override
    public List<Map<String, String>> decode(String data) {
        List<Map<String, String>> records = new ArrayList<>();
        
        String[] lines = data.split("\\n");
        String[] header = lines[0].split(",");
        for (int i = 1; i < lines.length; i++) {
            LinkedHashMap<String, String> record = new LinkedHashMap<>();
            String[] row = lines[i].split(",");
            for (int j = 0; j < row.length; j++) {
                record.put(header[j], row[j]);
            }
            records.add(record);
        }
        return records;
        
    }
    @Override
     public void encode(List <Map<String,String>> data){
         
     }
    
}

