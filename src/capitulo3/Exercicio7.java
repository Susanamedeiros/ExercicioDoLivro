package capitulo3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float peso;
		System.out.println("Digite seu peso: ");
		peso = scanner.nextFloat();
		peso = peso * (15/100);
		System.out.println("Se engordar 15%: " + peso);
		peso = peso * (20/100);
		System.out.println("Se engordar 20%: " + peso);
		scanner.close();
	}
}
