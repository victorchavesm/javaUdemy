//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1, qtd1, cod2, qtd2;
		double valor1, valor2, valorTotal;
		
		System.out.println("Informe os dados da primeira peça");
		System.out.print("Código: ");
		cod1 = sc.nextInt();
		System.out.print("Quantidade: ");
		qtd1 = sc.nextInt();
		System.out.print("Valor unitário: R$ ");
		valor1 = sc.nextDouble();
		
		System.out.println("Informe os dados da segunda peça");
		System.out.print("Código: ");
		cod2 = sc.nextInt();
		System.out.print("Quantidade: ");
		qtd2 = sc.nextInt();
		System.out.print("Valor unitário: R$ ");
		valor2 = sc.nextDouble();
		
		valorTotal = (valor1*qtd1) + (valor2*qtd2);
		System.out.printf("%d peças de código %d e %d peças de código %d%n", qtd1, cod1, qtd2, cod2);
		System.out.printf("Valor total: R$ %.2f", valorTotal);
		
		sc.close();
	}

}
