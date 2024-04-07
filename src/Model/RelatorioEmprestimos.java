package Model;

import java.util.ArrayList;
import java.util.List;

public class RelatorioEmprestimos {
    private List<RegistroEmprestimo> registros;

    public RelatorioEmprestimos() {
        this.registros = new ArrayList<>();
    }
    //metodo para adicionar um registro de emprestimo ao relatorio
    public void addRegistro(RegistroEmprestimo registro) {
        registros.add(registro);
    }

    //metodo para imprimir o relatorio de emprestimos
    public  void imprimeRelatorio() {
        for (RegistroEmprestimo registro : registros) {
            System.out.println(registro.toString());
        }
    }
}
