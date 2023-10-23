package org.generation.getUsers.service;

import java.util.ArrayList;

import org.generation.getUsers.model.User;
import org.springframework.stereotype.Service;

/*Haremos dos cosas
1. Emular la base de datos mediante un Arraylist el cual nos servira para realizar la consulta
2.Definir las operaciones del CRUD (create, read, update, delete)En este caso solo utilizaremos read(GET)

*Para definir que una clase es un servicio, utilizamos la anotación @Service e importamos desde spring framework
*/


@Service 
public class UserService {
	//1.Crear una lista de objetos, y debe contener los atributos definidos en model. Para ello inicializo una variable de tipo constante.
	
	public final ArrayList <User> listaUsuarios = new ArrayList<User>();
	
	//Instanciando usuarios y agregandolas a mi lista en un metodo
	public UserService() {
		listaUsuarios.add(new User(1L, "Daniel", "Maldonado", "Tabasco", "daniel@gmail.com", "99333333"));
		listaUsuarios.add(new User(2L, "Angel", "Torres", "Guadalajara", "pp.angel@gmail.com", "477-55122115"));
		listaUsuarios.add(new User(3L, "Kenia", "Montalvo", "Nuevo León", "kenia@gmail.com", "1234569878"));
		listaUsuarios.add(new User(4L, "Brandon", "Palacios", "Hidalgo", "brandon@mail.com", "7751234567") );
		listaUsuarios.add(new User(5L, "Alejandra", "Piedra", "Yucatán", "ale@gatito.com", "9933720000"));
		listaUsuarios.add(new User(6L, "Antonio", "Salcido", "Guadalajara, Jal", "antonio@mail", "7755664411"));
		listaUsuarios.add(new User(7L, "Alicia", "Diaz", "Guadalajara", "alicia@mail.com", "3411234567") );
		listaUsuarios.add(new User(8L, "Ernesto", "Santillan", "Guadalajara", "skjadhasd@mail.com", "5534756976"));
		listaUsuarios.add(new User(9L, "Carolina", "Herrera", "Michoacan", "ankareta@gmail.com", "3531234567"));
		listaUsuarios.add(new User(10L, "Luis Miguel", "Gallego", "Miami", "elsol@gmail.com", "1785256215"));
	}
	
	//Métodos CRUD para poder iterar sobre nuestros usuarios 
	
	/*CRUD operaciones que permiten manipular la informacioln.
	 *C (create) Crear algo     POST para mandarlo al servidor.
	 *R (read) Leer algo        GET para recibirlo desde el servidor.
	 *U (update) Actualizar     PUT para modificar/actualizar lo que existe en el servidor.
	 *D (delete) Borrar algo    DELETE para borrar algo de nuestro servidor.
	 * */
	
	//Metodo que permita retornar (enviar) todos los usuarios al controller. 
	public ArrayList <User> enviarUsuarios(){
		return listaUsuarios; 
	}

	
	
	
}







