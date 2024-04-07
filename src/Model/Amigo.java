package Model;

public class Amigo extends Pessoa{
    private String numTelefone;
    private String email;
    private String endereco;
    private FaixaEtaria faixaEtaria;

    //construtor vazio com inicializacao basica
    public Amigo(String nome) {
        this.numTelefone = "";
        this.email = "";
        this.endereco = "";
    }

    public Amigo(String numTelefone, String email, String endereco, FaixaEtaria faixaEtaria) {
        this.numTelefone = numTelefone;
        this.email = email;
        this.endereco = endereco;
        this.faixaEtaria = faixaEtaria;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }
}
