package capitulo3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite as duas notas para o calculo: ");
		float nota1 = scanner.nextFloat();
		float nota2 = scanner.nextFloat();
		float medPond = ((nota1 * 2) + (nota2 * 3)) / (2 *3);
		System.out.println("A media ponderada eh: " + medPond);
		scanner.close();
	}
}
