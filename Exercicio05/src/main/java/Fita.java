public class Fita {

	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	public static final int INFANTIL = 2;

	// Constantes nomeadas no lugar de números "mágicos"
	private static final double VALOR_BASE_NORMAL = 2;
	private static final int DIAS_INCLUIDOS_NORMAL = 2;
	private static final double VALOR_BASE_INFANTIL = 1.5;
	private static final int DIAS_INCLUIDOS_INFANTIL = 3;
	private static final double VALOR_DIA_LANCAMENTO = 3;
	private static final double VALOR_DIA_EXTRA = 1.5;

	private String titulo;
	private int codigoDePreco;

	public Fita(String titulo, int codigoDePreco) {
		this.titulo = titulo;
		this.codigoDePreco = codigoDePreco;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCodigoDePreco() {
		return codigoDePreco;
	}

	public void setCodigoDePreco(int codigoDePreco) {
		this.codigoDePreco = codigoDePreco;
	}

	// Move Method + Extract Method: cálculo do valor por tipo de fita
	public double calcularValor(int diasAlugada) {
		switch (codigoDePreco) {
			case NORMAL:
				return valorComDiasExtras(VALOR_BASE_NORMAL, DIAS_INCLUIDOS_NORMAL, diasAlugada);
			case LANCAMENTO:
				return diasAlugada * VALOR_DIA_LANCAMENTO;
			case INFANTIL:
				return valorComDiasExtras(VALOR_BASE_INFANTIL, DIAS_INCLUIDOS_INFANTIL, diasAlugada);
			default:
				return 0;
		}
	}

	public int calcularPontos(int diasAlugada) {
		boolean bonus = codigoDePreco == LANCAMENTO && diasAlugada > 1;
		return bonus ? 2 : 1;
	}

	private double valorComDiasExtras(double valorBase, int diasIncluidos, int diasAlugada) {
		double valor = valorBase;
		if (diasAlugada > diasIncluidos) {
			valor += (diasAlugada - diasIncluidos) * VALOR_DIA_EXTRA;
		}
		return valor;
	}
}
