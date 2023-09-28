package Atividades;

public class Animal {
	private double tamanho;
	private String cor;
	

	public Animal (double tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public String getCor () {
		return cor;
	}
}
