package Empresa;

public class Funcionario {
	private String nome;
	private String matricula;
	private double salario;
	private String telefone;
	private String endereco;
	private String dataNacimento;
	
	public Funcionario(String nome, String matricula, double salario, String telefone, String endereco,
			String dataNacimento) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNacimento = dataNacimento;
	}

	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public double getSalario() {
		return salario;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getDataNacimento() {
		return dataNacimento;
	}
	
	
}
