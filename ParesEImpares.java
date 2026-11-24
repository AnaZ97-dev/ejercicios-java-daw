package ex1y2_ana;

/**
 * Recorra los números del 10 al 60 (ambos incluidos).
 *
 * El programa debe calcular la suma de los números pares y la multiplicación de
 * los números impares que se encuentren dentro del rango.
 *
 * Al finalizar, mostrará por pantalla el resultado final de ambas operaciones.
 *
 * @author Zafra Vallejo Ana
 */
public class ParesEImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //DECLARACION VARIABLES
        int sumaPares = 0;
        long multiplicacionImpares = 1;

        //PROCESO
        for (int i = 10; i <= 60; i++) {
            if (i % 2 == 0) {
                sumaPares = sumaPares + i;
            }
            if (i % 2 != 0){
                multiplicacionImpares = multiplicacionImpares * i;
            }
        }

        //SALIDA
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Multiplicacion de impares: " + multiplicacionImpares);
        
        System.out.println("\nFin del programa.");
    }

}
