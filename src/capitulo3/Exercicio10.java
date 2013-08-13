package capitulo3;

import java.util.Scanner;

public class Exercicio10 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		float A, lado;
		System.out.println("Digite o lado: ");
		lado = scanner.nextFloat();
		A = lado * lado;
		System.out.println("A área do quadrado é: " + A);
		scanner.close();
	}
}
