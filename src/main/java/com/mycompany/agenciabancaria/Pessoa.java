/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciabancaria;

/**
 *
 * @author joanp
 */
public class Pessoa{
    
    private static int counter = 1;
    
     private String Email;
     private String Nome;
     private String CPF;
     private String NmrCelular;
     private String Idade;

    public Pessoa(String Email, String CPF, String Nome, String NmrCelular, String Idade) {
        this.Email = Email;
        this.CPF = CPF;
        this.Nome = Nome;
        this.NmrCelular = NmrCelular;
        this.Idade = Idade;
        counter += 1;
    }

     
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNmrCelular() {
        return NmrCelular;
    }

    public void setNmrCelular(String NmrCelular) {
        this.NmrCelular = NmrCelular;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }
  
    @Override
     public String toString(){
         
         return "\nEmail:  " + this.getEmail()+
                 "\nCPF:  " + this.getCPF()+
                 "\nNome:  " + this.getNome() + 
                 "\nNpumero de Celular:  " + this.getNmrCelular()+ 
                 "\nIdade:  " + this.getIdade();
                 
                
         
     }
             
     
     
}
