//En esta clase vamos a heredar el atributo de la clase abstracta Figura, y lo vamos a sobreescribir

package Figura;

//1.Aplicamos herencia con la palabra reservada extens

public class Rectangulo extends Figura{
	
	//Parametros
	double base;
	double altura;
	
	//Constructor
	Rectangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	//Metodos
	@Override
	public double calcularArea() {
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	} //metodo calcularArea

	
	
}//cierre clase figura
