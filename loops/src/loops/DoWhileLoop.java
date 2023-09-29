package loops;
import java.util.Scanner;
public class DoWhileLoop {
	public static void main(String[] args) {

		/*
		 * Do while. Evalua su expresion en la parte inferior del ciclo. Por lo tanto, las declaraciones dentro del bloque "do" siempre ejecutan al menos una vez. 
		 * 
		 */
		//Cuenta del 1 al 10 
		int cuenta = 1;

        // Implementar un ciclo do-while para contar del 1 al 10
        do {
        	System.out.println(cuenta);
            cuenta++;
        } while (cuenta <= 10);
    	
        /* Crear un programa para un cajero bancario
         * El programa me mostrara 4 opciónes:
         *  1. Consultar saldo
         *  2. Ingresar dinero
         *  3. Retirar dinero
         * 	4. Salir
         * Mostrar mensaje de bienvenida al usuario, darle contexto, y solicitar que elija una opción(número)
         * Mostrar al usuario la opción que eligió y permitir que elija otra opción
         * El usuario puede salir del programa escribiendo 4 (Salir)
         */
	     
        System.out.println("Bienvenido al Cajero Generation, elige cualquiera de las opciones, para ello escribe el número que corresponda: ");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        
        Scanner skner = new Scanner(System.in);
		int opcionSeleccionada;
		
		do {
			opcionSeleccionada = skner.nextInt();
		
			switch(opcionSeleccionada) {
			case 1:
				System.out.println("Consultar saldo");
				break;
			case 2:
				System.out.println("Ingresar dinero");
				break;
			case 3:
				System.out.println("Retirar dinero");
				break;
			case 4: 
				System.out.println("Salir");
				break;
				default:
					System.out.println("Elige una opción válida");
					break;
			}
		} while (opcionSeleccionada != 4);
		
		
		
			skner.close();
        	}
		
	}
