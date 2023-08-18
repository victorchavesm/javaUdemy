//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.printf("%d é um número positivo", x);
		}
		else if (x == 0){
			System.out.printf("%d é um número neutro.", x);
		}
		else {
			System.out.printf("%d é um número negativo", x);
		}
		sc.close();
		
	}

}
