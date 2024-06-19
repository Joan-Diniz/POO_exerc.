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

public class Artigo extends Publicacoes {
    
    private String Resumo;

    public Artigo(String Resumo, String Titulo, Date DatadePublicacao, ArrayList<Publicacoes> Referencias, ArrayList<Autor> Autores, double valorMulta) {
        super(Titulo, DatadePublicacao, Referencias, Autores, valorMulta);
        this.Resumo = Resumo;
    }

    public String getResumo() {
        return Resumo;
    }

    public void setResumo(String Resumo) {
        this.Resumo = Resumo;
    }
    
    @Override
    public void exibirInformacoes(){
        
        System.out.println("Artigo: " + getTitulo());
        System.out.println("Data de Publicacao: " + getDatadePublicacao());
        System.out.println("Resumo: " + Resumo);
    }
    
}
