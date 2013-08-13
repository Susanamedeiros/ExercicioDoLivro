package capitulo3;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio16 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		double cat1, cat2, hip;
		System.out.println("Digite os dois catetos: ");
		cat1 = scanner.nextDouble();
		cat2 = scanner.nextDouble();
		hip = Math.pow(cat1, 2.0) + Math.pow(cat2, 2.0);
		Math.pow(hip, 2);
		System.out.println("A hipotenusa é: " + hip);
		scanner.close();
	}
}
