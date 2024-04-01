package com.livrariaheroi.menu;

import com.livrariaheroi.controller.LivroController;
import com.livrariaheroi.controller.LoginController;
import com.livrariaheroi.controller.UsuarioController;
import com.livrariaheroi.util.ScannerUtil;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.out;

public class MenuInicial {
    public static void menu() {
        Scanner scanner = ScannerUtil.getScanner();
        int opcao = -1;
        while (opcao != 0) {
            out.println("""
                    Escolha uma das opções abaixo:
                    1 - Cadastrar usuário
                    2 - Fazer login
                    0 - Sair""");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    UsuarioController.cadastrarUsuario();
                    break;
                case 2:
                    LoginController.login();
                    break;
                case 0:
                    out.println("Saindo...");
                    exit(0);
                    break;
                default:
                    out.println("Opção inválida");
                    break;
            }
        }
    }
}
