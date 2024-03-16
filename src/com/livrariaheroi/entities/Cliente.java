package com.livrariaheroi.entities;

public class Cliente extends Pessoa{
    public Cliente(int id, String nome, String cpf, String email, String telefone, boolean isAdmin) {
        super(id, nome, cpf, email, telefone, isAdmin);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                '}';
    }
}
