package ItemTema;


public class ItemTemaObjeto {

	public static void main(String[] args) {
		ItemTema festa = new ItemTema(1, "Toalha", "Necessário para utilizar nas mesas de festa");

		System.out.println(festa.getId());
		System.out.println(festa.getNome());
		System.out.println(festa.getDescricao());
	}

}
