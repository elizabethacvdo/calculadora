/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertir;

import operaciones.Aritmetica;
import calcu.Abstracfactoryfuncion;

/**
 *
 * @author LN710Q
 */
public class Factory_convert implements Abstracfactoryfuncion {

    @Override
    public Aritmetica getaritmetica(int a) {
        return null;
    }

    @Override
    public Convertir getconvert(int num) {
        switch(num){
            case 1 :
                return new binario();
            default:
                return null;
        }
    }
    
}
