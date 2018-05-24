
package calcu;

import Convertir.Convertir;
import operaciones.Aritmetica;

/**
 *
 * @author mery acevedo
 */
public interface Abstracfactoryfuncion {
    
    Aritmetica getaritmetica(int opcion);
    Convertir getconvert(int opcion);
    
}
