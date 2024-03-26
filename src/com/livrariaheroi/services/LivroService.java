package com.livrariaheroi.services;

import com.livrariaheroi.data.Biblioteca;
import com.livrariaheroi.entities.Livro;
import com.livrariaheroi.util.IdGenerator;
import com.livrariaheroi.util.ScannerUtil;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.*;

public class LivroService {
    public static void cadastrarLivro() {
        Scanner scanner = ScannerUtil.getScanner();
        scanner.nextLine();
        HashMap<Integer, Livro> livros = Biblioteca.getInstance().getLivros();

        int id = IdGenerator.generateLivroId();
        out.println("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        out.println("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        out.println("Digite de publicação do livro: ");
        int ano = scanner.nextInt();

        livros.put(id, new Livro(id, titulo, autor, ano));
    }

    public static void listarLivros() {
        HashMap<Integer, Livro> livros = Biblioteca.getInstance().getLivros();
        for (Livro livro : livros.values()) {
            out.println(livro.toString());
        }
    }

    public static void buscarLivro() {
        // Buscar livro por id
        out.println("Digite o id do livro: ");
        Scanner scanner = ScannerUtil.getScanner();
        int id = scanner.nextInt();
        HashMap<Integer, Livro> livros = Biblioteca.getInstance().getLivros();
        Livro livro = livros.get(id);
        if (livro != null) {
            out.println(livro.toString());
        } else {
            out.println("Livro não encontrado");
        }
    }

    public static void deletarLivro() {
    }

    public static void atualizarLivro() {
    }
}
