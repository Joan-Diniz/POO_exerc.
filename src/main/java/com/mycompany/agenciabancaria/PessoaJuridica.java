/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciabancaria;

/**
 *
 * @author joanp
 */
public class PessoaJuridica extends Cliente {
    private String CNPJ;

    public PessoaJuridica(String Email, String CNPJ, String Nome, String NmrCelular, String Idade) {
        super(Email, CNPJ, Nome, NmrCelular, Idade);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
