/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import calcu.Abstracfactoryfuncion;
import operaciones.Factoriaritmetica;
import Convertir.Factory_convert;

/**
 *
 * @author LN710Q
 */
public class Factoriproducerop {
    public static Abstracfactoryfuncion getfactorys(int tipo){
        switch(tipo){
            case 1:
              return new Factoriaritmetica();  
            case 2:
                return  new Factory_convert();
        }
        return null;
    }
    
}
