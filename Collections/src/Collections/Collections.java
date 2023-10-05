package Collections;

public class Collections {
	 public static void main (String [] args) {
		 
		 //Array
		 //Tipo de datos del arary, nombre, instancia del objeto arreglo, los datos
		 String [] listaDeCompras = new String [] {"Leche", "Pan", "Huevos"};
		 
		 //Esta impresion solo muestra el espacio de memoria
		 System.out.println(listaDeCompras); 
		 
		 //Impresion info de listaDeCompras con un forEach (Para el dato de tipo string que llamaremos productoAImprimir de la lista de compras, lo camos a tomar y lo vamos a imprimir
		 for (String productoAImprimir : listaDeCompras) {
			 System.out.println(productoAImprimir);
		 }
		 
		 
		 
		 
		 
	 }//metodo main


}//Collections 


/*
 * Colecciones 
 * 
 * 
 * 
 * 
 * -Arrays (arreglos)
 * 
 * Es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos estan almacenados de forma contigua (uno al lado de otro), y se puede aaceder a ellos a traves de un indice. Las principales caracteristicas de un array son: 
 * -Es una estructura de datos fija, generalmente almacena datos del mismo tipo.
 * -La longitud de un array se establece al momento de crearlo, y no lo cambia.
 * -Podemos acceder a elementos por medio de un indice.
 * -Los arrays pueden contener datos primitivos y objetos. 
 * -No proporciona metodos adicionales para agregar o eliminar elementos. 
 * 
 * Un ejemplo de array es una lista de compras del supermercado.
 * 
 * */
