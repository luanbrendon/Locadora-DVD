package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistroEmprestimo {
    Amigo amigo;
    DVD dvd;
    Date dataEmprestimo;
    Date dataDevolucao;
    private List<Emprestimo> emprestimos;

    public RegistroEmprestimo() {
        this.emprestimos = new ArrayList<>();
    }

    //metodo para emprestar um DVD a um amigo
    public void empresta(Amigo amigo, DVD dvd) {
        if (!estahEmprestado(dvd) && !faixaEtariaAbaixo(amigo, dvd)) {
            Emprestimo emprestimo = new Emprestimo(amigo, dvd);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado com sucesso.");
        }else {
            System.out.println("O DVD não pode ser emprestado.");
        }
    }

    //metodo para devolver um DVD
    public void devolve(DVD dvd) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDvd().equals(dvd)) {
                emprestimos.remove(emprestimo);
                System.out.println("Devolução realizada com sucesso.");
                return;
            }
        }
        System.out.println("Este DVD não está emprestado.");
    }
    //metodo para verificar se um DVD esta emprestado
    private boolean estahEmprestado(DVD dvd) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDvd().equals(dvd)) {
                return true;
            }
        }
        return false;
    }
    //metodo para verificar se a faixa etaria do amigo esta abaixo da faixa etaria do DVD
    private boolean faixaEtariaAbaixo(Amigo amigo, DVD dvd) {
        FaixaEtaria faixaAmigo = amigo.getFaixaEtaria();
        FaixaEtaria faixaDVD = dvd.getFaixaEtaria();
        if (faixaAmigo != null && faixaDVD != null) {
            return faixaAmigo.ehAbaixo(faixaDVD);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Detalhes do Registro de Empréstimo:\n" +
                "Amigo: " + amigo.getNome() + "\n" +
                "DVD emprestado: " + dvd.getTitulo() + "\n" +
                "Data do empréstimo: " + dataEmprestimo + "\n" +
                "Data de devolução: " + dataDevolucao + "\n" +
                "-------------------------------------";
    }
}
