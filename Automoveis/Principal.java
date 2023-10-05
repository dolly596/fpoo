package Automoveis;

public class Principal {
	public static void main (String[] args) {
		Veiculo veiculo = new Veiculo ("Toyota", "Sedan", 2000, "Vermelho");
		System.out.println ("Veiculo: ");
		System.out.println("Marca: " +veiculo.getMarca());
		System.out.println("Modelo: " +veiculo.getModelo());
		System.out.println("Ano: " +veiculo.getAno());
		System.out.println("Cor: " +veiculo.getCor());
		
		Automovel automovel = new Automovel ("Toyota", "Sedan", 2000,"Vermelho", 4, "v8" );
		
		System.out.println("numero de portas: " +automovel.getNumeroPortas());
		System.out.println("Motor: " +automovel.getMotor());
		System.out.println("Marca: " +automovel.getMarca());
		System.out.println("Modelo: " +automovel.getModelo());
		System.out.println("Ano: " +automovel.getAno());
		System.out.println("Cor: " +automovel.getCor());
		
		Moto moto = new Moto ("XRE", "Honda", 2009,"Vermelho", 300);
		System.out.println("Marca: " +moto.getMarca());
		System.out.println("Modelo: " +moto.getModelo());
		System.out.println("Ano: " +moto.getAno());
		System.out.println("Cor: " +moto.getCor());
		System.out.println("Cor: " +moto.getCilindrada());
	}
}
