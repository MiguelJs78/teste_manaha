package visao;

import controlador.Controle;
import gestaoCliente.ClienteComum;

import java.util.Scanner;

public class MenuCliente {
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    Controle controle = new Controle();
    ClienteComum cliente = new ClienteComum();
    Scanner input = new Scanner(System.in);
    int op;

    public void mostrarMenuCliente(){
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Procurar cliente");
        System.out.println("3. Remover cliente");
        System.out.println("4. Listar clientes");
        System.out.println("5. Realizar compra");
        System.out.println("6. Voltar para o menu principal");
        System.out.println("Digite uma opção: ");
        op = input.nextInt();
        switch(op){
            case 1:
                controle.cadastraCliente();
                break;
            case 2:
                controle.procuraCliente();
                break;
            case 3:
                controle.removeCliente();
                break;
            case 4:
                controle.listarClientes();
                break;
            case 5:
                cliente.realizaCompra();
                break;
            case 6:
                menuPrincipal.mostrarMenuPrincipal();
                break;
            default: System.out.println("Opção inválida!");
        }
    }

}
