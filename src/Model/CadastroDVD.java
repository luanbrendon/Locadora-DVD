package Model;

import java.util.ArrayList;
import java.util.List;

public class CadastroDVD {
    private List<DVD> dvds;

    public CadastroDVD() {
        this.dvds = new ArrayList<>();
    }
    //metodo para incluir um DVD no cadastro
    public void inclui (DVD dvd) {
        dvds.add(dvd);
    }

    //metodo para alterar um DVD no cadastro
    public void altera(int indice, DVD novoDVD) {
        if (indice >= 0 && indice < dvds.size()) {
            dvds.set(indice, novoDVD);
        }else {
            System.out.println("Índice inválido.");
        }
    }
    //metodo para excluir um DVD do cadastro
    public void exclui(int indice) {
        if (indice >= 0 && indice < dvds.size()) {
            dvds.remove(indice) ;
        }else {
            System.out.println("Índice inválido.");
        }
    }
}
