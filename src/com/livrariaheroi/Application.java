package com.livrariaheroi;

import com.livrariaheroi.util.DatabaseInicial;

import static com.livrariaheroi.menu.MenuInicial.menu;
import static java.lang.System.*;

public class Application {
    public static void main(String[] args) {
        out.println("Livraia Herois");
        DatabaseInicial.popularBancoDados();
        menu();
    }
}
