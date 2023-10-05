package Persona;

public class TestAsistenteDental {
	public static void main(String[] args) {
		//Instancia de nuestro asistente
		
		AsistenteDental Francisca = new AsistenteDental("05/10/2023", 875.40d);
		
		//Impresion de la info de nuestro asistente
		Francisca.mostrarDatosAsistente();
		
		//El sueldo de Francisca no es de 875.4, es de 87.54
		//Cambio de sueldo
		//Francisca.salario=87.54d;
				
		System.out.println(Francisca.getSalario()); 
		
		
	}//metodo main
}//cierre main
