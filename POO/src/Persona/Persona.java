package Persona;

public class Persona {

//La funcion principal del metodo main es poder ejecutar todo lo que tenga en su interior.
		
		
		
	//Atributos (info de como se mostrara mi objeto cuando se instancie)
	
	
		String nombre;
		String apellido;
		byte edad; //para tener una asignacion correcta en memoria
		String telefono;
		String email;
	
		
	//Constructor con parametros
	
		
		Persona (String nombre, String apellido, byte edad, String telefono, String email){
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.telefono = telefono;
			this.email = email;
		} //cierre constructor
		
		
	//Métodos (lo que podrá hacer mi objeto)
		void imprimirInfo() {
			System.out.println("El nombre es: " + nombre);
			System.out.println("El apellido es: " + apellido);
			System.out.println("El edad es: " + edad);
			System.out.println("El telefono es: " + telefono);
			System.out.println("El email es: " + email);
		}
		
		void saludar () {
			System.out.println("Hola, te mando saludito"); 
		}//cierre saludar

//toString
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
					+ ", email=" + email + "]";
		}
		
	//Metodo principal	
		
	
	//Instancia
		
		
		
		
		
		
	

}// cierre de POO
