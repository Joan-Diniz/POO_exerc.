/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciabancaria;

/**
 *
 * @author joanp
 */
public class ContaEspecial extends Conta {
    private Double chequeEspecial;

    public ContaEspecial(Cliente cliente, Double chequeEspecial) {
        super(cliente);
        this.chequeEspecial = chequeEspecial;
    }
    
    @Override
    public void sacar(Double valor) {
        if (valor > 0 && this.getSaldo() + chequeEspecial >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque foi realizado!");
        } else {
            System.out.println("Nao foi possivel realizar o saque!");
        }
    }
}
