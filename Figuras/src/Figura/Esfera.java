package Figura;


//clase concreta que implementa metodos de una interfaz llamada calculable
public class Esfera extends Figura implements Calculable {

	
	//Atributos
	double radio;
	double pi;
	
	@Override
	public double calcularArea() {
		//Area= 4 π r*r

	}

	@Override
	public double calcularVolumen() {
		//V = 4/3 π r³

	}

	@Override
	public double calcularPerimetro() {
		//Perimetro 2 * π * r 

	}

	
	
	
	
	
	
	
	
	
	
}//class esfera
