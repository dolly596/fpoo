package Empresa;

public class Medico extends Funcionario {
	
	private int crm;

	
	public Medico(String nome, String matricula, double salario, String telefone, String endereco, String dataNacimento,
			int crm) {
		super(nome, matricula, salario, telefone, endereco, dataNacimento);
		this.crm = crm;
	}

	public int getCrm() {
		return crm;
	}

}
