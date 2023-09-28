package Cliente;


public class ClienteObjeto {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Otavio", "15996373766", "46302556805", "571649105" );

		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getRg());
	}

}
