package br.com.fiap.rh.test;

import java.util.Scanner;

import br.com.fiap.rh.model.Aluno;
import br.com.fiap.rh.model.Professor;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome do aluno: ");
		String nomeAluno = scanner.nextLine();
		
		System.out.println("Altura do Aluno: ");
		float alturaAluno = scanner.nextFloat();
		
		System.out.println("Idade do Aluno: ");
		byte idadeAluno = scanner.nextByte();
		
		System.out.println("Peso do Aluno: ");
		float pesoAluno = scanner.nextFloat(); 
		scanner.nextLine();

		System.out.println("Sexo do Aluno: ");
		String sexoAluno = scanner.nextLine();

		System.out.println("Nome do Professor: ");
		String nomeProfessor = scanner.nextLine();

		System.out.println("Idade do Professor: ");
		byte idadeProfessor = scanner.nextByte();
		scanner.nextLine();
		
		System.out.println("Sexo do Professor: ");
		String sexoProfessor = scanner.nextLine();  
		System.out.println();
		
		System.out.println("Disciplina do Professor: ");
		String disciplinaProfessor = scanner.nextLine();
		scanner.nextLine();
		
		scanner.close();
		
		Aluno aluno1 = new Aluno();
		aluno1.exibeAluno(nomeAluno, idadeAluno, alturaAluno , pesoAluno, sexoAluno);
		
		Professor professor1 = new Professor();
		professor1.exibeProfessor(nomeProfessor, idadeProfessor, sexoProfessor , disciplinaProfessor);
	}

}
