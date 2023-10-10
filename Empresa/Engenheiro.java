package Empresa;

public class Engenheiro extends Funcionario {
	private int numCrea;

	public Engenheiro(String nome, String matricula, double salario, String telefone, String endereco,
			String dataNacimento, int numCrea) {
		super(nome, matricula, salario, telefone, endereco, dataNacimento);
		this.numCrea = numCrea;
	}

	public int getNumCrea() {
		return numCrea;
	}
	
}
