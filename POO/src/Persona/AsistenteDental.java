package Persona;

public class AsistenteDental {

	//1 Atributos
	private String fechaIngreso;
	private double salario;
	
	//2 Constructor
	public AsistenteDental (String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}
	
	
	//3 Metodos
	//Metodo para imprimir informacion
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}
	
	
	//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos.
	//Sin getters, la informacion me aparece en null
	//Sin setters, no puedo cambiar la información
	
	//Este getter permite retornar el dato de la fecha de ingreso en formato String
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	//
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	//Getter para salario
	public double getSalario() {
		return salario;
	}

	//setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if (nuevoSalario >0 && nuevoSalario <100) {
				salario = nuevoSalario;
			}//cierre if
		}//cierre setter
	
	
} //cierre asistente dental
