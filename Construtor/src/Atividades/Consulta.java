package Atividades;

public class Consulta {
	public String data;
	public String nomePente;
	public String nomeDents;
	
	public Consulta (String data, String nomePente, String nomeDents ) {
		this.data = data;
		this.nomePente = nomePente;
		this.nomeDents = nomeDents;
	}
	public String getData() {
		return data;
	}
	public String getNomePente () {
		return nomePente;
	}
	public String getNomeDents () {
		return nomeDents;
	}
}
