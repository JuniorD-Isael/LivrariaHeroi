package com.livrariaheroi.entities;

public class Adm extends Pessoa {

    boolean isAdmin = true;

    public Adm(int id, String nome, String cpf, String email, String telefone, boolean isAdmin) {
        super(id, nome, cpf, email, telefone, isAdmin);
    }

    @Override
    public String toString() {
        return "Id: " + getId() +
                "Nome: " + getNome() +
                "\nCpf: " + getCpf() +
                "\nEmail:" + getEmail() +
                "\nTelefone: " + getTelefone() +
                "\nAdmin: É um administrador." +
                "\n--------------------------\n";
    }
}
