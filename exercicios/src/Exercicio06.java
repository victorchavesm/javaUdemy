//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.print("Informe o primeiro valor: ");
		A = sc.nextDouble();
		System.out.print("Informe o segundo valor: ");
		B = sc.nextDouble();
		System.out.print("Informe o terceiro valor: ");
		C = sc.nextDouble();
		//a)
		areaTrianguloRetangulo = (A * C) / 2;
		System.out.printf("A área de um triângulo que tem %.2f de altura e %.2f de altura é: %.2f%n", A, C, areaTrianguloRetangulo);
		//b)
		areaCirculo = 3.14159 * Math.pow(C, 2);
		System.out.printf("A área do círculo de raio %.2f é: %.2f%n", C, areaCirculo);
		//c)
		areaTrapezio = ((A + B) * C) / 2;
		System.out.printf("A área do trapézio que tem %.2f e %.2f por bases e %.2f por altura é: %.2f%n", A, B, C, areaTrapezio);
		//d)
		areaQuadrado = Math.pow(B, 2);
		System.out.printf("A área do quadrado de lado %.2f é: %.2f%n", B, areaQuadrado);
		//e)
		areaRetangulo = A * B;
		System.out.printf("A área do reângulo que tem lados %.2f e %.2f é: %.2f%n", A, B, areaRetangulo);
		
		sc.close();

	}

}
