//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.print("Senha incorreta! Digite novamente sua senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso liberado.");

		sc.close();

	}

}
