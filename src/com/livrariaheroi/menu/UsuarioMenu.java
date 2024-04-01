package com.livrariaheroi.menu;

import com.livrariaheroi.controller.AluguelController;
import com.livrariaheroi.controller.LivroController;
import com.livrariaheroi.util.ScannerUtil;

import java.util.Scanner;

public class UsuarioMenu {
    public static void showMenu(int idUsuario) {
        Scanner scanner = ScannerUtil.getScanner();
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("""
                    Menu do Usuário
                    1 - Listar Livros
                    2 - Alugar Livro
                    3 - Listar meus alugueis
                    4 - Devolver Livro
                    0 - Sair
                    """);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> LivroController.listarLivros();
                case 2 -> AluguelController.alugarLivro(idUsuario);
                case 3 -> AluguelController.aluguelByIdCliente(idUsuario);
                case 4 -> AluguelController.devolverLivro(idUsuario);
                case 0 -> System.out.println("Saindo do Menu do Usuário");
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
