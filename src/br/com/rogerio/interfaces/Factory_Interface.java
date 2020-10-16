package br.com.rogerio.interfaces;

import br.com.rogerio.model.Produtos;

/**
 *
 * @author roger
 */
public interface Factory_Interface {
    
    String pagamentoDaCompra(Produtos produto)throws Exception;
    
}
