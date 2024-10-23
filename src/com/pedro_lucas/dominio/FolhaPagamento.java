package com.pedro_lucas.dominio;
import java.util.List;

public final class FolhaPagamento {

    public static void processarPagamentos(List<Pagavel> pagaveis) {
        for (Pagavel pagavel : pagaveis) {
            System.out.println(pagavel);
        }
    }

    
}
