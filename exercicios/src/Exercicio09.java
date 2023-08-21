//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 valores inteiros");
		System.out.print("Primeiro valor: ");
		int x = sc.nextInt();
		System.out.print("Segundo valor: ");
		int y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.printf("%d e %d são multiplos entre si", x, y);
		}
		else {
			System.out.printf("%d e %d não são multiplos entre si", x, y);
		}
		sc.close();
		}

}
