public class Merge {
    // Classe interna para representar um nó da lista
    class No {
        int dado; // Valor armazenado no nó
        No proximo; // Referência para o próximo nó

        // Construtor do nó
        No(int elemento) {
            this.dado = elemento;
            this.proximo = null;
        }
    }

    No inicio = null;
    No fim = null;
    
    // Método para inserir um elemento no final da lista

    public void insereFila(int elemento) {
        No novoNo = new No(elemento);
        System.out.println("Inserindo menor elemento dos Array: "+ elemento);
        if (fim == null){
            // Caso a lista esteja vazia, o início aponta para o novo nó
            inicio = novoNo; // inicio e fim são iguais no primeiro insert correto?
            fim = novoNo;
        }
        else {
            // Caso contrário, percorre a lista até o final
            fim.proximo = novoNo;
            fim = novoNo;
            }
        }

    public void removerFila(){
        //topo = topo.proximo;
        int removido = inicio.dado;
        System.out.println("Removendo elemento: " +removido);
        if (inicio == null){
            System.out.println("Filha Vazia");
        }
        inicio = inicio.proximo; // agora faz sentido pq to apontando que o inicio agora é o proximo elemento depois de inicio
        if (inicio == null){
            fim = null; // quando zerar a fila tem que ferar o final pra n se perder
        }
    }

    public void exibeFila() {
        No atual = inicio;
        System.out.print("Fila Atual: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo; // Move para o próximo nó
        }
        System.out.println();
    }

    // isso deve estar preenchendo a fila se baseando no teste de menor valor abaixo
    public void fazerMarge(int[]A, int[]B){
        int[] indice = {0,0}; // isso é pra controlar o indice que está sendo procurado no array A e B
        int total = 9; // total de indices do A e B

        for (int i = 0; i < total;i++){ // enquanto i for menor que o total
            int valor = pegarMenor(A,B,indice); // chama a função que vai pegar o menor numero com os paremtros
            insereFila(valor); // insere o menor valor em no
        }
    }

    // Logica de pegar o menor valor entre A e B
    public int pegarMenor(int[] A, int[] B, int[] indice) {
        int indiceA = indice[0]; // indice intanciado em fazerMarge
        int indiceB = indice[1]; // eles aumentão acada for da função fazerMarge
        int tamanhoA = 4; // tamanho pra saber quando parar
        int tamanhaoB = 5; // daria pra usar .length mas acredito que isso não pode

        if (indiceA < tamanhoA && indiceB < tamanhaoB) { // E logica pra saber quando parar
            if (A[indiceA] <= B[indiceB]) {
                return A[indice[0]++]; // Fila A aumentando o indice interno
            } else {
                return B[indice[1]++]; // Fila B aumentando o indice interno
            }
        }

        if (indiceA < tamanhoA) { // Fila A aumentando o indice interno
            return A[indice[0]++];
        }

        return B[indice[1]++]; //Fila B aumentando o indice interno
    }

    public static void main(String[] args) {
        Merge merger = new Merge();

        int[] A = {12, 35, 52, 64};
        int[] B = {5, 15, 23, 55, 75};

        merger.fazerMarge(A,B);
        merger.exibeFila();





    }
}

