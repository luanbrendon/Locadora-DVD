package Model;

public class FaixaEtaria {
    private int de;
    private int ate;

    public FaixaEtaria(int de, int ate) {
        this.de = de;
        this.ate = ate;
    }

    public int getDe() {
        return de;
    }

    public void setDe(int de) {
        this.de = de;
    }

    public int getAte() {
        return ate;
    }

    public void setAte(int ate) {
        this.ate = ate;
    }
    //metodo para verificar se uma determinada faixa etaria esta abaixo desta faixa etaria
    public boolean ehAbaixo(FaixaEtaria faixa) {
        return faixa.getDe() >= this.de && faixa.getAte() <= this.ate;
    }
}
