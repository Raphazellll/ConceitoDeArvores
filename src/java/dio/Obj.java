package java.dio;

public class Obj implements Comparable<Obj> {
    private Integer valor;

    public Obj(Integer valor) { // Construtor
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) { // Método de comparação
        if (this == o) // Se o objeto for igual
            return true; // Retorna verdadeiro
        if (o == null || getClass() != o.getClass()) // Se o objeto for nulo ou a classe for diferente
            return false; // Retorna falso
        Obj obj = (Obj) o; // Converte o objeto
        return valor.equals(obj.valor); // Retorna o valor
    }

    @SuppressWarnings("static-access")
    @Override
    public int hashCode() { // Método de comparação
        return valor.hashCode(valor); // Retorna o valor
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;
        if (this.valor > outro.valor) {
            i = 1;
        } else if (this.valor < outro.valor) {
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return valor.toString();
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
