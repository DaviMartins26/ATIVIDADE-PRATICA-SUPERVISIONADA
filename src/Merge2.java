public class Merge2 {
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
        System.out.println("Inserindo em NO_C o menor elemento: " + elemento);
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
        System.out.print("Fila NO_C: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo; // Move para o próximo nó
        }
        System.out.println();
    }

// converte os array pra lista com NO
public No arrayParaNO(int[] array, int tamanho, String nome) {
    // criando NO aqui dentro pra não confundir com o NO externo, talvez de pra fazer com o externo, mas n sei 
    No elemento = new No(array[0]); // Tenho duvidas se isso conta como um arrayList, acredito que talvez
    No ponteiro = elemento; // mudei os nomes pra não me confundir.
    System.out.println("Adicionando em NO_"+nome+" o elemento "+array[0]); // printa quando o primeiro elemento é adicioado ao NO
    for (int i = 1; i < tamanho; i++) { // controla o andar dos elementos
        System.out.println("Adicionando no NO_"+nome+" o elemento "+array[i]); //printa os demais elementos sendo adicionados ao NO
        ponteiro.proximo = new No(array[i]); // seta qual é o proximo 
        ponteiro = ponteiro.proximo; // faz o ponteiro apontar pro proxino que foi setado em cima
    }

    No atual = elemento; // mesma logica da função exibe filha mas em vez de NO atual = inicio é elemento da logica acima
        System.out.print("Fila NO_"+nome+": ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo; // Move para o próximo nó
        }
        System.out.println();
    return elemento; // retonra o elemento
}

    
    // faz o merge com o NO_A e NO_B fazendo um terceiro NO, sendo ele o C de forma ordenando os elementos apartir do menor
    public void fazerMerge(No NO_A, No NO_B) {
        while (NO_A != null) { // enquanto o ultimo dado do NO_A for != de null fica em while, daria pra colocar && b != tambem, mas pelo tamanho o A ele vai acabar antes
            if (NO_A.dado < NO_B.dado) { // se A for menor vai
                insereFila(NO_A.dado); // vai insetir o dado no NO_A na Fila do NO_C
                NO_A = NO_A.proximo; // e vai pro proximo dado de NO_A
            } else { // se b for maior
                insereFila(NO_B.dado); // vai inserir no C 
                NO_B = NO_B.proximo;
            }
        }
        // como B tem um dado a mais, ele vai ficar de fora de NO_C se depender apenas do while 
        insereFila(NO_B.dado);
        NO_B = NO_B.proximo;

    }

    public static void main(String[] args) {
        Merge2 merger2 = new Merge2();

        
        int[] A = {12, 35, 52, 64};
        int[] B = {5, 15, 23, 55, 75}; 
        No NO_A = merger2.arrayParaNO(A, 4,"A"); // passando tamanho manualmente pra não usar .length
        No NO_B = merger2.arrayParaNO(B, 5,"B"); // e nome pra saber dizerenciar no Print

        merger2.fazerMerge(NO_A, NO_B);
        merger2.exibeFila();
    }
}
