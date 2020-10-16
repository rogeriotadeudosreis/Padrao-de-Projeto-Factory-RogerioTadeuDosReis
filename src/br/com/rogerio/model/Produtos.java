/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class Produtos {

    private String descricao = "";
    private int quant = 0;
    private double valor = 0;
    private double total = 0;

    public Produtos() {
     
    }

    public Produtos(String descricao, int quant, double valor) {
        this.descricao = descricao;
        this.quant = quant;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return getQuant() * getValor();
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Produto: " + getDescricao() + "\n"
                + "Quant: " + getQuant() + "\n"
                + "Valor unit.: " + getValor() + "\n"
                + "Total: " + getTotal();
    }

}
