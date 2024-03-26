package com.livrariaheroi.entities;

public class Aluguel {
    private String dataAluguel;
    private String dataDevolucao;
    private String livro_id;
    private String cliente_id;

    public Aluguel(String dataAluguel, String dataDevolucao, String livro_id, String cliente_id) {
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.livro_id = livro_id;
        this.cliente_id = cliente_id;
    }

    public String getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(String dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getLivro() {
        return livro_id;
    }

    public void setLivro(String livro_id) {
        this.livro_id = livro_id;
    }

    public String getCliente() {
        return cliente_id;
    }

    public void setCliente(String cliente_id) {
        this.cliente_id = cliente_id;
    }
}
