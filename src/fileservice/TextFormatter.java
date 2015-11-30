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
public interface TextFormatter {
    public abstract List <Map<String,String>> decode(String data);
    public void encode(List <Map<String,String>> data);
}
