package Model;

public class DVD {
    private String titulo;
    private String sinopse;
    private  Pessoa artistaPrincipal;
    private Pessoa diretor;
    private Genero genero;
    private FaixaEtaria faixaEtaria;

    public DVD(String titulo, String sinopse, Pessoa artistaPrincipal, Pessoa diretor, Genero genero, FaixaEtaria faixaEtaria) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.artistaPrincipal = artistaPrincipal;
        this.diretor = diretor;
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Pessoa getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(Pessoa artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }

    public Pessoa getDiretor() {
        return diretor;
    }

    public void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
