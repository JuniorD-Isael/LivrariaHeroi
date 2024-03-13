package com.livrariaheroi.controller;

import com.livrariaheroi.services.AluguelService;

public class AluguelController {
    public static void alugarLivro() {
        AluguelService.alugarLivro();
    }

    public static void devolverLivro() {
        AluguelService.devolverLivro();
    }

    public static void listarAlugueis() {
        AluguelService.listarAlugueis();
    }

    public static void buscarAluguel() {
        AluguelService.buscarAluguel();
    }
}
