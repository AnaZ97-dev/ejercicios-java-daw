package tarea1;

import java.util.Scanner;

/**
 * Ejercicio 2. Uso de cadenas.
 *
 * @author profesor
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Variables de entrada        
        String cadena = "  Don Quijote de la Mancha  ";

        // Variables de salida
        int longitudCadena;
        char caracterIntermedio;
        boolean contieneM, terminaConsonante;
        
        // Variables auxiliares
        char caracterGrupo, ultimoCaracter;
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("USO DE CADENAS DE CARACTERES");
        System.out.println("----------------------------");
        System.out.print("Introduzca la letra del grupo al que perteneces: ");
        
        caracterGrupo = teclado.nextLine().charAt(0);
        
        System.out.println("Cadena original: " + cadena);

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Elimina los espacios al comienzo y al final de la cadena
        cadena = cadena.trim();
        
        // Elimina Don Quijote
        cadena = cadena.substring(11);
        
        // Sustituye la 'M' de la palabra Mancha por una 'L'
        cadena = cadena.replace('M', 'L');
        
        // Añade al final de la cadena un guion seguido del caracter con la letra del grupo al que perteneces (sin utilizar metodos)
        cadena = cadena + "-" + caracterGrupo;
        
        // Obten la longitud de la cadena resultante de aplicar las operaciones anteriores
        longitudCadena = cadena.length();
        
        // Obten el caracter que se encuentra en la posición central de la cadena
        caracterIntermedio = cadena.charAt(longitudCadena / 2);
            
        // Comprueba si la cadena contiene el caracter 'M'
        contieneM = cadena.contains("M");
        
        // Comprueba si la cadena termina en consonante (sin utilizar metodos)
        ultimoCaracter = cadena.toLowerCase().charAt(longitudCadena - 1);
        terminaConsonante = ultimoCaracter >= 'b' && ultimoCaracter <= 'd'
                || ultimoCaracter >= 'f' && ultimoCaracter <= 'h'
                || ultimoCaracter >= 'j' && ultimoCaracter <= 'n'
                || ultimoCaracter >= 'p' && ultimoCaracter <= 't'
                || ultimoCaracter >= 'v' && ultimoCaracter <= 'z'
                || ultimoCaracter == 'ñ';

        //----------------------------------------------
        //              Salida de resultados
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADOS");
        System.out.println("----------");
        System.out.println("La cadena final es: " + cadena);
        System.out.println("La cadena final contiene: " + longitudCadena + " caracteres");
        System.out.println("La cadena final tiene el caracter: " + caracterIntermedio + " en su posicion central");
        System.out.println("La cadena final contine el caracter 'M' :" + (contieneM ? " SI" : " NO"));
        System.out.println("La cadena final termina en consonante :" + (terminaConsonante ? " SI" : " NO"));
    }
}