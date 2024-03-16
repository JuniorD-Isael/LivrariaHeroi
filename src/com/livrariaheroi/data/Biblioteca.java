package com.livrariaheroi.data;

import com.livrariaheroi.entities.Aluguel;
import com.livrariaheroi.entities.Livro;
import com.livrariaheroi.entities.Pessoa;

import java.util.HashMap;

public class Biblioteca {
    private HashMap<Integer, Livro> livros;
    private HashMap<Integer, Pessoa> usuarios;
    private HashMap<Integer, Aluguel> alugueis;

    public Biblioteca() {
        this.livros = new HashMap<>();
        this.usuarios = new HashMap<>();
        this.alugueis = new HashMap<>();
    }
}
