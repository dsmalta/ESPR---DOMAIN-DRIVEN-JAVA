package entradaSaida.exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = entrada.nextLine();
		
		String maiuscula = frase.toUpperCase();
		System.out.println("Frase maiuscula: " + maiuscula);
		
		String minuscula = frase.toLowerCase();
		System.out.println("Frase minuscula: " + minuscula);
		
		int comprimentoFrase = frase.length();
		System.out.println("O comprimento e " + comprimentoFrase);
		
		if(frase.contains("Java")) {
			System.out.println(frase.replace("Java", "Python")); 
		} else {
			System.out.println(frase);
		}
		entrada.close();
	}

}
