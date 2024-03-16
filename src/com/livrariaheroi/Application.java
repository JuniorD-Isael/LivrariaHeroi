package com.livrariaheroi;

import com.livrariaheroi.controller.LivroController;
import com.livrariaheroi.controller.UsuarioController;
import com.livrariaheroi.util.ScannerUtil;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Livraia Herois");
        menu();
    }

    public static void menu() {
        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Cadastrar um novo usuário" + "\n2 - Listar livros" + "\n3 - Buscar livro" + "\n0 - Sair");
        int opcao = scanner.nextInt();
        while (opcao != 0) {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar um novo usuário" + "\n2 - Listar livros" + "\n3 - Buscar livro" + "\n0 - Sair");
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
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
