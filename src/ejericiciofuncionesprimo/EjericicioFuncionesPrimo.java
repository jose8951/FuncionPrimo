/*
 * El programa mostrará una lista de todos los números primos 
 * que hay comprendidos entre 1 y 1000
 */
package ejericiciofuncionesprimo;

public class EjericicioFuncionesPrimo {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    
    public static boolean esPrimo(int n) {
        boolean esprimo = true;
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                esprimo = false;
            }
            i++;
        }
        return esprimo;
    }
}
