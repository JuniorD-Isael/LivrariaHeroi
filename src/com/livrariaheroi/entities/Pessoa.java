package com.livrariaheroi.entities;

public class Pessoa {

    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private boolean isAdmin;

    public Pessoa(int id, String nome, String cpf, String email, String telefone, boolean isAdmin) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nNome: " + nome +
                "\nEmail: "+ email +
                "\nTelefone: "+ telefone;
    }
}
