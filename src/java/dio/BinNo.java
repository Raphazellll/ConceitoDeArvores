package java.dio;

public class BinNo<T extends Comparable<T>> { // Classe BinNo
    private T conteudo; // O conteúdo do nó
    private BinNo<T> noEsq; // O nó da esquerda
    private BinNo<T> noDir; // O nó da direita

    public BinNo(T conteudo) { // Construtor
        this.conteudo = conteudo; // Inicializa o conteúdo
        this.noEsq = this.noDir = null; // Inicializa os nós da esquerda e da direita
    }

    public BinNo<T> getNoEsq() { // Método de retorno
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) { // Método de inserção
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() { // Método de retorno
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) { // Método de inserção
        this.noDir = noDir;
    }

    public T getConteudo() { // Método de retorno
        return conteudo;
    }

    public void setConteudo(T conteudo) { // Método de inserção
        this.conteudo = conteudo;
    }

    @Override
    public String toString() { // Método de retorno
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }

}
