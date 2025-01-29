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
            if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) { // Se o novo nó for menor que o atual
                atual.setNoEsq(inserir(atual.getNoEsq(), novoNo)); // Se o novo nó for menor que o atual, vai para a esquerda
            } else {
                atual.setNoDir(inserir(atual.getNoDir(), novoNo)); // Se o novo nó for maior que o atual, vai para a direita
            }
            return atual; // Retorna o nó atual
        }
    }

    public void exibirInOrdem() { // Método de exibição EM ordem
        System.out.print("\nExibindo InOrdem: "); // Exibe a mensagem
        exibirInOrdem(this.raiz); // Exibe a árvore em ordem
    }

    private void exibirInOrdem(BinNo<T> atual){ // Método de exibição
        if (atual != null) { // Se o nó atual não estiver vazio
            exibirInOrdem(atual.getNoEsq()); // Exibe o nó da esquerda
            System.out.print(atual.getConteudo() + ", "); // Exibe o conteúdo do nó atual
            exibirInOrdem(atual.getNoDir()); // Exibe o nó da direita
        }
    }

    public void exibirPosOrdem() { // Método de exibição POS ordem
        System.out.print("\nExibindo PosOrdem: "); // Exibe a mensagem
        exibirPosOrdem(this.raiz); // Exibe a árvore em ordem
    }

    private void exibirPosOrdem(BinNo<T> atual){ // Método de exibição
        if (atual != null) { // Se o nó atual não estiver vazio
            exibirPosOrdem(atual.getNoEsq()); // Exibe o nó da esquerda
            exibirPosOrdem(atual.getNoDir()); // Exibe o nó da direita
            System.out.print(atual.getConteudo() + ", "); // Exibe o conteúdo do nó atual
        }
    }

    public void exibirPreOrdem() { // Método de exibição PRE ordem
        System.out.print("\nExibindo PreOrdem: "); // Exibe a mensagem
        exibirPreOrdem(this.raiz); // Exibe a árvore em ordem
    }

    private void exibirPreOrdem(BinNo<T> atual){ // Método de exibição
        if (atual != null) { // Se o nó atual não estiver vazio
            System.out.print(atual.getConteudo() + ", "); // Exibe o conteúdo do nó atual 
            exibirPreOrdem(atual.getNoEsq()); // Exibe o nó da esquerda
            exibirPreOrdem(atual.getNoDir()); // Exibe o nó da direita
        }
    }
}
