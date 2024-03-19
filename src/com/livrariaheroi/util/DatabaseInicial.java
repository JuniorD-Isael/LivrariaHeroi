package com.livrariaheroi.util;

import com.livrariaheroi.entities.Adm;
import com.livrariaheroi.entities.Cliente;
import com.livrariaheroi.entities.Pessoa;
import com.livrariaheroi.data.Biblioteca;

import java.util.HashMap;

public class DatabaseInicial {

    public static void seedData() {
        HashMap<Integer, Pessoa> usuarios = Biblioteca.getInstance().getUsuarios();

        // Cria alguns usuários
        usuarios.put(IdGenerator.generateUsuarioId(),
                new Adm(IdGenerator.generateUsuarioId(),
                        "Isael Dorneles Jr", "123.123.123-12",
                        "isael@gmail.com", "(31)99999-999", true));
        usuarios.put(IdGenerator.generateUsuarioId(),
                new Cliente(IdGenerator.generateUsuarioId(),
                        "João da Silva", "123.123.123-12",
                        "joao@gmail.com", "(31)99999-999", false));

        usuarios.put(IdGenerator.generateUsuarioId(),
                new Adm(IdGenerator.generateUsuarioId(),
                        "Maria da Silva", "123.123.123-12",
                        "maria@gmail.com", "(31)99999-999", true));

        usuarios.put(IdGenerator.generateUsuarioId(),
                new Cliente(IdGenerator.generateUsuarioId(),
                        "José da Silva", "123.123.123-12",
                        "jose@gmail.com,", "(31)99999-999", false));


        // Adicione aqui a lógica para criar livros e aluguéis
    }
}