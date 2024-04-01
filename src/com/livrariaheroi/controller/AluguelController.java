package com.livrariaheroi.controller;

import com.livrariaheroi.services.AluguelService;

public class AluguelController {
    public static void alugarLivro(int idPessoa){
        AluguelService.alugarLivro(idPessoa);
    }

    public static void devolverLivro(int IdPessoa) {
        AluguelService.devolverLivro(IdPessoa);
    }

    public static void listarAlugueis() {
        AluguelService.listarAlugueis();
    }

    public static void aluguelByIdCliente(int idCliente) {
        AluguelService.aluguelByIdCliente(idCliente);
    }
}
