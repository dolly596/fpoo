package Atividades;

public class ConsultaConstrutor {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta ("13/10/2023", "Dentista", "Retirar Dente" );

		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePente());
		System.out.println(consulta1.getNomeDents());
	}

}
