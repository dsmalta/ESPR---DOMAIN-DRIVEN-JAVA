package entradaSaida.exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("Digite sua idade: ");
		short idade = entrada.nextShort();
		
		System.out.println("Digite sua altura: ");
		float altura = entrada.nextFloat();
		
		System.out.println("O usuario do nome " + nome + " tem a idade de " + idade + " anos e altura " + altura);
		
		entrada.close();
		
		
	}

}
