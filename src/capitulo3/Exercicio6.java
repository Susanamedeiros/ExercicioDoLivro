package capitulo3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		float salario, vendas;
		System.out.println("Digite o seu salário: ");
		salario = scanner.nextFloat();
		System.out.println("Digite o valor das vendas:: ");
		vendas = scanner.nextFloat();
		vendas = vendas * (4/100);
		System.out.println("Sua comissão foi de: " + vendas);
		salario = salario + vendas;
		System.out.println("Seu salário final é de: " + salario);
		scanner.close();
	}
}
