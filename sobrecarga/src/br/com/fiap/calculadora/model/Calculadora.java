package br.com.fiap.calculadora.model;

public class Calculadora {

	// Assinatura do metodo deve ser diferente: numero, tipo ou ordem dos parametros
	
	// public void Somar(int a, int b){}
	// public void Somar(int a, int b, int c){} _ OK
	// public void Somar(double a, double b){} _ OK
	// public void Somar(int c, int d){} _ Nao OK
	// public void Somar(int a, double b){} _ OK
	// public void Somar(double a, int b){} _ OK
	
	public int somar(int a, int b) {
		return a + b;
	}
	
	public int somar(int a, int b, int c) {
		return a + b + c;
	}
	
	public double somar(double a, double b) { 
		return a + b;
	}
	
	/*public int somar(int c, int d) {
		return c + d;
	}*/
	
	public double somar(int a , double b) {
		return a + b;
	}
	
	public double somar(double a, int b) {
		return a + b;
	}
}
