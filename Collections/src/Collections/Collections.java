package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	 public static void main (String [] args) {
		 
		 //Array
		 //Tipo de datos del arary, nombre, instancia del objeto arreglo, los datos
		 String [] listaDeCompras = new String [] {"Leche", "Pan", "Huevos"};
		 
		 //Esta impresion solo muestra el espacio de memoria
		 System.out.println(listaDeCompras); 
		 
		 //Impresion info de listaDeCompras con un forEach (Para el dato de tipo string que llamaremos productoAImprimir de la lista de compras, lo camos a tomar y lo vamos a imprimir
		// for (String productoAImprimir : listaDeCompras) {
		//	 System.out.println(productoAImprimir);
		// }
		 
		 //Implementacionde un arrayList
		 //Clase General ( interfaz), tipo de dato que usare, nombre de mi estructura de datos, instancia de dicha clase general
		 List<String> listadeContactos = new ArrayList <> (); 
		 
		 //Agrego elementos del tipo String a mi arrayList llamado listaDeContactos
		 listadeContactos.add("Felipe");
		 listadeContactos.add("Roberto");
		 listadeContactos.add("Alicia");
		 listadeContactos.add("Fatima");

		 //Obtener uyn elemento de la lista
		 String datoFelipe = listadeContactos.get(0);
		 System.out.println(datoFelipe);
		 
		 //Borrar un elemento de la lista
		 listadeContactos.remove(1);
		 
		 System.out.println(listadeContactos); 
		 
		 //Implementacion de un conjunto (SET)
		 //Sintaxis
		 //interfase de donde implemento + tipo de dato que usare + nombre que le doy al conjunto + instancia de la clase especifica
		 
		 Set<String> cartasDeJuego = new HashSet <>();
		 //Agregar elementos
		 cartasDeJuego.add("As de Corazonez");
		 cartasDeJuego.add("2 de picas");
		 cartasDeJuego.add("Reina de Treboles");

		 //No puedo saber posiciones, solo saber si lo contiene
		 if(cartasDeJuego.contains ("Reina de Corazonez")) {
			 System.out.println("La reina de treboles si esta en el conjunto");
		 }else {
			 System.out.println("No encuentro el elemento solicitado");
		 }
		 
		 
		 //Implementacion de un mapa (hashMap)
		 
		 Map <String, String> libretaDirecciones = new HashMap <> () ;
		 //Agregar elementos a mi libreta de direcciones
		 libretaDirecciones.put("Felipe", "Tlanepantla");
		 libretaDirecciones.put("Doctor Simi", "CDMX");
		 libretaDirecciones.put("Konoha", "Naruto");
		 
		 //Metodo para sacer la información de la libreta, creando una nueva variable
		String direccionDeFelipe = libretaDirecciones.get("Felipe");
		String direccionDeNaruto = libretaDirecciones.get("Naruto"); //null

		//Impresion
		System.out.println(direccionDeFelipe);
		System.out.println(direccionDeNaruto);

		 
		 
		 
		 
		 
		 
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
 * 
 * -Array List
 * Es una implementacion de una lista(list), es decir que esta en un nivel abajo de las listas. Utiliza un array dinámico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son: 
 * -Tamaño dinámico, a diferencia de los arrays tradicionales, el tamaño de una arrayList si se puede modificar.
 * -Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
 * -Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos. 
 * 
 * 
 * 
 * Set (conjunto)
 * Estructura de datos que almacena datos unicos sin orden especifico. Las principales caracteristicas de un set son:
 * -No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora.
 * -No hay una orden especifico, los elementos se almacenan sin orden especifico
 * -La busqueda es mas sencilla, ya que al no tener elementos duplicados se usa una funcion hash para encontrar elemento deseado. 
 * 
 * 
 * Maps (mapas) 
 * Un mapa es un estructura de datos que alamcena pares de clave-valor.
 * -Almacenamiento con pares Key y Value (K-V)
 * -Sin orden especifico (similar a un Set)
 * -Busqueda rápida, la búsqueda se hace por medio de un valor (Key) y una una funcion interna hash para buscar elementos. 
 * 
 * Agenda telefonica (agregar, modificar, eliminar)
 * 
 * 
 * 
 * */
