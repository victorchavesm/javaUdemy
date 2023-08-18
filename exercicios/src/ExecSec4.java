import java.util.Locale;
import java.util.Scanner;

public class ExecSec4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//pedir comprimento e largura pra calcular a área:
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		double area = largura * comprimento;
		System.out.printf("A área do terreno é %.1f m2. %n", area);
		
		//pedir o preço do metro2 pra calcular o valor do terreno:
		System.out.print("Digite o preço do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		double preco = area * metroQuadrado;
		System.out.printf("O preço do terreno é R$ %.2f", preco);
		
		sc.close();
	}

}
