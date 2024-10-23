package com.pedro_lucas.teste;

import com.pedro_lucas.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Freelancer freelancer = new Freelancer("Pedro", 600);
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Lucas", 1412);
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Pedro Lucas", 4, 250);

        List<Pagavel> pagaveis = new ArrayList<>();
        pagaveis.add(freelancer);
        pagaveis.add(funcionarioCLT);
        pagaveis.add(funcionarioHorista);

        FolhaPagamento.processarPagamentos(pagaveis);

    }
}