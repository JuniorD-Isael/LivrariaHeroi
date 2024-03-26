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
        int idUser = IdGenerator.generateUsuarioId();
        usuarios.put(idUser,
                new Adm(idUser,
                        "Isael Dorneles Jr", "123.123.123-12",
                        "isael@gmail.com", "(31)99999-999", true));

        idUser = IdGenerator.generateUsuarioId();
        usuarios.put(idUser,
                new Cliente(idUser,
                        "João da Silva", "234.234.234-23",
                        "joao@gmail.com", "(31)88888-888", false));

        idUser = IdGenerator.generateUsuarioId();
        usuarios.put(idUser,
                new Adm(idUser,
                        "Maria Oliveira", "345.345.345-34",
                        "maria@gmail.com", "(31)77777-777", true));

        idUser = IdGenerator.generateUsuarioId();
        usuarios.put(idUser,
                new Cliente(idUser,
                        "José Pereira", "456.456.456-45",
                        "jose@gmail.com", "(31)66666-666", false));

        idUser = IdGenerator.generateUsuarioId();
        usuarios.put(idUser,
                new Adm(idUser,
                        "Ana Souza", "567.567.567-56",
                        "ana@gmail.com", "(31)55555-555", true));

        idUser = IdGenerator.generateUsuarioId();
        usuarios.put(idUser,
                new Cliente(idUser,
                        "Carlos Ferreira", "678.678.678-67",
                        "carlos@gmail.com", "(31)44444-444", false));

        // Cria alguns livros

        int idLivro = IdGenerator.generateLivroId();
        Biblioteca.getInstance().getLivros().put(idLivro,
                new Livro(idLivro, "O Senhor dos Anéis", "J.R.R. Tolkien", 1954));

        idLivro = IdGenerator.generateLivroId();
        Biblioteca.getInstance().getLivros().put(idLivro,
                new Livro(idLivro, "O Hobbit", "J.R.R. Tolkien", 1937));

        idLivro = IdGenerator.generateLivroId();
        Biblioteca.getInstance().getLivros().put(idLivro,
                new Livro(idLivro, "O Silmarillion", "J.R.R. Tolkien", 1977));
        idLivro = IdGenerator.generateLivroId();
        Biblioteca.getInstance().getLivros().put(idLivro,
                new Livro(idLivro, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997));

        idLivro = IdGenerator.generateLivroId();
        Biblioteca.getInstance().getLivros().put(idLivro,
                new Livro(idLivro, "Harry Potter e a Câmara Secreta", "J.K. Rowling", 1998));

        idLivro = IdGenerator.generateLivroId();
        Biblioteca.getInstance().getLivros().put(idLivro,
                new Livro(idLivro, "Harry Potter e o Prisioneiro de Azkaban", "J.K. Rowling", 1999));
    }
}
