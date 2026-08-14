import java.util.Objects;

public class DataAniversario {

    private int dia;
    private int mes;

    public DataAniversario(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataAniversario other = (DataAniversario) obj;
        return dia == other.dia && mes == other.mes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d", dia, mes);
    }
}
