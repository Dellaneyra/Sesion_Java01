package flujoControl;

public class EstructurasDeControl {  //Debe coincidir la clase 

	public static void main(String[] args) { //Todo dentro del metodo main
		
//Recordar que para que algo se ejecute siempre debe ir dentro del metodo principal 		
		
		//Primero vamos a definir una variable del tipo String donde almacenaremos un dato
		String citaProgramada = null; //Dejamos en Null,  y despues lo cambiamos a un fecha "28-09-23"
		//La variable declarada, se inicia en null a proposito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		if (citaProgramada != null) {
			System.out.println("Ya hay una cita programada."); //Porque la variable ya esta ocupada
		}else {
			System.out.println("Puede registrar su cita"); //Podemos registrar otra cita o una cita
		}
				
////////////////////////////////////////////////////////////////////////////////////////////
		//Seleccionando una opcion y almacenando la variable opcion
		int opcion = 2;
		//creamos un menu
		System.out.println("Menú del Diente Feliz Consultorio Dental"); 
		System.out.println("1. ¿Desea programar una cita?"); 
		System.out.println("2. Verificar cita programada"); 
		System.out.println("3. Cancelar cita"); 
		System.out.println("4. Salir del menú"); 
		System.out.print("Seleccione una opción del menú (1-4): "); 
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la opcion programar cita"); //Agrega la logica para programar una cita
			break;
		case 2:
			System.out.println("Usted a seleccionado verificar cita");
			break;
		case 3:
			System.out.println("Usted a seleccionado la opcion de cancelar cita"); 
			break;
		case 4:
			System.out.println("Usted ha seleccionado la opción salir del menú"); 
			break;
		default: 
			System.out.println("La opcion que usted seleccionó no es valida. Por favor, seleccione una opcion de nuestro menú (1-4)."); 
			break;

		}// cierre de switch
		
		
		
		
	} //cierre de metodo

} // cierre de clase
