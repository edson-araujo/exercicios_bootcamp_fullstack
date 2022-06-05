package Arrays;

import java.util.Random;

public class ex003_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numeroAleatorios = new int[20];
		
		
		for (int i = 0; i < numeroAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numeroAleatorios[i] = numero;
			
		}
		
		System.out.println("Números aleátorios: ");
		for (int numero : numeroAleatorios) {
			System.out.println(numero + " ");
		}
		System.out.print("\nSucessores dos números aleátorios: ");
		for (int numero : numeroAleatorios) {
			System.out.println((numero+1) + " ");
		}
	}
	
}
