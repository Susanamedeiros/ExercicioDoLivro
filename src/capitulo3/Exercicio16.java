package capitulo3;

import java.util.Scanner;
import java.math.BigFloat;

public class Exercicio16 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		float cat1, cat2, hip;
		BigFloat bi = new BigFloat("2.0");  
		System.out.println("Digite os dois catetos: ");
		cat1 = scanner.nextFloat();
		cat2 = scanner.nextFloat();
		hip = bi.pow(cat1) + bi.pow(cat2);
		  
		
		scanner.close();
	}
}
