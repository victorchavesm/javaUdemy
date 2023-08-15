import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//configurar localização do programa (já importou automáticamente)
		// fiz isso pra substituir a vírgula em decimais por ponto
		Locale.setDefault(Locale.US);
		
        //MARCADORES
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
		//variáveis
		int y = 32;
		double x = 10.3571341;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		
		//print caracteres 
		//usa o ln pra quebrar linha
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		System.out.println("Meu primeiro progama em Java");
		
		//print-> número inteiro armazenado na variável y
		System.out.println(y);
		
		//print-> um número decimal armazenado na variável
		System.out.println(x);
		
		//printf-> formatado para imprimir quantidade de casas decimais estabelecidas.
		//   \n ou %n usa pra quebrar linha
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		//pra concatenar vários elementos
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros\n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f de salário", nome, idade, renda);		
	}

}
