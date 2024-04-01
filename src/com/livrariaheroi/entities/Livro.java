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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean isAlugado() {
        return alugado;
    }

    @Override
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    @Override
    public String toString() {
        String status = alugado ? "Alugado" : "Disponível";
        return "Id: " + id +
                "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nAno: " + ano +
                "\nAlugado: " + status +
                "\n--------------------------\n";
    }
}
