package com.livrariaheroi;

import com.livrariaheroi.controller.LivroController;
import com.livrariaheroi.controller.UsuarioController;
import com.livrariaheroi.util.ScannerUtil;

import java.util.Scanner;

import static java.lang.System.*;

public class Application {
    public static void main(String[] args) {
        out.println("Livraia Herois");
        menu();
    }

    public static void menu() {
        Scanner scanner = ScannerUtil.getScanner();
        int opcao = -1;
        while(opcao != 0) {
            out.println("""
                    Escolha uma das opções abaixo:
                    1 - Cadastrar um novo usuário
                    2 - Listar livros
                    3 - Buscar livro
                    0 - Sair""");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    UsuarioController.criarUsuario();
                    break;
                case 2:
                    LivroController.listarLivros();
                    break;
                case 3:
                    LivroController.buscarLivro();
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
