/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blibioteca;

/**
 *
 * @author joanp
 */

import java.util.ArrayList;
import java.util.Date;

public abstract class Publicacoes {
    
    private String Titulo;
    private Date DatadePublicacao;
    private ArrayList<Publicacoes> Referencias;
    private ArrayList<Autor> Autores;
    private double valorMulta;

    public Publicacoes(String Titulo, Date DatadePublicacao, ArrayList<Publicacoes> Referencias, ArrayList<Autor> Autores, double valorMulta) {
        this.Titulo = Titulo;
        this.DatadePublicacao = DatadePublicacao;
        this.Referencias = new ArrayList<>();
        this.Autores = new ArrayList<>();
        this.valorMulta = valorMulta;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Date getDatadePublicacao() {
        return DatadePublicacao;
    }

    public void setDatadePublicacao(Date DatadePublicacao) {
        this.DatadePublicacao = DatadePublicacao;
    }

    public ArrayList<Publicacoes> getReferencias() {
        return Referencias;
    }

    public void setReferencias(ArrayList<Publicacoes> Referencias) {
        this.Referencias = Referencias;
    }

    public ArrayList<Autor> getAutores() {
        return Autores;
    }

    public void setAutores(ArrayList<Autor> Autores) {
        this.Autores = Autores;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }
    
    public abstract void exibirInformacoes();
        
}
