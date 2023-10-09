package Figura;

public class TestFiguras {

	public static void main(String[] args) {

		//Generar las instancias de nuestras clases 
		
		//1.Instancia de la clase Figura
		//Figura Generico = new Figura;    //Esta manera no funciona porque la clase a instanciar es abstracta
		
		//2. Instancia de un rectangulo
		Figura rectangulo = new Rectangulo (5.0, 6.5);
		
		//3.Instancia de un circulo
		Figura circulo = new Circulo (3.14, 3.0);
		
		//Invocacion del metodo
		System.out.println(rectangulo.calcularArea()); 
		System.out.println(circulo.calcularArea());
		
		
	}// metodo main

}//cierre test


