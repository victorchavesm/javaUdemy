//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
// **OBS.: O enunciado da questão só pede 1 opção por pedido e a quantidade. Pra mais de 1 opção ainda não foi visto estruturas repetitivas**
//1 cachorro quente $4
//2 x salada 4.50
//3 x bacon 5.00
//4 torrada simples 2.00
//5 refrigerante 1.50

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double total;
		String opcao;
		
		System.out.println("Digite o código do que você vai querer");
		System.out.println("# 1        CACHORRO QUENTE      R$ 4.00");
		System.out.println("# 2        X-SALADA             R$ 4.50");
		System.out.println("# 3        X-BACON              R$ 5.00");
		System.out.println("# 4        TORRADA SIMPLES      R$ 2.00");
		System.out.println("# 5        REFRRIGERANTE        R$ 1.50");
		codigo = sc.nextInt();
		System.out.println("E a quantidade?");
		qtd = sc.nextInt();
		
		
		if (codigo == 1) {
			total = qtd * 4;
			opcao = "CACHORRO(S) QUENTE(S)";
		}
		else if (codigo == 2) {
			total = qtd * 4.5;
			opcao = "X-SALADA";
		}
		else if (codigo == 3) {
			total = qtd * 5;
			opcao = "X-BACON";
		}
		else if (codigo == 4) {
			total = qtd * 2;
			opcao = "TORRADA(S) SIMPLES";
		}
		else {
			total = qtd * 1.5;
			opcao = "REFRIGERANTE(S)";
		}
		
		System.out.printf("%d %s dá um total de R$ %.2f", qtd, opcao,total);
		
		sc.close();

	}

}
