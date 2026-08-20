
public class Veiculo {
	protected String modelo;
	protected int ano;
	
	public Veiculo(String novoModelo, int novoAno) {
		this.modelo = novoModelo;
		this.ano = novoAno;
	}
	
	public String imprimirDetalhes() {
		return "Modelo: "+ modelo +"\nAno: "+ ano;
	}
	
	
	}
