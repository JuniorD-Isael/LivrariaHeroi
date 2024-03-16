package com.livrariaheroi.entities;

public class Adm extends Pessoa {

    boolean isAdmin = true;

    public Adm(int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
    }

    @Override
    public String toString() {
        return "Adm{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", isAdmin='" + isAdmin + '\'' +
                '}';
    }
}
