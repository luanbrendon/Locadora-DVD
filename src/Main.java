import java.util.Scanner;
import Model.*;

public class Main {
    private CadastroAmigo cadastroAmigo;
    private CadastroDVD cadastroDVD;
    private Interface interfaceUsuario;
    private RegistroEmprestimo registroEmprestimo;
    private Scanner scanner;

    public Main() {
        this.cadastroAmigo = new CadastroAmigo();
        this.cadastroDVD = new CadastroDVD();
        this.interfaceUsuario = new Usuario();
        this.registroEmprestimo = new RegistroEmprestimo();
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main programa = new Main();
        programa.executar();
    }

    public void executar() {
        boolean continuar = true;
        while (continuar) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastraAmigos();
                    break;
                case 2:
                    cadastraDVDs();
                    break;
                case 3:
                    registraEmprestimos();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }

    public void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Amigo");
        System.out.println("2. Cadastrar DVD");
        System.out.println("3. Registrar Empréstimo");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void cadastraAmigos() {
        interfaceUsuario.imprime("Cadastro de Amigos:");
        Amigo amigo = interfaceUsuario.leAmigo();
        cadastroAmigo.inclui(amigo);
    }

    public void cadastraDVDs() {
        interfaceUsuario.imprime("Cadastro de DVDs:");
        DVD dvd = interfaceUsuario.leDVD();
        cadastroDVD.inclui(dvd);
    }

    public void registraEmprestimos() {
        interfaceUsuario.imprime("Registro de Empréstimos:");
        interfaceUsuario.imprimeMenu();
        DVD dvd = interfaceUsuario.leDVD();
        Amigo amigo = interfaceUsuario.leAmigo();
        registroEmprestimo.empresta(amigo, dvd);
    }
}
