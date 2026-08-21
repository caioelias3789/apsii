
public class FuncionarioCLT extends Funcionario{
	public double valeTransporte;
	public double valeAlimentacao;
	
	public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao) {
		super(nome, matricula, salarioBase, dataAdmissao);
		this.valeTransporte = valeTransporte;
		this.valeAlimentacao = valeAlimentacao;
	}

	public double getValeTransporte() {
		return valeTransporte;
	}

	public double getValeAlimentacao() {
		return valeAlimentacao;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + valeTransporte + valeAlimentacao;
	}

	@Override
	public double calcularDesconto() {
		return super.calcularDesconto() + 50.00;
	}

	@Override
	public String imprimirFuncionario() {
		return super.imprimirFuncionario() + " | VT: "+ valeTransporte +" | VA: "+ valeAlimentacao;
	}
	
	
	

}
