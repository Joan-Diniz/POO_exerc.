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

public abstract class Usuario {
    
    private String Nome;
    private String Telefone;
    private String Email;
    private String Cpf;
    private ArrayList<Emprestimo> emprestimos;

    public Usuario(String Nome, String Telefone, String Email, String Cpf) {
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Cpf = Cpf;
        this.emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    public abstract boolean podeEmprestar();
    
    public void adicionarEmprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
        
    }
    
    public void removerEmprestimo(Emprestimo emprestimo){
        this.emprestimos.remove(emprestimo);
    }
}
