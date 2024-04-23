package visao;

import controlador.Controle;
import gestaoCliente.Cliente;
import gestaoCliente.Fornecedor;

import java.util.Scanner;
public class MenuFornecedor {
    Scanner input = new Scanner(System.in);
    Controle controle = new Controle();
    Cliente fornecedor = new Fornecedor();
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    int op;
    public void mostrarMenuFornecedor(){
        System.out.println("1. Cadastrar novo fornecedor");
        System.out.println("2. Atualizar fornecedor existente");
        System.out.println("3. Exibir detalhes do fornecedor");
        System.out.println("4. Realizar compra com fornecedor");
        System.out.println("5. Voltar para o menu principal");
        System.out.println("Digite uma opção: ");
        op = input.nextInt();
        switch(op){
            case 1:
                controle.cadastroFornecedor();
                break;
            case 2:
                controle.atlFornecedor();
                break;
            case 3:
                controle.dtFornecedor();
                break;
            case 4:
                fornecedor.realizaCompra();
                break;
            case 5:
                menuPrincipal.mostrarMenuPrincipal();
                break;
            default: System.out.println("Opção inexistente!");
        }
    }
}
