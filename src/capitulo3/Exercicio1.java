package capitulo3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num1 = scanner.nextInt();
		System.out.println("Digite outro numero: ");
		int num2 = scanner.nextInt();
		int sub = num1 - num2;
		System.out.println("A subtracao delas eh: " + sub);
		scanner.close();
	}
}
