//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite a quantidade de repetições para as divisões: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			System.out.print("Digite um número: ");
			int a = sc.nextInt();
			System.out.print("Digite outro número: ");
			int b = sc.nextInt();
			if (b == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double div = (double) a / b;
				System.out.printf("%.1f%n", div);
			}

		}
		sc.close();
	}

}
