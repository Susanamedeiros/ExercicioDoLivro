package capitulo3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite dois numeros inteiros: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int divisao = num1 / num2;
		System.out.println("A divisao eh: " + divisao);
		scanner.close();
	}
}
