package Figura;

//Herencia de la clases abstracta Figura
public class Circulo extends Figura{

	//1. Atributos
	double pi;
	double radio;
	
	//2. Constructor
	Circulo (double pi, double radio){
		this.pi= pi;
		this.radio=radio;
	}
	
	//3.Metodos (metodo abstracto heredado de Figura
	@Override 
	public double calcularArea () {
		double areaCirculo = pi * (radio*radio);
		return areaCirculo;
	}//metodo calcularArea
} //class Circulo
