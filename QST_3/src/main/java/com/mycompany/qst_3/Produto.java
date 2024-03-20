/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qst_3;

/**
 *
 * @author joanp
 */
public class Produto {
    
    protected String nome;
    protected String marca;
    protected Double preco;
    protected int cdgUnico;
    protected int qtdEstoque = 0;

    public Produto() { //constructor
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.cdgUnico = cdgUnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getCdgUnico() {
        return cdgUnico;
    }

    public void setCdgUnico(int cdgUnico) {
        this.cdgUnico = cdgUnico;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    
    public void atualizarPreco(){
        
        this.setPreco(preco + 5);
        System.out.println("\no valor do produto agora esta 5 reais mais caro!!");
        
    }
    public void adcEstoque(){
        
        if(qtdEstoque >= 0){
            
            this.setQtdEstoque(qtdEstoque + 10);
            System.out.println("\nmais uma unidade do produto foi adicionada!");
        }
        
    }
    
    public void venda(){
        
        if (this.getQtdEstoque()>=1){
            this.setQtdEstoque(qtdEstoque - 1);
            System.out.println("\num item foi vendido");
        }else{
            System.out.println("\nimpossivel relaizar venda pois nao há estoque!!");
        }
    
    }
    
    public void status(){
        
        System.out.println("\nNome: " + this.getNome());
        System.out.println("\nMarca: " + this.getMarca());
        System.out.println("\nPreço " + this.getPreco());
        System.out.println("\nCodigo unico: " + this.getCdgUnico());
        System.out.println("\nQuantida no Estoque: " + this.getQtdEstoque());
        
    }
    
}
