/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import operaciones.Aritmetica;

/**
 *
 * @author LN710Q
 */
public class Resta implements Aritmetica{

    @Override
    public double operar(double a, double b) {
        return a-b;
    }
    
}
