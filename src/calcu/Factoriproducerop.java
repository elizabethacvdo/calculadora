/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

/**
 *
 * @author LN710Q
 */
public class Factoriproducerop {
    public static Factoryfuncio getfactory(int tipo){
        switch(tipo){
            case 1:
              return new Factoriaritmetica();  
            case 2:
                return  new convert();
        }
        return null;
    }
    
}
