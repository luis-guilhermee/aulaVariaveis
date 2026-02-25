package aula03Variaveis;

import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double preco, distancia, litros, consumo, valor;
		
		System.out.println("Bem vindo ao medidor do consumo de gasolina!");
		System.out.println("Digite o preço da gasolina: ");
		preco = ler.nextDouble();
		
		System.out.println("Digite a distância total percorrida durante a viagem: ");
		distancia = ler.nextDouble();
		
		System.out.println("Digite o consumo médio de gasolina por km: ");
		consumo = ler.nextDouble();
		
		litros = distancia / consumo;
		valor = litros * preco;
		
		System.out.println("A quantidade de combustível total, em litros, gasto na viagem é: " + litros + " litros");
		System.out.println("O valor total gasto em combustível é: R$" + valor);
		ler.close();

	}

}
