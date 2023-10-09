package Animal;

public class Perro extends Animal{ //Herencia de la clase superior Animal

	
		//"Polimorfear" o sobreescribir el metodo heredado
	
	
		@Override //con la anotacion @Override , le decimos a Java que el metodo hacerSonido sera sobreescrito
		public void hacerSonido () {
			System.out.println("El perrito ladra y hace waos");
		}//metodo hacerSonido heredado de Animal
		

		public static void main (String[]args) {

			//Aqui NO hay polimorfisomo, ya que instancio un animal generico, y utilizo su metodo hacerSonido 
			Animal Generico = new Animal (); //Genera un animal generico (abstracto)			
			Generico.hacerSonido () ;  //sin polimorfismo, antes de la ejecucion
			
			//Generar la instancia de mi perrito
			//Si hay polimorfismo, porque es el equivalente a decir "instancio un animal que es un perrito"
			//Referenciar primero la clase general, y luego la instancia particular, permite el polimorfismo
			Animal Chilaquil = new Perro (); 
		
			Chilaquil.hacerSonido();  //con polimorfismo en tiempo de ejecucion
			
			
			
		}//metodo main
		
		
		
}//cierre clase perro
