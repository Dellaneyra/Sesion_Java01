package Persona;

public class Usuario {

	
	//Atributo
	private String tipoUsuario;
	private String username;
	private String password;
	
	//Crear un nuevo usuario (constructor)
	 public Usuario (String tipoUsuario, String username, String password) {
		 this.tipoUsuario = tipoUsuario;
		 this.username = username;
		 this.password = password;
	 }
	
	
	//Recuperar contraseña (getter)
	public String getPassword() {
		//Si el usuario registrado coincide con el usuario que paso como parametro, entonces obtengo la contraseña
		return password;
	}
	
	
	//Cambiar contraseña (setter)
	public void setPassword(String nuevoPassword) {
		//Si la contraseña es diferente a una cadena vacia y es diferente a la contraseña anterior...
		if(nuevoPassword !="" && nuevoPassword != password) {
			//...entonces reemplazo la contraseña anterior
			password = nuevoPassword;
		} else {
			System.out.println("Lo siento, no puedo cambiar la contraseña");
		}
	}
	
	
	//Cambiar la contraseña de un objeto del tipo usuario
	//Felipe.setpassword (donde la contraseña este vacía)
	//Felipe.setpassword (donde la contraseña no este vacia pero sea igual a la anterioro)
	//Felipe.setpassword (donde se cumplan las 2 condiciones)
	
	
	
	
	
	
	
}// class usuario
