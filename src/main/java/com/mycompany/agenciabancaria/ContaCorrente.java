/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciabancaria;

/**
 *
 * @author joanp
 */
public class ContaCorrente extends Conta {
    
    public ContaCorrente(PessoaFisica cliente) {
        super(cliente);
    }


    @Override
    public void sacar(Double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque foi realizado!");
        } else {
            System.out.println("Nao foi possivel realizar o saque!");
        }
    }
}
