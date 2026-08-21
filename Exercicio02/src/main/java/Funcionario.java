
public class Funcionario {
	
	protected String nome;
	protected String matricula;
	protected double salarioBase;
	protected String dataAdmissao;
	
	public Funcionario(String nome, String matricula, double salarioBase, String dataAdmissao) {
		this.nome = nome;
		this.matricula =  matricula;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
	}
	
	
	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}


	public double calcularSalario(){
		return salarioBase;
	}
	
	public double calcularDesconto() {
		return salarioBase * 0.08;
	}
	
	public String imprimirFuncionario() {
		return ""+ nome +" | "+ matricula + " | "+ salarioBase +" | "+ dataAdmissao;
	}

	@Override
	public String toString() {
		return "Funcionario [Nome=" + nome + ", Matricula=" + matricula + ", SalarioBase=" + salarioBase
				+ ", Data Admissao=" + dataAdmissao + ", Salario= " + calcularSalario()
				+ ", Desconto= " + calcularDesconto() + "]";
	}
	
	
	
}
