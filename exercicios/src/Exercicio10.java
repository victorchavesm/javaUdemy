//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int horaInicio, horaFinal, duracao;
		
		System.out.print("De que horas o jogo começou? ");
		horaInicio = sc.nextInt();
		System.out.print("De que horas o jogo terminou? ");
		horaFinal = sc.nextInt();
		
		if (horaInicio == horaFinal){
			System.out.print("O jogo precisa ter duração miníma de 1h e máxima de 24h");
		}
		else if (horaInicio < horaFinal) {
			duracao = horaFinal - horaInicio;
			System.out.printf("O jogo durou %d h", duracao);
		}
		else {
			duracao = 24 - horaInicio + horaFinal;
			System.out.printf("O jogo durou % d h", duracao);
		}
		
		sc.close();
	}

}
