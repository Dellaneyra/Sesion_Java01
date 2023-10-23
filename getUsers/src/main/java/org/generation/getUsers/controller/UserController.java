package org.generation.getUsers.controller;

import java.util.ArrayList;

import org.generation.getUsers.model.User;
import org.generation.getUsers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *El controller se encarga de gestionar las solicitudes HTTP. Para decirle que esta clase es tipo controller, debemos importar la anotación @RestController desde spring framework.
 * La anotacion @RequestMapping nos permite construir la ruta (endpoints) de nuestra API.
 * Aqui vamos a manejar la peticion GET de la lista de usuarios, mediante la anotacion @GetMapping
 * Inyectamos dependencias utilizando @Autowired sin necesidad de recurrir a clases extendidas.
 * @RequestMapping
 * 		@GetMapping
 * 		@PostMapping
 * 		@PutMapping
 * 		@DeleteMapping
 * */

@RestController //Le digo a springboot que este es un controlador de API del tipo REST.
@RequestMapping(path = "/api/users/") //  http://localhost:8080...
public class UserController {

	//Definir una instancia de UserServices. Le digo a spring boot que voy a conectar mi UserController con mi UserService, para que el controlador sepa lo que voy a inyectar.
	
	private final UserService userService;
	
	//Crear un constructor que va a tomar mi objeto(UserService) como un argumento, y luego ese objeto se va a almacenar en una variable de tipo this. 
		//El constructor toma el objeto y luego se realiza la inyección de dependencia mendiante la anotación @Autowired
	@Autowired  
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//Debo mostrar a mi Controller lo que se puede hacer desde el Service y aqui tengo que anotar la petición @GetMapping
	@GetMapping
	public ArrayList <User> getUsers(){
		return userService.enviarUsuarios();
	}
	
}

