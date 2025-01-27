public class anotacoes {

    /*
     * Conceito de Árvores
     * - Estrutura de dados bidimensional
     * - Não linear
     * - Constituída por nós que representam um modelo hierárquico
     * Armazenam os dados com base em relações de dependências.
     * - Listas, Filas e Pilhas são exemplos de estruturas lineares.
     * 
     * Utilização:
     * - Sistemas de arquivos
     * - banco de dados
     * - interfaces gráficas
     * - páginas web
     * 
     * 
     * Representações:
     * 
     * Hierárquica
     * - Cada nó pode ter vários filhos, mas apenas um pai.
     * - Exemplo: Árvore Genealógica
     * Por inclusão
     * - Cada nó pode ter vários pais, mas apenas um filho.
     * - Exemplo: Sistema de arquivos
     * Por parênteses Aninhados
     * - Cada nó pode ter vários filhos e vários pais.
     * 
     * 
     * 
     * ==== Características de uma Árvora Hierárquica ====
     * Nó
     * Raiz
     * Pai e filho
     * Irmão
     * Nível de um nó (Posição hierárquica com relação a raiz.)
     * Altura ou profundidade (grau máximo dos nós)
     * Folha ou nó terminal
     * Nó interno
     * Grau de um nó
     * Subárvora
     * 
     * 
     * ==== Tipos de Árvores ====
     * Árvore Binária
     * - Posição dos nós
     * - Maiores à direita
     * - Menores à esquerda
     * 
     * Árvora AVL
     * Árvora Ordenada
     * Árvore Rubro-Negra
     * Árvore B
     * Árvore B+
     * Árvore Hiperbólica
     * Árvora 2-3
     * Árvore 2-4
     * 
     * 
     * ==== Nó da Árvora Binária ====
     * EXEMPLO:
     * public class BinNo<T> {
     * private T conteudo;
     * private BinNo<T> noEsq;
     * private BinNo<T> noDir;
     * 
     * public BinNo(T conteudo) {
     * this.conteudo = conteudo;
     * this.noEsq = this.noDir = null;
     * }
     * //getters, setters e toString
     * 
     * COMO VOU SABER SE O CONTEÚDO 1 É MENOR OU MAIOR QUE O CONTEÚDO 2?
     * - O conteú do nó tem de ser Comparável.
     * - Implementar a interface Comparable<T> no nó.
     * - Implementar o método compareTo() na classe do nó.
     * - O método compareTo() deve retornar um valor negativo se
     * o conteúdo do nó for menor que o conteúdo do nó passado por parâmetro.
     * 
     * EXEMPLO:
     * public class BinNo<T> extends Comparable<T> {
     * private T conteudo;
     * private BinNo<T> noEsq;
     * private BinNo<T> noDir;
     * 
     * public BinNo(T conteudo) {
     * this.conteudo = conteudo;
     * this.noEsq = this.noDir = null;
     * }
     * //getters, setters e toString
     * 
     * 
     * ====================== A INTERFACE COMPARABLE ======================
     * 
     * public class MeuObjeto implements Comparable<MeuObjetoComparable> {
     * Integer meuValor;
     * String minhaString;
     * 
     * public MeuObjeto(Integer meuValor, String minhaString) {
     * this.meuValor = meuValor;
     * this.minhaString = minhaString;
     * }
     * 
     * @override
     * public int compareTo(MeuObjetoComparable outroObjeto) {
     * return this.meuValor > outro.meuValor ? 1 : this.meuValor < outro.meuValor ?
     * -1 : 0;
     * }
     * 
     * public interface Comparable<T> {
     * public int compareTo(T o);
     * }
     * ====================== A INTERFACE COMPARABLE ======================
     * 
     * 
     * Operações Básicas em Árvores Binárias
     * Inserção
     * - Se o nó for menor que a raiz, vai para a esquerda.
     * - Se o nó for maior que a raiz, vai para a direita.
     * Remoção
     * - Pega o maior elemento da esquerda e coloca no lugar do nó removido.
     * Busca
     * - Busca em profundidade
     * - Busca em largura
     * 
     * Exibição
     * Algoritimo Recursivo
     * 
     * public void showTree(BinNo noAtual) {
     * if (noAtual != null) {
     * showTree(noAtual.getNoEsq());
     * System.out.println(noAtual.getConteudo());
     * showTree(noAtual.getNoDir());
     * }
     * }
     * 
     * 
     * Atravessamento em Árvores Binárias
     * ===============================================================
     * Pré-ordem
     * SAÍDA: - 13, 10, 2, 12, 25, 20, 31 e 29
     * 
     * public void showPreOrder(BinNo atual) {
     * if (atual != null) {
     * System.out.println(atual.getConteudo());
     * showPreOrder(atual.getNoEsq());
     * showPreOrder(atual.getNoDir());
     * }
     * }
     * 
     * 
     * ===============================================================
     * Em-ordem
     * SAÍDA: - 2, 10, 12, 13, 20, 25, 29 e 31
     * 
     * public void showInOrder(BinNo atual) {
     * if (atual != null) {
     * showInOrder(atual.getNoEsq());
     * System.out.println(atual.getConteudo());
     * showInOrder(atual.getNoDir());
     * }
     * }
     * 
     * 
     * ===============================================================
     * Pós-ordem
     * 
     * SAÍDA: - 2, 12, 10, 20, 29, 31, 25 e 13
     * 
     * public void showPostOrder(BinNo atual) {
     * if (atual != null) {
     * showPostOrder(atual.getNoEsq());
     * showPostOrder(atual.getNoDir());
     * System.out.println(atual.getConteudo());
     * }
     * }
     * 
     * 
     * 
     */
}
