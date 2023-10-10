package Empresa;

public class Principal {
	public static void main (String[] args) {
		
		Funcionario func1 = new Funcionario ("Otavio", "182029", 3000.0, "153373-4873", "Rua Benedito Bento Mariano", "13/10/2006");
		System.out.println("Nome: " + func1.getNome());
		System.out.println("Matricula: " + func1.getMatricula());
		System.out.println("Salario: " + func1.getSalario());
		System.out.println("Telefone: " + func1.getTelefone());
		System.out.println("Endereco: " + func1.getEndereco());
		System.out.println("Data de nascimento: " + func1.getDataNacimento());
		
		Administrador adm = new Administrador ("Otavio", "182029", 3000.0, "153373-4873", "Rua Benedito Bento Mariano", "13/10/2006", 1820);
		System.out.println("Nome: " + adm.getNome());
		System.out.println("Matricula: " + adm.getMatricula());
		System.out.println("Salario: " + adm.getSalario());
		System.out.println("Telefone: " + adm.getTelefone());
		System.out.println("Endereco: " + adm.getEndereco());
		System.out.println("Data de nascimento: " + adm.getDataNacimento());
		System.out.println("Cra: " + adm.getCra());
		
		Engenheiro eng = new Engenheiro ("Otavio", "182029", 3000.0, "153373-4873", "Rua Benedito Bento Mariano", "13/10/2006", 2022);
		System.out.println("Nome: " + eng.getNome());
		System.out.println("Matricula: " + eng.getMatricula());
		System.out.println("Salario: " + eng.getSalario());
		System.out.println("Telefone: " + eng.getTelefone());
		System.out.println("Endereco: " + eng.getEndereco());
		System.out.println("Data de nascimento: " + eng.getDataNacimento());
		System.out.println("Crea " + eng.getNumCrea());
		
		Medico med = new Medico ("Otavio", "182029", 3000.0, "153373-4873", "Rua Benedito Bento Mariano", "13/10/2006", 1999);
		System.out.println("Nome: " + med.getNome());
		System.out.println("Matricula: " + med.getMatricula());
		System.out.println("Salario: " + med.getSalario());
		System.out.println("Telefone: " + med.getTelefone());
		System.out.println("Endereco: " + med.getEndereco());
		System.out.println("Data de nascimento: " + med.getDataNacimento());
		System.out.println("Crea " + med.getCrm());
	}
	
}
