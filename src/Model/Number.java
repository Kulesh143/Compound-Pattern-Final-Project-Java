/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Number implements Expressions{
   
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return this.number;
    }
 
}
