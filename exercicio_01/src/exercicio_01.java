
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Digite dois números inteiros a serem somados. ");
		System.out.print("Primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Segundo número: ");
		num2 = sc.nextInt();
		num3 = num1 + num2;
		System.out.printf("%d + %d = %d", num1, num2, num3);
		
		sc.close();
	}

}
