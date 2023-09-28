package ItemTema;

public class ItemTema {

	private long id;
	private String nome;
	private String descricao;
	
	
	public ItemTema(long id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}


	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
}
