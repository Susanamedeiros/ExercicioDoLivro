package capitulo3;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float A, baseMaior, baseMenor, altura;
		System.out.println("Digite a base maior: ");
		baseMaior = scanner.nextFloat();
		System.out.println("Digite a base menor: ");
		baseMenor = scanner.nextFloat();
		System.out.println("Digite a altura: ");
		altura = scanner.nextFloat();
		A = ((baseMaior + baseMenor) * altura) / 2;
		System.out.println("A area é: " + A);
		scanner.close();
	}
}
