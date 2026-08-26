package entradaSaida;

import java.util.Scanner;

public class TesteEntradaSaida {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		short idade = entrada.nextShort();
		
		System.out.println("O nome digitado e " + nome + " e a idade digitada e " + idade);
		
		entrada.close();
		
	}

}
