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

        IdGenerator.generateLivroId();
        out.println("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        out.println("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        out.println("Digite de publicação do livro: ");
        int ano = scanner.nextInt();

        livros.put(IdGenerator.generateLivroId(), new Livro(IdGenerator.generateLivroId(), titulo, autor, ano));
    }

    public static void listarLivros() {
    }

    public static void buscarLivro() {

    }

    public static void deletarLivro() {
    }

    public static void atualizarLivro() {
    }
}
