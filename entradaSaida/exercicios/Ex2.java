package entradaSaida.exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		short idade = entrada.nextShort();
		
		System.out.println("Digite seu salario: ");
		float salario = entrada.nextFloat();
		
		System.out.printf("Nome: %s %nIdade: %d %nSalario: %f", nome, idade, salario);

		entrada.close();
	}

}
