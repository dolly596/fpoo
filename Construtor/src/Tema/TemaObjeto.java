package Tema;


public class TemaObjeto {
	public static void main(String[] args) {
		Tema herois = new Tema(1, "Otavio", 33.33, "Vermelho");
		
		
		System.out.println(herois.getId());
		System.out.println(herois.getNome());
		System.out.println(herois.getvalorAluguel());
		System.out.println(herois.getCorToalha());
		
	}
}