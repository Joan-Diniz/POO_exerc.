/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agenciabancaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author joanp
 */
public class AgenciaBancaria {
    
static Scanner input = new Scanner(System.in);
static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }
    
    public static void operacoes(){
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("------------------- Banco JD -------------------");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("_____ Selecione uma opecao _____");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("OP 1 - Criar conta");
        System.out.println("OP 2 - Depositar");
        System.out.println("OP 3 - Sacar");
        System.out.println("OP 4 - Transferir");
        System.out.println("OP 5 - Listar");
        System.out.println("OP 6 - Sair");
        
        int operacao = input.nextInt();
        
        switch(operacao){
            
            case 1:
                criarConta();
                break;
                
                case 2:
                depositar();
                break;
                
                case 3:
                sacar();
                break;
                
                case 4:
                transferir();
                break;
                
                case 5:
                ContasCriadas();
                break;
                
                case 6:
                    System.out.println("Obrigado e volte sempre");
                    System.exit(0);
                    
                default:
                    System.out.println("Opcao nao existe");
        }
        
    }
    
    public static void criarConta(){
        
        System.out.println("\nNome: ");
        String Nome = input.next();
        
        System.out.println("\nCPF: ");
        String CPF = input.next();
        
        System.out.println("\nEmail: ");
        String Email = input.next();
        
        System.out.println("\nNumero de Celular: ");
        String NmrCelular = input.next();
        
        System.out.println("\nIdade: ");
        String Idade= input.next();
        
        Pessoa cliente = new Pessoa(Email, CPF, Nome, NmrCelular, Idade);
        Conta conta = new Conta(cliente);

        contasBancarias.add(conta);
        System.out.println("Sua conta foi criada ");

        operacoes();
    }
    
    private static Conta encontrarConta(int numeroConta){
        Conta conta = null;
        if(contasBancarias.size() > 0){
            for(Conta contaa : contasBancarias){
                if(contaa.getNmrConta() == numeroConta){
                conta = contaa;
                }
            }
        }
        return conta;
    }
    
    public static void depositar(){
        System.out.println("Numero da conta: ");
        int numeroConta = input.nextInt();
        
        Conta conta = encontrarConta(numeroConta);
        
        if(conta != null){
            System.out.println("Qual valor deseja depositar ?");
            Double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Valor depositado com exito!");
        }else {
            System.out.println("conta nao encontrada");
        }
        operacoes();
    }
    
    public static void sacar(){
        System.out.println("Numero da conta: ");
        int numeroConta = input.nextInt();
        
        Conta conta = encontrarConta(numeroConta);
        
        if(conta != null){
            System.out.println("Qual valor deseja sacar ?");
            Double valorSaque = input.nextDouble();
            conta.sacar(valorSaque);
            
        }else {
            System.out.println("conta nao encontrada");
        }
        operacoes();
    }
    
    public static void transferir(){
        System.out.println("numero da Conta do remetente: ");
        int numeroContaRemetente = input.nextInt();
        
        Conta contaRemetente = encontrarConta(numeroContaRemetente);
        
        if(contaRemetente != null){
            System.out.println("Numero da conta do destinatario: ");
            int numeroContaDestinatario = input.nextInt();
            
            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);
                    
             if(contaDestinatario != null){
                 System.out.println("valor da transferencia: ");
                 Double valor = input.nextDouble();
                 
                 contaRemetente.transferir(contaDestinatario, valor);
             }       
        
    }else{
            System.out.println("Conta para transferencia nao encontrada!");
            
        }
        operacoes();
        
    }
    
    public static void ContasCriadas(){
        if(contasBancarias.size() > 0){
            for(Conta conta : contasBancarias){
                System.out.println(conta);
            }                
        }else{
            System.out.println("Nao ha contas cadastradas!");
        }
        operacoes();
    }
}
