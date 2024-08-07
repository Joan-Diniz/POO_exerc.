/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainlocadora;

/**
 *
 * @author joanp
 */
class PessoaFisica extends Cliente {
    private String cpf;
    private boolean temEmprestimo;

    public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.temEmprestimo = false;
    }

    public boolean isTemEmprestimo() {
        return temEmprestimo;
    }

    public void setTemEmprestimo(boolean temEmprestimo) {
        this.temEmprestimo = temEmprestimo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}

