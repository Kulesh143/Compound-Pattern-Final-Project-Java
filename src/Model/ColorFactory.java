/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author Thilini
 */
public class ColorFactory {

    private static HashMap<String,Color> color = new HashMap<>();

    public static Color getColor(int r, int g, int b) {

        Color c = color.get(r+""+g+""+b);
        
        if(c == null){
            c = new Color(r, g, b);
            color.put(r+""+g+""+b, c);
        }
        
        return c;
    }

}
