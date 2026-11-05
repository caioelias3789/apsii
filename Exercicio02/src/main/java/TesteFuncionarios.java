
public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Ana Costa", "F001", 2500, "01/03/2020");
		FuncionarioCLT fclt1 = new FuncionarioCLT("Bruno Reis", "C001", 3000, "10/06/2021", 220, 400);
		Gerente g1 = new Gerente("Carla Mendes", "G001", 8000, "15/01/2018", 300, 500, 12, 20);
		Estagiario e1 = new Estagiario("Diego Alves", "E001", 0, "05/08/2024", 1500, 20);
		Diretor d1 = new Diretor("Ana Beatriz", "D001", 12000, "20/02/2015", 400, 600, 15, 10, 2000);
		
		System.out.println(f1.imprimirFuncionario());
		System.out.println(fclt1.imprimirFuncionario());
		System.out.println(g1.imprimirFuncionario());
		System.out.println(e1.imprimirFuncionario());
		System.out.println(d1.imprimirFuncionario());

	}

}
