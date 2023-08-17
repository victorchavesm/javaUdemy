//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatro valores inteiros.");
		System.out.print("Primeiro valor: ");
		int A = sc.nextInt();
		System.out.print("Segundo valor: ");
		int B = sc.nextInt();
		System.out.print("Terceiro valor: ");
		int C = sc.nextInt();
		System.out.print("Quarto valor: ");
		int D = sc.nextInt();
		int diferenca = (A * B) - (C * D);
		System.out.printf("A diferença do produto de A * B e o produto de C * D é: %d", diferenca);
		
		sc.close();
		
	}

}
