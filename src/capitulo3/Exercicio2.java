package capitulo3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String [] args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Digite tres numeros inteiros: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int mult = num1 * num2 * num3;
		System.out.println("A multiplicacao eh: " + mult); 
		scanner.close();		
	}
}
