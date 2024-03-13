package com.livrariaheroi.entities;

import com.livrariaheroi.interfaces.Alugavel;

public class Livro implements Alugavel {

    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private boolean alugado;

    public Livro() {
    }

    public Livro(int id, String titulo, String autor, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public boolean getAlugado() {
        return false;
    }

    @Override
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}
