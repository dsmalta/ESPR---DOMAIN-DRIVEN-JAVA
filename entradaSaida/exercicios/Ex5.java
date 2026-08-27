package entradaSaida.exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Digite uma mensagem: ");
		 String mensagem1 = entrada.nextLine();
		 
		 System.out.println("Digite uma segunda mensagem: ");
		 String mensagem2 = entrada.nextLine(); 
		 
		 boolean equals = mensagem1.equals(mensagem2);
		 if (equals) {
			 System.out.println("As duas mensagens sao iguais");
		 } else {
			 System.out.println("As mensagens sao diferentes");
		 }
		 
		 boolean equalsIgnore = mensagem1.equalsIgnoreCase(mensagem2);
		 if (equalsIgnore) {
			 System.out.println("As mensagens sao iguais");
		 } else {
			 System.out.println("As mensagens sao diferentes");
		 }
		 
		 entrada.close();
	}

}
