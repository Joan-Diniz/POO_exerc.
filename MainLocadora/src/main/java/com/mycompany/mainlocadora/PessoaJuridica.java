/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainlocadora;

/**
 *
 * @author joanp
 */
class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeRepresentante;

    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj, String nomeRepresentante) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.nomeRepresentante = nomeRepresentante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }
    
}
