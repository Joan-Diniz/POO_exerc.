/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciabancaria;
import com.mycompany.agenciabancaria.utilitarios.utilitario;

/**
 *
 * @author joanp
 */
public class Conta {
    
    private static int ContadorDeContas = 1;
    
    private int NmrConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta(Pessoa pessoa) {
        this.NmrConta = Conta.ContadorDeContas;
        this.pessoa = pessoa;
        ContadorDeContas +=1;
    }

    public int getNmrConta() {
        return NmrConta;
    }

    public void setNmrConta(int NmrConta) {
        this.NmrConta = NmrConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    

    @Override
    public String toString() {
        return "\nNumero da Conta: " + this.getNmrConta() +
                "\nEmail: " + this.pessoa.getEmail()+
                "\nCPf: " + this.pessoa.getCPF()+
                "\nNome: " + this.pessoa.getNome()+
                "\nNumero de celular: " + this.pessoa.getNmrCelular()+
                "\nIdade: " + this.pessoa.getIdade()+
                "\nSaldo: " + utilitario.doubleToString(this.getSaldo())+
                "\n";
    }
    
    public void depositar(Double valor){
        
        if(valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Seu deposito foi realizado!");
        }else{
            System.out.println("Nao foi possivel realizar o deposito!");
        }
    }
    
    public void sacar (Double valor){
        if(valor >0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque foi realizado!");
        }else{
            System.out.println("Nao foi possivel realizar o saque!");
        }
    }
    
    public void transferir(Conta ContaParaDeposito, Double valor){
        if(valor >0 && this.getSaldo()>= valor){
            setSaldo(getSaldo() - valor);
            
            ContaParaDeposito.saldo = ContaParaDeposito.getSaldo() + valor;
            System.out.println("Sua transferencia foi realizada!");
        }else{
            System.out.println("Snao foi possivel realizar a transferencia!");
        }
        
    }
    
}
