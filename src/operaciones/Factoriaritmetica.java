/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import Convertir.Convertir;
import calcu.Abstracfactoryfuncion;
import Convertir.Factory_convert;
import operaciones.Dividir;
import operaciones.Multiplicacion;
import operaciones.Resta;
import operaciones.Suma;
import operaciones.Aritmetica;

/**
 *
 * @author LN710Q
 */
public class Factoriaritmetica implements Abstracfactoryfuncion{

   

    @Override
    public Aritmetica getaritmetica(int opcion) {
        switch(opcion){
            case 1:
                return new Suma();
            case 2:
                return new Resta();
            case 3: 
                return new Multiplicacion();
            case 4:
                return new Dividir();
            default:
                return null;
               
        }
    }

    @Override
    public Convertir getconvert(int opcion) {
        return null;
    }
    
}
