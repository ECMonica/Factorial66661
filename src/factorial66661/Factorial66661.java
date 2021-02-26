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
        int suma=0;
        
        while (cont < 15) {
        System.out.println("Contador = " + cont);
        suma += cont;
        cont++;
        }
        System.out.println("La suma es= " + suma);
    }
    
}
