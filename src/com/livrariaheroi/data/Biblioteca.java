package com.livrariaheroi.data;

import com.livrariaheroi.entities.Aluguel;
import com.livrariaheroi.entities.Livro;
import com.livrariaheroi.entities.Pessoa;

import java.util.HashMap;

public class Biblioteca {
    private HashMap<Integer, Livro> livros;
    private HashMap<Integer, Pessoa> usuarios;
    private HashMap<Integer, Aluguel> alugueis;

    private Biblioteca() {
        this.livros = new HashMap<>();
        this.usuarios = new HashMap<>();
        this.alugueis = new HashMap<>();
    }

    public static Biblioteca getInstance() {
        return new Biblioteca();
    }

    public HashMap<Integer, Aluguel> getAlugueis() {
        return alugueis;
    }

    public HashMap<Integer, Livro> getLivros() {
        return livros;
    }

    public HashMap<Integer, Pessoa> getUsuarios() {
        return usuarios;
    }
}
