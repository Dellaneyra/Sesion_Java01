package org.generation.amenzon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  //nos permite establecer la java class como entidad para conectarnos con la DB 
@Table (name="clients") //me indica a que tabla de la DB se va a conectar 
public class Client {
	@Id // me define mi puno de entrada (PK) para que spring boot sepa donde inicia la conexion de mi variable con la columna de la tabla 
	@GeneratedValue(strategy = GenerationType. IDENTITY)// permite generar valores de manera automatica
	@Column(name="id_client", unique=true, nullable=false)
	private Long id;
	private String firstName, lastName, address, email, phone;

	//Constructor vacío
	public Client () {
		
	}
	
	
	
	
	
	
	//Constructor
	public Client(Long id, String firstName, String lastName, String address, String email, String phone) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	
	//Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	//ToString
	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", email=" + email + ", phone=" + phone + "]";
	}
	
}
