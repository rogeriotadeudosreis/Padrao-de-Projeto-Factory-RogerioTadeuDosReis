/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.bll;

import br.com.rogerio.interfaces.Factory_Interface;
import br.com.rogerio.model.Produtos;

/**
 *
 * @author roger
 */
public class Deposito implements Factory_Interface {

    @Override
    public String pagamentoDaCompra(Produtos produto) throws Exception {
        String formaDePagamento = "Depósito";
        double taxa = 0.5;
        double totalRecebido =(produto.getTotal() * taxa / 100) + produto.getTotal();

        if (produto.getValor() <= 0) {
            throw new Exception("O valor do produto não pode ser 0\nVerifique!\n");
        }
        if (produto.getQuant() <= 0) {
            throw new Exception("A quantidade do produto não pode ser 0\nVerifique!\n");
        }

        String dadosDaCompra = " ---------- Dados da Compra e Pagamento ---------- \n"
                + "\nDescrição do produto...: " + produto.getDescricao().toUpperCase() + "\n"
                + "Quant. do produto......: " + produto.getQuant() + "\n"
                + "Valor unitário.........: " + produto.getValor() + "\n"
                + "Forma de pagamento.....: " + formaDePagamento + "\n"
                + "Taxa para esta operação; " + taxa + " %\n"
                + "Total total recebido..R$ " + totalRecebido + "\n";

        return dadosDaCompra;
    }

}
