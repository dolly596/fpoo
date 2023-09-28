package Endereco;


public class EnderecoObjeto {

	public static void main(String[] args) {
		Endereco endereco = new Endereco(1, "Sesi Itape",1, "casa", "Jardim Fogaça", "Itapetininga",
		"18202440", "SP");

		System.out.println(endereco.getId());
		System.out.println(endereco.getLogradouro());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getCep());
		System.out.println(endereco.getUf());

	}

}
