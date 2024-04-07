package Model;

public interface Interface {
    //metodo para imprimir uma mensagem
    void imprime (String mensagem);

    //metodo para imprimir o menu
    void imprimeMenu();

    //metodo para ler um DVD
    DVD leDVD();

    //metodo para ler um amigo
    Amigo leAmigo();

    void leEmprestimo();

    //metodo para alertar sobre a faixa etaria
    void alertaFaixaEtaria(Amigo amigo, DVD dvd);
}
