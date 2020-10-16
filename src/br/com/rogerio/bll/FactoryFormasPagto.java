/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.bll;

import br.com.rogerio.interfaces.Factory_Interface;

/**
 *
 * @author roger
 */
public class FactoryFormasPagto {

    private static FactoryFormasPagto instance;

    private FactoryFormasPagto() {

    }

    public static FactoryFormasPagto getInstance() {
        if (instance == null) {
            instance = new FactoryFormasPagto();
        }
        return instance;
    }

    public Factory_Interface getProdutoEformaDePagto(String formaDePagto) throws Exception {

        Factory_Interface objeto = null;

        if (formaDePagto.equalsIgnoreCase("boleto")) {
            objeto = new Boleto();
        } else if (formaDePagto.equalsIgnoreCase("cartao")) {
            objeto = new Cartao();
        } else if (formaDePagto.equalsIgnoreCase("deposito")) {
            objeto = new Deposito();
        } else if (formaDePagto.equalsIgnoreCase("dinheiro")) {
            objeto = new Dinheiro();
        } else if (formaDePagto.equalsIgnoreCase("transferencia")) {
            objeto = new Transferencia();
        } else {
            throw new Exception("A forma de pagamento deve ser selecionada!\n");
        }
        return objeto;
    }
    
}
