/*
 * Lenguajes de programación I
 * Facultad de Ingeniería
 * Universidad Autónoma de Campeche
 */
package factorial66661;

/**
 *
 * @author Monica Ehuan Cisneros
 */
public class Factorial66661 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cont=1;
        int multi=1;
        
        while (cont < 15) {
        System.out.println("Contador = " + cont);
        multi *= cont;
        cont++;
        }
        System.out.println("La multiplicación es= " + multi);
    }
    
}
