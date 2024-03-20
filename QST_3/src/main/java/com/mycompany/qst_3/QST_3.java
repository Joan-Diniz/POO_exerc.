/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qst_3;

/**
 *
 * @author joanp
 */
public class QST_3 {

    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.nome = "Bolacha";
        p1.marca = "mabel";
        p1.preco = 2.0;
        p1.atualizarPreco();// aumentando o valor do produto
        p1.cdgUnico = 2112;
        p1.qtdEstoque = 10;
        p1.venda(); //vendendo uma unidade do produto 
        p1.adcEstoque(); //adionando 10 unidades ao estoque apos a venda 
        p1.status(); //fazendo  a impressao de tudo 
        
        Produto p2 = new Produto();
        p2.nome = "Salgadim";
        p2.marca = "cheetos";
        p2.preco = 10.0;
        p2.atualizarPreco();// aumentando o valor do produto
        p2.cdgUnico = 22114;
        p2.qtdEstoque = 0;
        p2.venda(); //vendendo uma unidade do produto porem esta sem estoque !!1
        p2.adcEstoque(); //adionando 10 unidades ao estoque apos a venda 
        p2.venda();//fazendo a venda novamente pois agora ha estoque 
        p2.status(); //fazendo  a impressao de tudo
    }
}
