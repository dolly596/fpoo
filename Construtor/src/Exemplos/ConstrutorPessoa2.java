package Exemplos;

public class ConstrutorPessoa2 {

	public static void main(String[] args) {
		
		Pessoa2 jogador1 = new Pessoa2();
		Pessoa2 jogador2 = new Pessoa2 ("Messi", 36 );
		Pessoa2 jogador3 = new Pessoa2 ("CR7" );
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		System.out.println(jogador3.getNome());
		System.out.println(jogador3.getIdade());

	}

}
