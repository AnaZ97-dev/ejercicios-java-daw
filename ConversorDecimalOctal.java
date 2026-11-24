package ex1y2_ana;

import java.util.Scanner;

/**
 * Desarrolla una aplicación en Java que permita convertir un número decimal
 * introducido por el usuario a su equivalente en sistema octal. La aplicación
 * deberá solicitar al usuario que introduzca un número decimal positivo y luego
 * mostrar el resultado de la conversión a octal
 *
 * @author Zafra Vallejo, Ana
 */
public class ConversorDecimalOctal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //DECLARACION VARIABLES
        //Entrada.
        Scanner miEscaner = new Scanner(System.in);
        int numero;
        
        //Salida
        String equivalenteOctal = "";
        
        
        //PROGRAMA
        System.out.print("Introduce un numero decimal positivo: ");
        numero = miEscaner.nextInt();
        
        //PROCESO
        if (numero > 0) {
            int cociente = numero;
            
            while (cociente > 0) {
                equivalenteOctal = (cociente % 8) + equivalenteOctal;
                cociente = cociente / 8;
            }
            
        //SALIDA
        System.out.println(numero + " en base decimal es " + equivalenteOctal + " en base octal.");

        } else {
            System.out.println("Error. Necesitas un numero decimal positivo.");
        }
        
        miEscaner.close();
        System.out.println("\nFin del programa.");
    }

}
