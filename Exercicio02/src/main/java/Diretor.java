
public class Diretor extends Gerente {
	
	public double participacaoLucros;
	
	public Diretor(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus, double participacaoLucros) {
		super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao, tamanhoEquipe, percentualBonus);
		this.participacaoLucros = participacaoLucros;
	}
	
	@Override
    public double calcularSalario() {
        return super.calcularSalario() + participacaoLucros;
    }

	@Override
	public String imprimirFuncionario() {
		return super.imprimirFuncionario()+ " | Participação dos Lucros: "+ participacaoLucros;
	}
	
	

}
