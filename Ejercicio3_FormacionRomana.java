package prt2_ana_zafra_vallejo;

import java.util.Scanner;

/**
 * Vamos a desarrollar una aplicación para simular formaciones militares para
 * una legión romana, donde automáticamente se genere un gráfico con el número
 * de soldados y el tipo de formación que elija el usuario.
 *
 * Cuando empiece el programa se le darán las instrucciones al usuario y se
 * solicitarán dos datos:
 *
 * Número de soldados: que debe ser al menos 1 (Se debe controlar que no se
 * introduzcan valores negativos obviamente). En caso contrario se vuelve a
 * pedir. 
 * 
 * Tipo de formación: Debe ser “LINEA” o “CUADRADO”(El programa debe ignorar las
 * mayúsculas y minúsculas). Se recomienda no introducir tildes en la entrada de
 * datos. Si no es una de ellas se indicará "Opción NO CORRECTA" y finalizará el
 * programa.
 *
 * 
 * En cuanto a los posibles formaciones se tendrá:
 *
 * La formación en línea dispondrá todos los soldados en la primera fila. Es
 * decir se dibujarán tantos asteriscos como número de soldados haya introducido
 * el usuario por teclado. Por tanto, debe verse al final de la ejecución, una
 * línea horizontal con tantos asteriscos como número de soldados introducidos.
 * 
 * En cuanto a la formación en cuadrado, primero se debe calcular el número de
 * filas y columnas (debe ser el mismo) máximo que se pueden representar con el
 * número de legionarios romanos introducidos (evidentemente el número de
 * soldados restantes no se representarán en la formación). Para ello haremos
 * uso de la raíz cuadrada, utilizando el método estático de la librería Math
 * (Math.sqrt()). Nota: Este método devuelve un valor double, por tanto habrá
 * que realizar una conversión de tipos. Una vez que tenemos ese valor,
 * simplemente representaremos con asteriscos (soldados o legionarios romanos),
 * tantas filas de asteriscos y columnas como necesite nuestro cuadrado. 
 * 
 * Si al hacer la mayor formación posible del tipo indicado con los soldados
 * introducidos sobran soldados, se debe indicar cuantos.
 *
 * @author Zafra Vallejo, Ana.
 */
public class Ejercicio3_FormacionRomana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        
        //DECLARACION VARIABLES
        //Entrada.
        int numeroSoldado = 0;
        String tipoFormacion;   
        
        //Auxiliares.
        int lado, sobrantes;
        
        //PROGRAMA
        System.out.println("Ejercicio03: Formacion romana a partir de un numero de soldados.");
        
        //Control de que no haya numeros negativos.
        while (numeroSoldado < 1) {
            System.out.println("Introduce el numero de elementos de la formacion (debe ser mayor que cero):");
            numeroSoldado = miEscaner.nextInt();
        }
        
        // Limpia el salto de linea que deja nextInt() en el buffer.
        miEscaner.nextLine();
        
        System.out.println("Introduce el tipo de formacion:");
        tipoFormacion = miEscaner.nextLine().toUpperCase();        
        
        switch (tipoFormacion){
            case "LINEA": 
                for (int i=0; i < numeroSoldado; i++) {
                System.out.print("* ");
                }
                System.out.println();
                break;
                
            case "CUADRADO":
                // Lado maximo del cuadrado que se puede formar.
                lado = (int) Math.sqrt(numeroSoldado);

                // Filas y columnas.
                for (int fila = 0; fila < lado; fila++) {
                    for (int columna = 0; columna < lado; columna++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                
                // Soldados que no entran en la formacion.
                sobrantes = numeroSoldado - (lado * lado);
                if (sobrantes > 0) {
                    System.out.println();
                    System.out.println("De los " + numeroSoldado + " soldados asignados, "
                            + "una vez hecha la mayor formacion posible del tipo indicado, "
                            + "sobran " + sobrantes + " soldados.");
                }
                break;

            default:
                System.out.println("Opcion NO CORRECTA");
        }
    }
}