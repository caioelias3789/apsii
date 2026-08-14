import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private List<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomes = new ArrayList<>();
        for (Aniversariante a : aniversariantes) {
            DataAniversario data = a.getDataAniversario();
            if (data.getDia() == dia && data.getMes() == mes) {
                nomes.add(a.getNome());
            }
        }
        return nomes;
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante novo = new Aniversariante(nome, dia, mes);
        if (!aniversariantes.contains(novo)) {
            aniversariantes.add(novo);
        }
    }

    @Override
    public void removerAniversariante(String nome) {
        aniversariantes.removeIf(a -> a.getNome().equalsIgnoreCase(nome));
    }
}
