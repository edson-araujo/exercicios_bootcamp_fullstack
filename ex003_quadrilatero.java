
public class ex003_quadrilatero {

	public class QuadriLatero {

		public static void area(double lado) {
			System.out.println("�rea do quadrado: " + lado * lado);
		}
		public static void area(double lado1, double lado2) {
			System.out.println("�rea do ret�ngulo: " + lado1 * lado2);
		}
		public static void area(double baseMaior, double baseMenor, double altura) {
			System.out.println("�rea do trap�zio: " + ((baseMaior + baseMenor) * altura) / 2);
		}
	}
	
	public static void main(String[] args) {

		//Quadrilatero
		System.out.println("Exercicio quadrilatero");
		QuadriLatero.area(3);
		QuadriLatero.area(5, 5);
		QuadriLatero.area(7, 8, 9);
		
	}

}
