package Model;

import java.util.Scanner;

public class Usuario implements Interface{
    private Scanner scanner;

    public Usuario() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void imprime(String mensagem) {
        System.out.println(mensagem);
    }

    @Override
    public void imprimeMenu() {
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Amigo");
        System.out.println("2. Cadastrar DVD");
        System.out.println("3. Registrar Empréstimo");
    }

    @Override
    public DVD leDVD() {
        imprime("Digite o título do DVD:");
        String titulo = scanner.nextLine();
        imprime("Digite a sinopse do DVD:");
        String sinopse = scanner.nextLine();
        Pessoa artistaPrincipal = lePessoa("Digite o nome do artista principal:");
        Pessoa diretor = lePessoa("Digite o nome do diretor:");
        Genero genero = leGenero();
        FaixaEtaria faixaEtaria = leFaixaEtaria();
        return new DVD(titulo, sinopse, artistaPrincipal, diretor, genero, faixaEtaria);
    }

    @Override
    public Amigo leAmigo() {
        imprime("Digite o nome do Amigo:");
        String nome = scanner.nextLine();
        // Você pode adicionar mais informações aqui conforme necessário para a criação do Amigo
        return new Amigo(nome);
    }

    @Override
    public void leEmprestimo() {

    }

    @Override
    public void alertaFaixaEtaria(Amigo amigo, DVD dvd) {

    }

    // Método para ler uma Pessoa (artista principal ou diretor)
    private Pessoa lePessoa(String mensagem) {
        imprime(mensagem);
        String nome = scanner.nextLine();
        return new Pessoa(nome);
    }

    // Método para ler um Gênero
    private Genero leGenero() {
        imprime("Digite o gênero do DVD:");
        String descricao = scanner.nextLine();
        return new Genero(descricao);
    }

    // Método para ler uma Faixa Etária
    private FaixaEtaria leFaixaEtaria() {
        imprime("Digite a faixa etária do DVD:");
        int de = scanner.nextInt();
        int ate = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner
        return new FaixaEtaria(de, ate);
    }
}
