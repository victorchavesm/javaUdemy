//Fazer um programa que leia o nome de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o nome e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do funcionário: ");
		String nome = sc.next();
		System.out.print("Informe o número de horas trabalhadas: ");
		double horas = sc.nextDouble();
		System.out.print("Informe o valor recebido por hora: ");
		double valor = sc.nextDouble();
		double salario = horas * valor;
		System.out.printf("O salário de %s esse mês foi: R$ %.2f", nome, salario);
		
		sc.close();
	}

}
