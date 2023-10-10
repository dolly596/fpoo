package Empresa;

public class Administrador extends Funcionario {

	private int cra;

	public Administrador(String nome, String matricula, double salario, String telefone, String endereco,
			String dataNacimento, int cra) {
		super(nome, matricula, salario, telefone, endereco, dataNacimento);
		this.cra = cra;
	}

	public int getCra() {
		return cra;
	}
	
}
