package Sorveteria;

public class Principal {
	public static void main (String[] args) {
	
	
	System.out.println("Produto: ");
	Produto prod1 = new Produto (1, "Picolé", 2.0);
	System.out.println("Id: " + prod1.getId());
	System.out.println("Nome: " +prod1.getNome());
	System.out.println("Preco: " +prod1.getPreco());
	
	System.out.println("\n");
	
	System.out.println("Sorvete: ");
	Sorvete sorve1 = new Sorvete (2, "Maria", 33.0, 20.0);
	System.out.println("ID: " + sorve1.getId());
	System.out.println("Nome: " +sorve1.getNome());
	System.out.println("Preço: " +sorve1.getPreco());
	System.out.println("Tempo: " +sorve1.getTempAdequada());
	
	System.out.println("\n");

	System.out.println("Camisa: ");
	Camisa camisa1 = new Camisa (3, "Ritinha", 60.0, "Vermelha", "Algodão", "M");
	System.out.println("ID: " + camisa1.getId());
	System.out.println("Nome: " +camisa1.getNome());
	System.out.println("Preço: " +camisa1.getPreco());
	System.out.println("Cor: " +camisa1.getCor());
	System.out.println("Tecido: " +camisa1.getTecido());
	System.out.println("Tamanho: " +camisa1.getTamanho());
	}
}