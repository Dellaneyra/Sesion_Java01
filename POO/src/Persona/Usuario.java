package Persona;

public class Usuario {

	//Atributo
	private String tipoUsuario;
	private String username;
	private String password;

	//Crear un nuevo usuario (constructor)
	public Usuario(String tipoUsuario, String username, String password) {
		this.tipoUsuario = tipoUsuario;
		this.username = username;
		this.password = password;
	}//constructor

	//Recuperar contraseña (getter)
	public String getPassword() {
		//si el usuario registrado coincide con el usuario que paso como paramétro, entonces obtengo la contraseña
		return password;
	}//getter


	//Cambiar contaseña (setter)
	public  void setPassword(String nuevoPassword) {
		//Si la nueva contraseña es diferente a una cadena vacía y es diferente a la contraseña anterior... 
		if(nuevoPassword != "" && nuevoPassword != password) {
			//.. entonces reemplazo la contraseña anterior
			password = nuevoPassword;
			System.out.println("Contaseña cambiada correctamente");
		}else {
			System.out.println("Lo siento, no puedo cambiar la contaseña");
		}
	}//setter


	//Cambiar la constraseña de un objeto del tipo usuario
	//Felipe.setPassword (una donde la contrseña esté vacía)
	//Felipe.setPassword (una donde la contraseña no esté vacía pero sea igual a la anterior)
	//Felipe.password (se cumplan las dos condiciones)



}//class
