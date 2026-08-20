
public class Carro extends Veiculo {
		public int numPortas;
		
		public Carro(String novoModelo, int novoAno, int numPortas) {
			super(novoModelo, novoAno);
			this.numPortas = numPortas;
		}

		@Override
		public String imprimirDetalhes() {
			return super.imprimirDetalhes() + "\nNúmero de portas: " + numPortas;
		}
		
		

}
