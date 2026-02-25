package aula03Variaveis;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double celsius, fahrenheit;
		
		System.out.println("Bem vindo ao conversor de graus Fahrenheit para Celsius!");
		System.out.println("Digite seu valor de graus em Fahrenheit:");
		fahrenheit = ler.nextDouble();
		
		celsius = ((fahrenheit - 32) * 5)/9;
		
		System.out.println("Seu valor em graus celsius é: " + celsius + " °C");
		ler.close();
	}

}
