
public class ex001_calculadora {

	public static void soma(double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
		System.out.println("A soma de " + numero1 + " + " + numero2 + " � " + resultado);
	}
	public static void subtracao (double numero1, double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("A subtra��o de " + numero1 + " - " + numero2 + " � " + resultado);
	}
	public static void multiplicacao (double numero1, double numero2) {
		double resultado = numero1 * numero2;
		System.out.println("A multiplica��o de " + numero1 + " * " + numero2 + " � " + resultado);
	}
	public static void divisao (double numero1, double numero2) {
		double resultado = numero1 / numero2;
		System.out.println("A divis�o de " + numero1 + " / " + numero2 + " � " + resultado);
	}
	
	public static void main(String args[]) {
		soma(0, 0);
		subtracao(10, 5);
		ex001_calculadora.multiplicacao(2, 10);
		ex001_calculadora.divisao(10, 2);
	}
	
}
