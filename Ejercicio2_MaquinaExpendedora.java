package prt2_ana_zafra_vallejo;

import java.util.Scanner;

/**
 * Vamos a programar el sistema de control de una máquina expendedora de
 * bebidas. Para ello, la máquina informará al usuario de las bebidas de que
 * dispone así como su precio a través de un menú de opciones (de valores
 * enteros). Se solicita al usuario el número del menú correspondiente a la
 * bebida elegida.
 * 
 * Debe existir una opción “0” para salir. Mostrando el mensaje de despedida
 * "Gracias por usar la Máquina Expendedora. ¡Hasta luego!" y no haciendo nada
 * más.
 * 
 * Si la opción elegida por el usuario no es correcta se debe volver a
 * mostrar el menú de opciones y solicitar una nueva opción. 
 * 
 * Si la opción seleccionada es válida, el usuario introducirá una cantidad de
 * dinero para realizar el pago de la bebida seleccionada. Si la cantidad de
 * dinero es inferior al precio se mostrará el mensaje: “Dinero insuficiente. Su
 * dinero será devuelto.” y el programa finalizará. Si la cantidad de dinero es
 * igual o superior al precio se calculará la diferencia entre la cantidad
 * introducida y el precio de la bebida. Se informará del cambio devuelto y el
 * programa finalizará. El cambio devuelto debe tener dos decimales
 * obligatoriamente, pues representa euros y céntimos de euro.
 *
 * @author Zafra Vallejo, Ana. 
 */
public class Ejercicio2_MaquinaExpendedora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        
        //DECLARACION VARIABLES
        //Entrada. 
        int opcion;
        double dinero;
        
        //Auxiliares.
        final double COCA_COLA = 1.50, PEPSI = 1.50, AGUA = 1.00, ZUMO_NARANJA = 2.00;
        
        //PROGRAMA
        System.out.println("Ejercicio 2: Maquina expendedora de Bebidas");
        System.out.println("");
        System.out.println("Bienvenido a la Maquina Expendedora de Bebidas");
        System.out.println("Seleccione una bebida:");
        System.out.println("1. COCACOLA - 1.50€");
        System.out.println("2. PEPSI - 1.50€");
        System.out.println("3. AGUA - 1.00€");
        System.out.println("4. ZUMO de naranja - 2.00€");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.println("Seleccione una opcion:");
        opcion = miEscaner.nextInt();
        System.out.println("");
        
        switch(opcion){
            case 1:
                 System.out.println("Ha seleccionado una COCACOLA. El precio es 1,50 €");
                 System.out.println("Ingrese la cantidad de dinero en euros: ");
                 dinero = miEscaner.nextDouble();
                 if (dinero > COCA_COLA){
                     System.out.println("Compra exitosa. Su cambio es: " + (dinero - COCA_COLA));
                     System.out.println("Disfrute su COCACOLA!");
                 } else {
                    System.out.println("Dinero insuficiente. Su dinero sera devuelto.");
                 }
                 break;
            case 2:
                 System.out.println("Ha seleccionado una PEPSI. El precio es 1,50 €");
                 System.out.print("Ingrese la cantidad de dinero en euros: "); 
                 dinero = miEscaner.nextDouble();
                 if (dinero > PEPSI){
                     System.out.println("Compra exitosa. Su cambio es: " + (dinero - PEPSI));
                     System.out.println("Disfrute su PEPSI!");
                 } else {
                    System.out.println("Dinero insuficiente. Su dinero sera devuelto.");
                 }
                 break;
            case 3:
                 System.out.println("Ha seleccionado una AGUA. El precio es 1,00 €");
                 System.out.print("Ingrese la cantidad de dinero en euros: ");
                 dinero = miEscaner.nextDouble();
                 if (dinero > AGUA){
                     System.out.println("Compra exitosa. Su cambio es: " + (dinero - AGUA));
                     System.out.println("Disfrute su AGUA!");
                 } else {
                    System.out.println("Dinero insuficiente. Su dinero sera devuelto.");
                 }
                 break;
            case 4:
                 System.out.println("Ha seleccionado un ZUMO DE NARANJA. El precio es 2,00 €");
                 System.out.print("Ingrese la cantidad de dinero en euros: ");
                 dinero = miEscaner.nextDouble();
                 if (dinero > ZUMO_NARANJA){
                     System.out.println("Compra exitosa. Su cambio es: " + (dinero - ZUMO_NARANJA));
                     System.out.println("Disfrute su ZUMO DE NARANJA!");
                 } else {
                    System.out.println("Dinero insuficiente. Su dinero sera devuelto.");
                 }
                 break;
            case 0:
                 System.out.println("Gracias por usar la Maquina Expendedora. ¡Hasta luego!");
                 break;
            default: 
                 System.out.println("Opcion no valida. Seleccione una bebida valida.");              
        }
        
        miEscaner.close();
        
    }

}
