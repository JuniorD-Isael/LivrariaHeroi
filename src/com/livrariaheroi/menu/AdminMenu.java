package com.livrariaheroi.menu;

import com.livrariaheroi.controller.AluguelController;
import com.livrariaheroi.controller.LivroController;
import com.livrariaheroi.controller.UsuarioController;
import com.livrariaheroi.util.ScannerUtil;

import java.util.Scanner;

import static java.lang.System.*;

public class AdminMenu {
    public static void showMenu(int idUsuario) {
        Scanner scanner = ScannerUtil.getScanner();
        int opcao = -1;
        while (opcao != 0) {
            out.println("""
                    Menu do administrador
                    1  - Alugar livro
                    2  - Devolver livro
                    3  - Verificar alugueis
                    4  - Listar livros
                    5  - Deletar livros
                    6  - Atualizar livros
                    7  - Listar usuários
                    8  - Cadastrar usuários
                    9 - Deletar usuários
                    0  - Sair
                    """);
            out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> AluguelController.alugarLivro(idUsuario);
                case 2 -> AluguelController.devolverLivro(idUsuario);
                case 3 -> AluguelController.listarAlugueis();
                case 4 -> LivroController.listarLivros();
                case 5 -> LivroController.deletarLivro();
                case 6 -> LivroController.atualizarLivro();
                case 7 -> UsuarioController.listarUsuarios();
                case 8 -> UsuarioController.cadastrarUsuario();
                case 9 -> UsuarioController.deletarUsuario();
                case 0 -> out.println("Saindo...");
                default -> throw new IllegalStateException("Unexpected value: " + opcao);
            }
        }
    }
}
