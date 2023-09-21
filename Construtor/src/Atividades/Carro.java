package Atividades;

public class Carro {
	private String placa;
	private int numChassi;
	

	public Carro(String placa, int numChassi) {
		this.placa = placa;
		this.numChassi = numChassi;
	}
	public String getPlaca() {
		return placa;
	}
	public int getNumChassi () {
		return numChassi;
	}
}
