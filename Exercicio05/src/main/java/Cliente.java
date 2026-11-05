import java.util.*;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Registro de Alugueis de ").append(getNome()).append("\n");

        for (Aluguel aluguel : alugueis) {
            resultado.append("\t").append(aluguel.getFita().getTitulo())
                     .append("\t").append(aluguel.calcularValor()).append("\n");
        }

        resultado.append("Valor total devido: ").append(calcularValorTotal()).append("\n");
        resultado.append("Você ganhou ").append(calcularPontosTotais())
                 .append(" pontos de alugador frequente");
        return resultado.toString();
    }

    private double calcularValorTotal() {
        double total = 0;
        for (Aluguel aluguel : alugueis) {
            total += aluguel.calcularValor();
        }
        return total;
    }

    private int calcularPontosTotais() {
        int pontos = 0;
        for (Aluguel aluguel : alugueis) {
            pontos += aluguel.calcularPontos();
        }
        return pontos;
    }
}
