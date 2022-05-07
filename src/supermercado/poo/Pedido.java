/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.poo;

import java.util.Arrays;

/**
 *
 * @author CEDUP16
 */
public class Pedido {
    String codigo;
    Produto[] produtos;
    Cliente cliente;
    
    
    void adicionarProduto(Produto novoProduto){
    produtos = Arrays.copyOf(this.produtos, produtos.length + 1);
    produtos[produtos.length - 1] = novoProduto;
    
    }
 double valorTotal(){
 double somaTotal = 0;
 for (int i = 0; i < produtos.length; i++){
 somaTotal = somaTotal + produtos[i].valor;
 }
 
 return somaTotal;
}
 
 
 
}
