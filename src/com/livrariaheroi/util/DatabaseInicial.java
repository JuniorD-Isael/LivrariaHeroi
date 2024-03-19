package com.livrariaheroi.util;

import com.livrariaheroi.entities.Adm;
import com.livrariaheroi.entities.Cliente;
import com.livrariaheroi.entities.Pessoa;
import com.livrariaheroi.data.Biblioteca;

import java.util.HashMap;

public class DatabaseInicial {

    public static void popularBancoDados() {
        HashMap<Integer, Pessoa> usuarios = Biblioteca.getInstance().getUsuarios();

        // Cria alguns usuários
        usuarios.put(IdGenerator.generateUsuarioId(),
                new Adm(IdGenerator.generateUsuarioId(),
                        "Isael Dorneles Jr", "123.123.123-12",
                        "isael@gmail.com", "(31)99999-999", true));
        usuarios.put(IdGenerator.generateUsuarioId(),
                new Cliente(IdGenerator.generateUsuarioId(),
                        "João da Silva", "234.234.234-23",
                        "joao@gmail.com", "(31)88888-888", false));

        usuarios.put(IdGenerator.generateUsuarioId(),
                new Adm(IdGenerator.generateUsuarioId(),
                        "Maria Oliveira", "345.345.345-34",
                        "maria@gmail.com", "(31)77777-777", true));

        usuarios.put(IdGenerator.generateUsuarioId(),
                new Cliente(IdGenerator.generateUsuarioId(),
                        "José Pereira", "456.456.456-45",
                        "jose@gmail.com", "(31)66666-666", false));

        usuarios.put(IdGenerator.generateUsuarioId(),
                new Adm(IdGenerator.generateUsuarioId(),
                        "Ana Souza", "567.567.567-56",
                        "ana@gmail.com", "(31)55555-555", true));

        usuarios.put(IdGenerator.generateUsuarioId(),
                new Cliente(IdGenerator.generateUsuarioId(),
                        "Carlos Ferreira", "678.678.678-67",
                        "carlos@gmail.com", "(31)44444-444", false));
    }
}
