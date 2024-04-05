package Model;

import java.util.ArrayList;
import java.util.List;

public class CadastroAmigo {
    private List<Amigo> listaAmigos;

    public CadastroAmigo() {
        this.listaAmigos = new ArrayList<>();
    }

    //metodo para incluir um novo amigo na lista
    public void inclui (Amigo amigo) {
        listaAmigos.add(amigo);
    }

    //metodo para alterar os detalhes de um amigo
    public void altera(int indice, Amigo novoAmigo) {
        if (indice >= 0 && indice < listaAmigos.size()) {
            listaAmigos.set(indice, novoAmigo);
        }else {
            System.out.println("Indice invalido.");
        }
    }
    //metodo para excluir um amigo da lista
    public void exclui(int indice) {
        if (indice>= 0 && indice < listaAmigos.size()) {
            listaAmigos.remove(indice);
        }else {
            System.out.println("indice invalido");
        }
    }
}
