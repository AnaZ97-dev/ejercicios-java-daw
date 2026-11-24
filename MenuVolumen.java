package ex1y2_ana;

import java.util.Scanner;

/**
 * Crea una aplicación en Java llamada “MenuVolumen” que muestre un menú de
 * opciones para realizar el cálculo de volúmenes de tres figuras geométricas.
 * Dicho menú permitirá al usuario seleccionar la figura de la cual quiere
 * calcular el volumen. Aquí tienes una descripción del programa:
 *
 * @author Zafra Vallejo, Ana.
 */
public class MenuVolumen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //DECLARACION DE VARIABLES
        //Entrada.
        Scanner miEscaner = new Scanner(System.in);
        int opcion;
        double lado, radioCilindro, altura, radioEsfera;
        double cubo, cilindro, esfera;

        //Constantes
        final double PI = 3.1415d;

        //Auxiliar
        double radioEsferaElevado3;

        //PROGRAMA
        do {

            System.out.println("\nElige una opcion: ");
            System.out.println("1. Volumen de un cubo");
            System.out.println("2. Volumen de un cilindro");
            System.out.println("3. Volumen de una esfera");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = miEscaner.nextInt();

            //PROCESO
            switch (opcion) {
                case 1:
                    System.out.print("\nIntroduce el lado del cubo: ");
                    lado = miEscaner.nextDouble();

                    //PROCESO
                    cubo = lado * lado * lado;

                    //SALIDA
                    System.out.println("El volumen del cubo es : " + cubo);
                    break;

                case 2:
                    System.out.print("\nIntroduce el radio del cilindro: ");
                    radioCilindro = miEscaner.nextDouble();
                    System.out.print("Introduce la altura del cilindro: ");
                    altura = miEscaner.nextDouble();

                    //PROCESO
                    cilindro = PI * radioCilindro * radioCilindro * altura;

                    //SALIDA
                    System.out.println("El volumen del cilindro es : " + cilindro);
                    break;

                case 3:
                    System.out.print("\nIntroduce el radio de la esfera: ");
                    radioEsfera = miEscaner.nextDouble();

                    //PROCESO
                    radioEsferaElevado3 = radioEsfera * radioEsfera * radioEsfera;

                    esfera = (4.0 / 3) * PI * radioEsferaElevado3;

                    //SALIDA
                    System.out.println("El volumen de la esfera es : " + esfera);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("\nError. Introduce un numero correcto.");

            }

        } while (opcion != 4);

        miEscaner.close();
        System.out.println("\nFin del programa.");

    }
}
