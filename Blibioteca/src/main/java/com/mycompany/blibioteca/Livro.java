/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blibioteca;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author joanp
 */
public class Livro extends Publicacoes {
    
    private int Edicao;
    private String Editora;
    private String Isbn;

    public Livro(int Edicao, String Editora, String Isbn, String Titulo, Date DatadePublicacao, ArrayList<Publicacoes> Referencias, ArrayList<Autor> Autores, double valorMulta) {
        super(Titulo, DatadePublicacao, Referencias, Autores, valorMulta);
        this.Edicao = Edicao;
        this.Editora = Editora;
        this.Isbn = Isbn;
    }

    public int getEdicao() {
        return Edicao;
    }

    public void setEdicao(int Edicao) {
        this.Edicao = Edicao;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

     @Override
    public void exibirInformacoes(){
        
        System.out.println("Livro: " + getTitulo());
        System.out.println("Data de Publicacao: " + getDatadePublicacao());
        System.out.println("Edicao: " + Edicao);
        System.out.println("Editora: " + Editora);
        System.out.println("ISBN: " + Isbn);
    }
    
    
}
