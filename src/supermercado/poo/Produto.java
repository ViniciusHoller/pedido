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
public class Produto {
    String nome; 
    int qnt_estoque;
    double valor;
    
    void alterarpreco( Object produto, double novoPreco){
        this.valor = novoPreco;
}
}
