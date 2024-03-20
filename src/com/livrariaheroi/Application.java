package com.livrariaheroi;

import com.livrariaheroi.controller.LivroController;
import com.livrariaheroi.controller.UsuarioController;
import com.livrariaheroi.util.DatabaseInicial;
import com.livrariaheroi.util.ScannerUtil;

import java.util.Scanner;

import static java.lang.System.*;

public class Application {
    public static void main(String[] args) {
        out.println("Livraia Herois");
        DatabaseInicial.popularBancoDados();
        menu();
    }

    public static void menu() {
        Scanner scanner = ScannerUtil.getScanner();
        int opcao = -1;
        while (opcao != 0) {
            out.println("""
                    Escolha uma das opções abaixo:
                    1 - Cadastrar um novo usuário
                    2 - Listar usuários
                    3 - Cadastar um novo livro
                    4 - Listar livros
                    5 - Buscar livro
                    0 - Sair""");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    UsuarioController.criarUsuario();
                    break;
                case 2:
                    UsuarioController.listarUsuarios();
                    break;
                case 3:
                    LivroController.cadastrarLivro();
                    break;
                case 4:
                    LivroController.listarLivros();
                    break;
                case 5:
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
