package java.dio;

public class ArvoreBinaria<T> extends Comparable<T>> { // Classe Ar

    private BinNo<T> raiz; // A raiz da árvore

    public ArvoreBinaria() { // Construtor
        this.raiz = null;
    }

    public void inserir(T conteudo) { // Método de inserção
        BinNo<T> novoNo = new BinNo<>(conteudo); // Cria um novo nó
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) { // Método de inserção
        if (atual == null) { // Se a raiz estiver vazia, insere o novo nó
            return novoNo; // Retorna o novo nó
        } else {
            if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
                atual.setNoEsq(inserir(atual.getNoEsq(), novoNo)); // Se o novo nó for menor que o atual, vai para a esquerda
            } else {
                atual.setNoDir(inserir(atual.getNoDir(), novoNo)); // Se o novo nó for maior que o atual, vai para a direita
            }
            return atual; // Retorna o nó atual
        }
    }
}
