package com.livrariaheroi.entities;

public class Usuario extends Pessoa{
    public Usuario(int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                '}';
    }
}
