package com.livrariaheroi.services;

import com.livrariaheroi.data.Biblioteca;
import com.livrariaheroi.entities.Aluguel;
import com.livrariaheroi.entities.Livro;
import com.livrariaheroi.util.IdGenerator;
import com.livrariaheroi.util.ScannerUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.*;

public class AluguelService {
    public static void alugarLivro(int idPessoa) {
        int quantidadeLivrosAlugados = Biblioteca.getInstance().getUsuarios().get(idPessoa).getLivrosAlugados();
        if (quantidadeLivrosAlugados == 2) {
            out.println("""
                    Você já possui 2 livros alugados.
                    Não é possível alugar mais livros.
                    Devolver um livro para alugar outro.""");
        } else {
            // Data de aluguel é a data de devolução é 15 dias após a data de aluguel
            Calendar calendar = Calendar.getInstance();
            Date dataAluguel = calendar.getTime();
            calendar.add(Calendar.DAY_OF_MONTH, 15);
            Date dataDevolucao = calendar.getTime();

            Scanner scanner = ScannerUtil.getScanner();
            out.println("Digite o id do livro: ");
            int idLivro = scanner.nextInt();
            if (Biblioteca.getInstance().getLivros().get(idLivro) == null) {
                out.println("Livro não encontrado.");
            } else {
                Livro livro = Biblioteca.getInstance().getLivros().get(idLivro);
                if (livro.isAlugado()) {
                    out.println("Livro já alugado.");
                } else {
                    int id = IdGenerator.generateAluguelId();
                    Aluguel aluguel = new Aluguel(id, dataAluguel, dataDevolucao, livro,
                            Biblioteca.getInstance().getUsuarios().get(idPessoa));
                    Biblioteca.getInstance().getAlugueis().put(livro.getId(), aluguel);
                    livro.setAlugado(true);
                    out.println("Livro alugado com sucesso.");
                    Biblioteca.getInstance().getUsuarios().get(idPessoa).setLivrosAlugados(quantidadeLivrosAlugados + 1);
                }
            }
        }
    }


    public static void devolverLivro(int idPessoa){
        int quantidadeLivrosAlugados = Biblioteca.getInstance().getUsuarios().get(idPessoa).getLivrosAlugados();
        Scanner scanner = ScannerUtil.getScanner();
        out.println("Digite o id do livro: ");
        int idLivro = scanner.nextInt();
        if (Biblioteca.getInstance().getLivros().get(idLivro) == null) {
            out.println("Livro não encontrado.");
        } else {
            Livro livro = Biblioteca.getInstance().getLivros().get(idLivro);
            if (!livro.isAlugado()) {
                out.println("Livro não alugado.");
            } else {
                Biblioteca.getInstance().getAlugueis().remove(livro.getId());
                livro.setAlugado(false);
                Biblioteca.getInstance().getUsuarios().get(idPessoa).setLivrosAlugados(quantidadeLivrosAlugados - 1);
                out.println("Livro devolvido com sucesso.");
            }
        }
    }

    public static void listarAlugueis() {
        HashMap<Integer, Aluguel> alugueis = Biblioteca.getInstance().getAlugueis();
        for (Aluguel aluguel : alugueis.values()) {
            out.println(aluguel.toString());
        }
    }

    public static void aluguelByIdCliente(int idCliente) {
        HashMap<Integer, Aluguel> alugueis = Biblioteca.getInstance().getAlugueis();
        for (Aluguel aluguel : alugueis.values()) {
            if (aluguel.getPessoa().getId() == idCliente) {
                out.println(aluguel.toString());
            }
        }
    }
}
