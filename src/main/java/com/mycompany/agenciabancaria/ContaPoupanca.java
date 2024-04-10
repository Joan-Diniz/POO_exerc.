/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciabancaria;

/**
 *
 * @author joanp
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(PessoaFisica cliente) {
        super(cliente);
    }

    public void rendimento() {
        setSaldo(getSaldo() * 1.005);
    }
}
