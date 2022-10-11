
package manejoexcepciones;

import static aritmetica.Aritmetica.division;

/**
 *
 * @author jonat
 */
public class ManejoExcepciones {

    public static void main(String[] args) {
        int resul = 0;
        
        /*
        Ex
        */
        try {
            resul = division(10, 0);
        } catch (Exception e) {
            //Imprime todo el cojunto de exepciones
            e.printStackTrace(System.out);
        }
    }
    
}
