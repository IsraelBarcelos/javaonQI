package vision;

import java.util.ArrayList;
import java.util.Scanner;
import model.Produto;

/**
 *
 * @author Israel Barcelos
 */
public class Teste {

    public static void main(String[] args) {
        Produto n = new Produto();
        Scanner leia = new Scanner(System.in);
        ArrayList<Produto> compras = new ArrayList<>();
        while (true) {
            System.out.println("Digite 1 para inserir novo produto."
                    + "\nDigite 2 para ver a lista de produtos no seu carrinho."
                    + "\nDigite 3 para alterar a lista."
                    + "\nDigite 4 para finalizar a compra."
                    + "\nDigite 0 para terminar o programa.");
            n.pulaLinha(2);
            byte menu = leia.nextByte();
            switch (menu) {
                case 1:
                    System.out.print("Digite o nome do produto desejado: ");
                    String varNome = leia.next();
                    leia.nextLine();
                    System.out.print("Digite a quantidade deste produto: ");
                    int varQuantidade = leia.nextInt();
                    System.out.print("Digite o valor do produto: ");
                    double varValor = leia.nextDouble();
                    compras.add(new Produto(varNome, varValor, varQuantidade));
                    n.pulaLinha(2);
                    break;

                case 2:
                    n.pulaLinha(10);
                    for (Produto varCompra : compras) {
                        System.out.println(varCompra.mostrarResultados());
                        n.pulaLinha(2);
                    }
                    System.out.println("Tecle um algarismo para continuar: ");
                    leia.next();
                    break;

                case 3:
                    for (int i = 0; i < compras.size(); i++) {
                        System.out.println("ID: " + i
                                + "\nElemento de compra: " + compras.get(i).getNome()
                                + "\nValor: " + compras.get(i).getValor()
                                + "\nQuantidade: " + compras.get(i).getQuantidade());
                    }
                    System.out.println("Qual elemento (ID) você deseja editar? ");
                    byte elemento = leia.nextByte();
                    System.out.println("Digite 1 para alterar o nome."
                            + "\n2 para alterar o valor"
                            + "\n3 para alterar a quantidade");
                    byte escolha = leia.nextByte();
                    n.pulaLinha(2);
                    switch (escolha) {
                        default:
                            System.out.println("Opção invalida");
                            n.pulaLinha(2);
                            break;
                        case 1:
                            System.out.println("Digite o nome desejado para o item:");
                            compras.get(elemento).setNome(leia.next());
                            leia.nextLine();
                            n.pulaLinha(2);
                            break;
                        case 2:
                            System.out.println("Digite o valor do produto: ");
                            compras.get(elemento).setValor(leia.nextDouble());
                            leia.nextLine();
                            n.pulaLinha(2);
                            break;
                        case 3:
                            System.out.println("Digite a quantidade do produto: ");
                            compras.get(elemento).setValor(leia.nextInt());
                            leia.nextLine();
                            n.pulaLinha(2);
                            break;
                    }
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            if(menu == 4){
                break;
            }
        }
        n.pulaLinha(50);
        System.out.println("Resultados finais: \n");
        for(Produto varCompras:compras){
            System.out.println(varCompras.mostrarResultados());
            n.pulaLinha(2);
        }
    }
}
