package capitulo3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String [] args){
	Scanner scanner = new Scanner (System.in);
	float preco = scanner.nextFloat();
	float precoMeio = (preco / 100) * 10;
	float precoFim = preco - precoMeio;
	System.out.println("O novo preco eh: " + precoFim);
	scanner.close();
	}
}
