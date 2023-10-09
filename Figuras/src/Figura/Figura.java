//Vamos a usar clases abstractas para evitar las instanciacion de objetos que no necesito 
//(generalmente son objetos muy abstractos, como Persona, Figura, Transporte, Animal, Comida, Arte, Operaciones Matematicas, Lecturas, Ropa, Plantas, Paises, etc)

package Figura;

//utlizando clases abstractas evitamos las instancias no necesarias 

//Para que una clase se vuelva abstracta, usamos la palabra reservada abstract antes de class 
public abstract class Figura {
	
	//Declaramos un metodo abstracto (no tiene cuerpo)
	//Metodo abstracto que nos dice QUE TENEMOS QUE HACER , pero NO NOS DICE EL COMO. 
	public abstract double calcularArea ();
	
	
	

}//Cierre clase figura

/**
 * NOTA: Las clases abstractas pierden la capacidad de instanciar
 * 
 * Una clase abstracta, necesita si o si metodos abstractos
 * 
 * Cuando usamos clases abstractas, estamos "obligados" a utilizar todos los metodos abstractos
 * 
 */