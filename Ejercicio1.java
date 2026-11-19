package tarea1;

import java.util.Scanner;

/**
 * Ejercicio 1. Cálculo de expresiones físicas/matemáticas.
 * 
 * @author profesor
 */
public class Ejercicio1 {
    
    // Definicion del enum que contiene los nombres de las expresiones a calcular
    // Al no ser declarado como public, se considera package-private (solo accesible dentro del mismo paquete.).
    enum Expresiones {
        OPERACION,
        FUERZA_PESO,
        NUMERO_VUELTAS,
        AREA_CIRCULO
    }

    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        final float FUERZA_GRAVEDAD = 9.8f;
        final double NUMERO_PI = 4.0 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0);  // Aproximación usando la serie de Leibniz con 5 términos
       
        // Variables de entrada
        int valorX, masa, tiempo;
        float frecuencia, radio;

        // Variables de salida
        int numVueltas;
        double operacion, fuerzaPeso, areaCirculo;

        // Variables auxiliares
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS");
        System.out.println("------------------------------------");
        
        System.out.print("Introduce el valor de X: ");
        valorX = teclado.nextInt();
        
        System.out.print("Introduce la masa (kg): ");
        masa = teclado.nextInt();
        
        System.out.print("Introduce el tiempo (s): ");
        tiempo = teclado.nextInt();

        System.out.print("Introduce la frecuencia (hz): ");
        frecuencia = teclado.nextFloat();
        
        System.out.print("Introduce el radio del círculo (m): ");
        radio = teclado.nextFloat();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Operacion matemática
        operacion = (valorX + valorX / 4.0) / (6.00 - valorX / 2.00);   // CASTING IMPLÍCITO: int a double

        // Peso = masa * gravedad
        fuerzaPeso = masa * FUERZA_GRAVEDAD;        // CASTING IMPLÍCITO: int a float y float a double

        // Número de vueltas completas (truncado) = frecuencia * tiempo
        numVueltas = (int)(frecuencia * tiempo);    // CASTING EXPLICITO: float a int 

        // Área de un círculo = PI * r^2
        areaCirculo = NUMERO_PI * (radio * radio); // CASTING IMPLÍCITO: float a double

               
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADOS");
        System.out.println("----------");
        System.out.println(Expresiones.OPERACION + ": " + operacion);
        System.out.println(Expresiones.FUERZA_PESO + ": " + fuerzaPeso);
        System.out.println(Expresiones.NUMERO_VUELTAS + ": " + numVueltas);
        System.out.println(Expresiones.AREA_CIRCULO + ": " + areaCirculo);
    }
}