
public class Estagiario extends Funcionario {
	public double valorBolsaAuxilio;
	public int cargaHorariaSemanal;
	
	public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao, double valorBolsaAuxilio, int cargaHorariaSemanal) {
		super(nome, matricula, salarioBase, dataAdmissao);
		
		this.valorBolsaAuxilio = valorBolsaAuxilio;
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}

	public double getValorBolsaAuxilio() {
		return valorBolsaAuxilio;
	}

	public int getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}

	@Override
	public double calcularSalario() {
		return valorBolsaAuxilio;
	}

	@Override
	public double calcularDesconto() {
		return 0.00;
	}

	@Override
	public String imprimirFuncionario() {
		return super.imprimirFuncionario()+ " | Bolsa: "+ valorBolsaAuxilio +" | Carga Horária: "+ cargaHorariaSemanal;
	}
	
	

}
