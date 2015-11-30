/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Nicholas
 */
public class NicksAwesomeFormatter implements TextFormatter{

    @Override
    public List<Map<String, String>> decode(String data) {
        String [] pieces = data.split(" ");
        
    }

    @Override
    public void encode(List<Map<String, String>> data) {
       
    }
    
}
