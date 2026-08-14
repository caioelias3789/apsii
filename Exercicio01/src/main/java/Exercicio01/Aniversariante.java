import java.util.Objects;

public class Aniversariante {

    private String nome;
    private DataAniversario dataAniversario;

    // Construtor 2.a: recebe nome, dia e mês do aniversário
    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    // Construtor 2.b: recebe nome e a data já encapsulada em DataAniversario
    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(DataAniversario dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    // Questão 1: equals só retorna true se mesmo nome e mesma data de aniversário
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aniversariante other = (Aniversariante) obj;
        return Objects.equals(nome, other.nome)
                && Objects.equals(dataAniversario, other.dataAniversario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataAniversario);
    }

    @Override
    public String toString() {
        return nome + " - " + dataAniversario;
    }
}
