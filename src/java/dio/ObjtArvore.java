package java.dio;

public abstract class ObjtArvore<T> implements Comparable<ObjtArvore<T>> {

    @Override
    public abstract boolean equals(Object o); // Método de comparação

    @Override
    public abstract int hashCode(); // Método de comparação

    @Override
    public abstract int compareTo(ObjtArvore<T> outro);

    @Override
    public abstract String toString(); // Método de retorno

}
