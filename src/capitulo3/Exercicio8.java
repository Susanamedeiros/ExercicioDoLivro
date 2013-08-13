package capitulo3;

import java.util.Scanner;

public class Exercicio8 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		float peso;
		System.out.println("Digite seu peso: ");
		peso = scanner.nextFloat();
		peso = peso * 1000;
		System.out.println("Seu peso em gramas é: " + peso);
		scanner.close();
	}
}
