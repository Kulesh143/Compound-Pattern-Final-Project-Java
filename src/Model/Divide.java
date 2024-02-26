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
public class Divide implements Expressions{
private Expressions ex1, ex2;

    public Divide(Expressions ex1, Expressions ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    @Override
    public int interpret() {

        return ex1.interpret() / ex2.interpret();
    }
}