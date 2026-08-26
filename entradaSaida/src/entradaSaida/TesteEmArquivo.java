package entradaSaida;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteEmArquivo {

	public static void main(String[] args) throws IOException {
		
		PrintWriter arquivo = new PrintWriter(new FileWriter("saida.txt"));
		arquivo.println("Teste de escrita em arquivo");
		arquivo.close();
		
	}

}
