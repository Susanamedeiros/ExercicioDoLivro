package capitulo3;

import java.util.Scanner;

public class Exercicio11 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		float A, diagMaior, diagMenor;
		System.out.println("Digite a diagonal maior: ");
		diagMaior = scanner.nextFloat();
		System.out.println("Digite a diagonal maior: ");
		diagMenor = scanner.nextFloat();
		A = (diagMaior * diagMenor) / 2;
		System.out.println("A área do losango é: " + A);
		scanner.close();
	}
}
