package flujoControl;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Diente Feliz");
        System.out.print("Por favor, ingrese su edad: ");

        int edad = scanner.nextInt();

        // Usar el operador ternario para determinar si el paciente es elegible
        String mensajito = (edad >= 18 && edad <= 65)
                ? "Usted es elegible para nuestros tratamientos dentales."
                : "Lo sentimos, por el momento nuestros tratamientos no están disponibles para su edad.";

        System.out.println(mensajito);

        scanner.close();
    }
}

	
	/*
	 	int edad = 15;
	 	
        if (edad >= 18 && edad <= 65) {
            System.out.println("Puede elegir entre uno de nuestros tratamientos dentales.");
        } else if (edad < 18) {
            System.out.println("Lo sentimos, nuestros tratamientos están disponibles solo para pacientes mayores de 18 años.");
        } else {
            System.out.println("Lo sentimos, nuestros tratamientos están disponibles solo para pacientes menores de 65 años.");
        } 
        
     */ 
        
