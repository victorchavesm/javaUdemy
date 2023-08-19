//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor;
		System.out.println("Digite um valor entre 0 e 100");
		valor = sc.nextInt();
		
		if (valor < 0 || valor > 100) {
			System.out.println("O valor digitado está fora do intervalo [0, 100]");
		}
		else if (valor <= 25) {
			System.out.println("O valor está dentro do intervalo [0, 25]");
		}
		else if (valor <= 50) {
			System.out.println("O valor está dentro do intervalo [25, 50]");
		}
		else if (valor <= 75) {
			System.out.println("O valor está dentro do intervalo [50, 75]");
		}
		else 
			System.out.println("O valor es´ta dentro do intervalo [75, 100]");
		
		sc.close();
	}

}
