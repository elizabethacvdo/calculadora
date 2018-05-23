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
public class Factoriaritmetica implements Factoryfuncio{

   

    @Override
    public Aritmetica getaritmetica(int opcion) {
        switch(opcion){
            case 1:
                return new Suma();
               
        }
    }

    @Override
    public convert getconvert(int opcion) {
    }
    
}
