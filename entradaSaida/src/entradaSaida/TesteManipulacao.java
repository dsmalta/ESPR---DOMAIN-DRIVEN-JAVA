package entradaSaida;

public class TesteManipulacao {

	public static void main(String[] args) {
		
		String mensagem = "Exemplo de manipulacao de String em JAVA.";
		String mensagem1 = "Exemplo de manipulacao de String em java.";
		System.out.println("Usando o contains - " + mensagem.contains("JAVA"));
		System.out.println("Comparando mensagem com mensagem 1 - "+mensagem.equals(mensagem1));
		System.out.println("Comparando mensagem com mensagem 1 com equalsIgnoreCase - "+mensagem.equalsIgnoreCase(mensagem1));
		
	}

}
