import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        while (true){
        System.out.println("\nOque deseja?\n1-Pilha\n2-Fila\n3-Merge\n4-Sair");
        int tipo = sc.nextInt();

        switch (tipo){
            case 1:
                while (true) {
                    System.out.println("\nEm Pilha deseja?\n1-Adicionar elemento\n2-Remover elemento\n3-Ver Pilha\n4-Voltar");
                    int op1 = sc.nextInt();
                    switch (op1) {
                        case 1:
                            System.out.println("Infomre o elemento:");
                            int elemento1 = sc.nextInt();
                            pilha.insereElemento(elemento1);
                            pilha.exibeLista();
                            break;
                        case 2:
                            pilha.removerTopo();
                            pilha.exibeLista();
                            break;
                        case 3:
                            pilha.exibeLista();
                            break;
                        case 4:
                            System.out.println("Voltando");
                            return;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                }

            case 2:
                while (true){
                    System.out.println("\nEm Fila deseja?\n1-Adicionar elemento\n2-Remover elemento\n3-Ver Fila\n4-Voltar");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            System.out.println("Infomre o elemento:");
                            int elemento1 = sc.nextInt();
                            fila.insereFila(elemento1);
                            fila.exibeFila();
                            break;
                        case 2:
                            fila.removerFila();
                            fila.exibeFila();
                            break;
                        case 3:
                            fila.exibeFila();
                            break;
                        case 4:
                            System.out.println("Voltando");
                            return;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                }
            case 3:
                break;
            case 4:
                System.out.println("Saindo....");
                return;
            default:
                System.out.println("Opção invalida");
        }
    }
}
}