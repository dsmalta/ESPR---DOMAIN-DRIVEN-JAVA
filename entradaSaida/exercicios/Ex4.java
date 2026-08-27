package entradaSaida.exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero decimal: ");
		float numeroDecimal = entrada.nextFloat();
		
		int numeroInteiro = (int) numeroDecimal;
		
		System.out.println("O numero decimal digitado apos o casting: " + numeroInteiro);

		entrada.close();
	}

}
