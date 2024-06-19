/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blibioteca;

/**
 *
 * @author joanp
 */
public class Autor {
    
    private String NomeAutor;
    private String Titulacao;

    public Autor(String NomeAutor, String Titulacao) {
        this.NomeAutor = NomeAutor;
        this.Titulacao = Titulacao;
    }

    public String getNomeAutor() {
        return NomeAutor;
    }

    public void setNomeAutor(String NomeAutor) {
        this.NomeAutor = NomeAutor;
    }

    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String Titulacao) {
        this.Titulacao = Titulacao;
    } 
    
}
