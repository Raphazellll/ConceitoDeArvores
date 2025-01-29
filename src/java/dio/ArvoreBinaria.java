package java.dio;

public class ArvoreBinaria<T extends Comparable<T>> {
    private BinNo<T> raiz;

    public ArvoreBinaria() { // Construtor
        this.raiz = null; // Inicializa a raiz como nula
    }

    public void inserir(T conteudo) { // Método de inserção
        BinNo<T> novoNo = new BinNo<>(conteudo); // Cria um novo nó
        raiz = inserir(raiz, novoNo); // Chama o método de inserção
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) { // Método de inserção
        if (atual == null) { // Se o nó atual for nulo
            return novoNo; // Retorna o novo nó
        } else {
            if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) { // Se o conteúdo do novo nó for menor que o conteúdo do nó atual
                atual.setNoEsq(inserir(atual.getNoEsq(), novoNo)); // Chama o método de inserção para o nó esquerdo
            } else {
                atual.setNoDir(inserir(atual.getNoDir(), novoNo)); // Chama o método de inserção para o nó direito
            }
            return atual; // Retorna o nó atual
        }
    }

    public void exibirInOrdem() { // Método de exibição
        System.out.print("\nExibindo InOrdem: "); // Exibe a mensagem
        exibirInOrdem(this.raiz); // Chama o método de exibição
        System.out.println(); // Pula uma linha
    }

    private void exibirInOrdem(BinNo<T> atual) { // Método de exibição
        if (atual != null) { // Se o nó atual não for nulo
            exibirInOrdem(atual.getNoEsq()); // Chama o método de exibição para o nó esquerdo
            System.out.print(atual.getConteudo() + " "); // Exibe o conteúdo do nó atual
            exibirInOrdem(atual.getNoDir()); // Chama o método de exibição para o nó direito
        }
    }

    public void exibirPreOrdem() { // Método de exibição
        System.out.print("\nExibindo PreOrdem: "); // Exibe a mensagem
        exibirPreOrdem(this.raiz); // Chama o método de exibição
        System.out.println(); // Pula uma linha
    }

    private void exibirPreOrdem(BinNo<T> atual) { // Método de exibição
        if (atual != null) { // Se o nó atual não for nulo
            System.out.print(atual.getConteudo() + " "); // Exibe o conteúdo do nó atual
            exibirPreOrdem(atual.getNoEsq()); // Chama o método de exibição para o nó esquerdo
            exibirPreOrdem(atual.getNoDir()); // Chama o método de exibição para o nó direito
        }
    }

    public void exibirPosOrdem() { // Método de exibição
        System.out.print("\nExibindo PosOrdem: "); // Exibe a mensagem
        exibirPosOrdem(this.raiz); // Chama o método de exibição
        System.out.println(); // Pula uma linha
    }

    private void exibirPosOrdem(BinNo<T> atual) { // Método de exibição
        if (atual != null) { // Se o nó atual não for nulo
            exibirPosOrdem(atual.getNoEsq());  // Chama o método de exibição para o nó esquerdo
            exibirPosOrdem(atual.getNoDir()); // Chama o método de exibição para o nó direito
            System.out.print(atual.getConteudo() + " "); // Exibe o conteúdo do nó atual
        }
    }
}