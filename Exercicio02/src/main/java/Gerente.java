
public class Gerente extends FuncionarioCLT {
	public int tamanhoEquipe;
	public double percentualBonus;
	
	public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
		super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
		this.tamanhoEquipe = tamanhoEquipe;
		this.percentualBonus = percentualBonus;
		
	}

	public int getTamanhoEquipe() {
		return tamanhoEquipe;
	}
	public double getPercentualBonus() {
		return percentualBonus;
	}

	@Override
	public double calcularSalario() {

		return super.calcularSalario() + (getSalarioBase() * percentualBonus);
	}
	
	

	@Override
	public String imprimirFuncionario() {
		return super.imprimirFuncionario() + " | Equipe: "+ tamanhoEquipe +" | Bônus: "+ percentualBonus+"%";
	}

	@Override
	public double calcularDesconto() {
		double desconto = super.calcularDesconto();
		
		if(tamanhoEquipe > 100) {
			desconto += 100;
		}
		
		return desconto;
	}
	
}
