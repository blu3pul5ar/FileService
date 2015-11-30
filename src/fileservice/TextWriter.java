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
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nicholas
 */
public class TextWriter {
       private TextFormatter t;

    public TextWriter(TextFormatter t) {
        this.t = t;
    }
    public void encode(List<Map<String,String>> data){
        t.encode(data);
    }
}

