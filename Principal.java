package aula03Variaveis;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String nomeVariavel;
		int valorInteiro1, valorInteiro2, total;
		final double valorConstante = 3.14;
		float valor1, valor2, valor3;

		nomeVariavel = "Luis";

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		valorInteiro1 = ler.nextInt();

		System.out.println("Digite o segundo valor1; ");
		valorInteiro2 = ler.nextInt();

		total = valorInteiro1 + valorInteiro2;
		System.out.println("Olá, Mundo! " + total);
		ler.close();
	}
}
