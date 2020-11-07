/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.bll;

import br.com.rogerio.interfaces.Factory_Interface;
import br.com.rogerio.enumerations.EnumFormaDePagto;

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

    public Factory_Interface getProdutoEformaDePagto(EnumFormaDePagto formaDePagto) throws Exception {

        Factory_Interface objeto = null;

        switch (formaDePagto) {
            case BOLETO:
                objeto = new Boleto();
                break;
            case CARTAO:
                objeto = new Cartao();
                break;
            case DEPOSITO:
                objeto = new Deposito();
                break;
            case DINHEIRO:
                objeto = new Dinheiro();
                break;
            case TRANSFERENCIA:
                objeto = new Transferencia();
                break;
        }
        return objeto;
    }
}
