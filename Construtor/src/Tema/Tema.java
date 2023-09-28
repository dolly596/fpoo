package Tema;

public class Tema {
	 private long id;
	 private String nome;
	 private double valorAluguel;
	 private String corToalha; 
	 
	public Tema (long id, String nome, double valorAluguel, String corToalha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corToalha = corToalha;
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getvalorAluguel() {
		return valorAluguel;
	}
	public String getCorToalha () {
		return corToalha;
	}
}

