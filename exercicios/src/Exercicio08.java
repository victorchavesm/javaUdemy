//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.printf("%d é par", x);
		}
		else {
			System.out.printf("%d é impar", x);
		}
		sc.close();
	}

}
