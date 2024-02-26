/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Thilini
 */
public class Emoji {
    
    int x;
    int y;
    Color color;
    String type;

    public Emoji(int x, int y, Color color, String type) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = type;
    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        if (this.type.equals("Circle")) {
            g.fillOval(x, y, 50, 50);
        } else if(this.type.equals("Rectangle")) {
            g.fillRect(x, y, 50, 50);
        }

        g.setColor(Color.black);
        g.fillOval(x + 10, y + 10, 10, 10);
        g.fillOval(x + 30, y + 10, 10, 10);
        g.fillOval(x + 15, y + 25, 20, 15);
    }
}
