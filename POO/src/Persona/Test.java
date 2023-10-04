package Persona;

public class Test {

	// Metodo principal para instanciar mis clasaes
	public static void main(String[] args) {

		//Instancia de persona
		Persona Felipe = new Persona ("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com"); 
		
		Felipe.imprimirInfo(); //mandar a imprimir la perona Felipe
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr.Simi", "Lares", (byte)50, "123456789", "simi@lares.com", "Odontologia", "55113344", "500", "avanzado", "matutino", 500);
		
		
		System.out.println();
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		
		
		
		//Instancia de Paciente con todos los datos
				Paciente Chencho = new Paciente("CHNCH1234", "RH Positivo", true, true, "05/Oct/2023", "Doc. Simi Lares", false);
				System.out.println("********************");
				System.out.println(Chencho);
				
				
				
				//Instancia de Paciente con datos obligatorios
				Paciente Masiosare = new Paciente("MAS12345", false, false);
				System.out.println("********************");
				System.out.println(Masiosare);

		//cambiar el false de seguroMedico a true
				Masiosare.setSeguroGastosMedicos(true);
				System.out.println("********************");
				System.out.println(Masiosare);
				
				
		
	}// cierre metodo main

}
