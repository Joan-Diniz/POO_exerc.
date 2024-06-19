/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blibioteca;

/**
 *
 * @author joanp
 */

import java.util.Date;

public class Emprestimo {
    
    private Usuario usuario;
    private Publicacoes publicacoes;
    private Date dataEmprestimo;
    private int numeroRenovacoes;

    public Emprestimo(Usuario usuario, Publicacoes publicacoes, Date dataEmprestimo, int numeroRenovacoes) {
        this.usuario = usuario;
        this.publicacoes = publicacoes;
        this.dataEmprestimo = new Date();
        this.numeroRenovacoes = 0;
    }

    Emprestimo(Usuario usuario, Publicacoes publicacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Publicacoes getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Publicacoes publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getNumeroRenovacoes() {
        return numeroRenovacoes;
    }

    public void setNumeroRenovacoes(int numeroRenovacoes) {
        this.numeroRenovacoes = numeroRenovacoes;
    }
    
    public void renovar(){
        this.numeroRenovacoes++;
    }
   
    public double calcularmulta(){
        if (numeroRenovacoes > 3){
            return (numeroRenovacoes - 3) * publicacoes.getValorMulta();
        }
        return 0;
    }
}
