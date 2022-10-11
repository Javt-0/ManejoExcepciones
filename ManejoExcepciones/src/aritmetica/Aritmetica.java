
package aritmetica;

import excepciones.OperacionesExcepciones;

/**
 *
 * @author jonat
 */
public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionesExcepciones{
        if(denominador == 0){
            throw new OperacionesExcepciones("Division entre cero");
        }
        return numerador/denominador;
    }
}
