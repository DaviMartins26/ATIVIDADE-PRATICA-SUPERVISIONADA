import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        Merge merger = new Merge();
        int[] A = {12, 35, 52, 64};
        int[] B = {5, 15, 23, 55, 75};


        while (true){
        System.out.println("\nOque deseja no Menu Principal?\n1-Pilha\n2-Fila\n3-Merge\n4-Sair");
        int tipo = sc.nextInt();
        sc.nextLine();

        switch (tipo){
            case 1:
                boolean voltarMenu = false; // flag pra controlar o loop
                while (!voltarMenu) {
                    System.out.println("\nEm Menu Pilha deseja?\n1-Adicionar elemento\n2-Remover elemento\n3-Ver Pilha\n4-Voltar");
                    int op1 = sc.nextInt();
                    sc.nextLine();
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
                            System.out.println("Voltando....");
                            voltarMenu = true; // sai do while pf
                        default:
                            System.out.println("Opção invalida");
                    }
                }
            

            case 2:
                boolean voltarMenu2= false; // flag pra controlar o loop
                while (!voltarMenu2) {
                    System.out.println("\nEm Menu Fila deseja?\n1-Adicionar elemento\n2-Remover elemento\n3-Ver Fila\n4-Voltar");
                    int op2 = sc.nextInt();
                    sc.nextLine();
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
                            System.out.println("Voltando....");
                            voltarMenu2 = true; // sai do while pf
                        default:
                            System.out.println("Opção invalida");
                        }
                }
            case 3:
                boolean voltarMenu3= false; // flag pra controlar o loop
                while (!voltarMenu3) {
                    System.out.println("Em Menu Marge deseja?\n1-Fazer Marge\n2-Ver Fila do Margez\n3-Voltar");
                    int op3 = sc.nextInt();
                    sc.nextLine();
                    switch (op3) {
                        case 1:
                            System.out.println("Fazendo Marge...");
                            merger.fazerMarge(A,B);
                            merger.exibeFila();
                            break;
                        case 2:
                            merger.exibeFila();
                            break;
                        case 3:
                            System.out.println("Voltando....");
                            voltarMenu3 = true; // sai do while pf    
                        default:
                            System.out.println("Opção invalida");
                    }

                }
                break;
            case 4:
                System.out.println("Saindo....");
                sc.close();
                return;
            default:
                System.out.println("Opção invalida");
        }
    }
}
}