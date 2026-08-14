import java.util.ArrayList;

public interface AgendaDeAniversarios {

    ArrayList<String> obterAniversariantesDoDia(int dia, int mes);

    void adicionarAniversariante(String nome, int dia, int mes);

    void removerAniversariante(String nome);
}
