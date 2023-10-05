package Automoveis;

public class Automovel extends Veiculo {
	private int numeroPortas;
	private String motor;
	
	public Automovel(String marca, String modelo, int ano, String cor, int numeroPortas, String motor) {
		super(marca, modelo, ano, cor);
		this.numeroPortas = numeroPortas;
		this.motor = motor;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public String getMotor() {
		return motor;
	}

	
}
