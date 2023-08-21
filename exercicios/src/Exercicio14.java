//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//
//de 00.00 a 2.000,00        ISENTO
//de 2.000,01 até 3.000,00     8%
//de 3000,01 até 4.500,00     18%
//acima de 4.500,00           28%
//
//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais.

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double salario, tributo;
		
		System.out.println("Digite quanto é seu salário: ");
		salario = sc.nextDouble();
		
		if (salario <= 2000) {
			System.out.println("ISENTO");
		}
		else if (salario <= 3000.00) {
	        tributo = (salario - 2000.00) * 0.08;
			System.out.printf("Você deverá pagar %.2f", tributo);
		}
		else if (salario <= 4500) {
		     tributo = 1000.00 * 0.08 + (salario - 3000) * 0.18; 
	         System.out.printf("Você deverá pagar %.2f", tributo);
	        } 
		else {
	         tributo = 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500) * 0.28;
	         System.out.printf("Você deverá pagar %.2f", tributo);
	        }
		
		sc.close();

	}

}
