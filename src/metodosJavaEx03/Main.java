package metodosJavaEx03;

public class Main {

	public static void main(String[] args) {
		
		//Retornos
		System.out.println("Exercício Retornos");
		
		double areaQuadrado = CalculoQuadrilaterosReturn.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);
		
		double areaRetangulo = CalculoQuadrilaterosReturn.area(5, 5);
		System.out.println("Área do retângulo: " + areaRetangulo);
		
		double areaTrapezio = CalculoQuadrilaterosReturn.area(7, 8, 9);
		System.out.println("Área do trapézio:" + areaTrapezio);
	}

}
