package visao;

import controlador.Controle;

import java.util.Scanner;
public class MenuProduto {

    MenuPrincipal menuPrincipal = new MenuPrincipal();
    Scanner input = new Scanner(System.in);
    Controle controle = new Controle();
    int op;
    public void mostrarMenuProduto(){
        System.out.println("1. Adicionar produto");
        System.out.println("2. Listar produto");
        System.out.println("3. Buscar produto");
        System.out.println("4. Voltar para o menu principal");
        System.out.println("Digite uma opção: ");
        op = input.nextInt();
        switch(op){
            case 1:
                controle.adcionarProduto();
                break;
            case 2:
                controle.listarProdutos();
                break;
            case 3:
                controle.buscarProduto();
                break;
            case 4:
                menuPrincipal.mostrarMenuPrincipal();
                break;
            default: System.out.println("Opção inválida!");
        }
    }
}
