/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blibioteca;

/**
 *
 * @author joanp
 */

import java.util.ArrayList;

public class Blibioteca {
    
    private String Nome;
    private String Endereco;
    private ArrayList<Publicacoes> publicacoes;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public Blibioteca(String Nome, String Endereco, ArrayList<Publicacoes> publicacoes, ArrayList<Usuario> usuarios, ArrayList<Emprestimo> emprestimos) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.publicacoes = publicacoes;
        this.usuarios = usuarios;
        this.emprestimos = emprestimos;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public ArrayList<Publicacoes> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacoes> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    public void realizarEmprestimo(Usuario usuario, Publicacoes publicacoes ){
        
        if (!publicacaoEmprestada(publicacoes)){
            if (usuario.podeEmprestar()){
                Emprestimo emprestimo = new Emprestimo(usuario, publicacoes);
                this.emprestimos.add(emprestimo);
            } else {
                System.out.println("Usuario atingiu o limite de emprestimos.");
            }
            } else {
                    System.out.println("Publicacao ja esta emprestada.");
           }
        }
    
    public boolean publicacaoEmprestada(Publicacoes publicacoes){
        for (Emprestimo emprestimo : emprestimos){
            if(emprestimo.getPublicacoes().equals(publicacoes)){
                return true;
            }
        }
        return false;
    }
        
    }
        
        
        
    

