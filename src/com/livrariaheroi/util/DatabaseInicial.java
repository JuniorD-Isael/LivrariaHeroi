package com.livrariaheroi.util;

import com.livrariaheroi.entities.Adm;
import com.livrariaheroi.entities.Cliente;
import com.livrariaheroi.entities.Livro;
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

        // Cria alguns livros
        Biblioteca.getInstance().getLivros().put(IdGenerator.generateLivroId(),
                new Livro(IdGenerator.generateLivroId(), "O Senhor dos Anéis", "J.R.R. Tolkien", 1954));

        Biblioteca.getInstance().getLivros().put(IdGenerator.generateLivroId(),
                new Livro(IdGenerator.generateLivroId(), "O Hobbit", "J.R.R. Tolkien", 1937));

        Biblioteca.getInstance().getLivros().put(IdGenerator.generateLivroId(),
                new Livro(IdGenerator.generateLivroId(), "O Silmarillion", "J.R.R. Tolkien", 1977));

        Biblioteca.getInstance().getLivros().put(IdGenerator.generateLivroId(),
                new Livro(IdGenerator.generateLivroId(), "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997));

        Biblioteca.getInstance().getLivros().put(IdGenerator.generateLivroId(),
                new Livro(IdGenerator.generateLivroId(), "Harry Potter e a Câmara Secreta", "J.K. Rowling", 1998));

        Biblioteca.getInstance().getLivros().put(IdGenerator.generateLivroId(),
                new Livro(IdGenerator.generateLivroId(), "Harry Potter e o Prisioneiro de Azkaban", "J.K. Rowling", 1999));
    }
}
