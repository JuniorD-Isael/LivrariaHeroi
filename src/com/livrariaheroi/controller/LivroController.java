package com.livrariaheroi.controller;

import com.livrariaheroi.services.LivroService;

public class LivroController {
    public static void listarLivros() {
        LivroService.listarLivros();
    }

    public static void buscarLivro() {
        LivroService.buscarLivro();
    }

    public static void cadastrarLivro() {
        LivroService.cadastrarLivro();
    }
}
