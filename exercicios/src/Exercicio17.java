//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;
		
		System.out.println("POSTO IPIRANGA");
		System.out.println("# 1 ----- ÁLCOOL");
		System.out.println("# 2 ----- GASOLINA");
		System.out.println("# 3 ----- DIESEL");
		System.out.println("# 4 ----- FIM");
		System.out.print("Digite o tipo de combustível abastecido: ");
		tipo = sc.nextInt();

		while (tipo != 4) {
			
			System.out.println("Qual outro combustível?");
			
			if (tipo < 1 || tipo > 4) {
				System.out.println("Código inválido. Digite novamente.");
			} else if (tipo == 1) {
				alcool += 1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			}
			tipo = sc.nextInt();

		}
		
		System.out.println("MUITO OBRIGADO.");
		System.out.println("Houve um total de: ");
		System.out.println("ÁLCOOL: " + alcool);
		System.out.println("GASOLINA: " + gasolina);
		System.out.println("DIESEL: " + diesel);
		
		sc.close();
	}

}
