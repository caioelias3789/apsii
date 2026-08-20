
public class Principal {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Corola", 2000);
		Carro c1 = new Carro("Corola", 2000, 4);
		Moto m1 = new Moto("Honda Bros", 2008, 150);
		
		System.out.println(v1.imprimirDetalhes());
		System.out.println(c1.imprimirDetalhes());
		System.out.println(m1.imprimirDetalhes());
		
	}

}
