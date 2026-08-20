
public class Moto extends Veiculo {
	public int cilindradas;
	
	public Moto(String novoModelo, int novoAno, int cilindradas){
		super(novoModelo, novoAno);
		this.cilindradas = cilindradas;
	}

	@Override
	public String imprimirDetalhes() {
		return super.imprimirDetalhes()+ "\nNúmero de cilindradas: "+ cilindradas;
	}
	
	
	
}
