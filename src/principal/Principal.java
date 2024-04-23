package principal;
import java.util.Scanner;
import visao.MenuPrincipal;
import visao.MenuProduto;
import visao.MenuCliente;
import visao.MenuFornecedor;
public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        MenuProduto menuProduto = new MenuProduto();
        MenuCliente menuCliente = new MenuCliente();
        MenuFornecedor menuFornecedor = new MenuFornecedor();
        String resposta;
        int op;

        do{
            menuPrincipal.mostrarMenuPrincipal();
            op = input.nextInt();
            switch(op){
                case 1:
                    menuCliente.mostrarMenuCliente();
                    break;
                case 2:
                    menuFornecedor.mostrarMenuFornecedor();
                    break;
                case 3:
                    menuProduto.mostrarMenuProduto();
                    break;
                case 4:
                    System.exit(0);
                default: System.out.println("Opção inválida!");
            }
            System.out.println("Deseja continuar?:");
            resposta = input.next();
        }while(resposta.equalsIgnoreCase("Sim"));
    }
}