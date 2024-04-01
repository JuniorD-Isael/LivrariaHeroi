package com.livrariaheroi.entities;

import java.util.Date;

public class Aluguel {
    private int id;
    private Date dataAluguel;
    private Date dataDevolucao;
    private Livro livro;
    private Pessoa pessoa;

    public Aluguel(int id, Date dataAluguel, Date dataDevolucao, Livro livro_id, Pessoa pessoa) {
        this.id = id;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro_id;
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = this.pessoa;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nData do Aluguel: " + dataAluguel +
                "\nData da devolução: " + dataDevolucao +
                "\nCliente: " + pessoa.getNome() +
                "\nLivro: " + livro.getTitulo() +
                "\n--------------------------\n";
    }
}
