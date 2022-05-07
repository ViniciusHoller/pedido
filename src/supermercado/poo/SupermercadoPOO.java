/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.poo;

/**
 *
 * @author CEDUP16
 */
public class SupermercadoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Cliente clienteJão = new Cliente();
        clienteJão.nome = "Jão";
        clienteJão.CPF = "958743587";
        clienteJão.Telefone = "Jão";
        
        
        
        final Produto produtoSal = new Produto();
        produtoSal.nome = "sal";
        produtoSal.qnt_estoque = 4;
        produtoSal.valor = 5.00;
         
         
         
        final Pedido pedidoFinal = new Pedido();
        pedidoFinal.codigo = "1";
        pedidoFinal.cliente = clienteJão;
        pedidoFinal.produtos = new Produto[] {produtoSal};
    
}
}