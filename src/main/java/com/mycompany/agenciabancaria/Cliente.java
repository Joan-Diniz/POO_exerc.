/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciabancaria;

/**
 *
 * @author joanp
 */
public abstract class Cliente extends Pessoa {
    
    public Cliente(String Email, String CPF, String Nome, String NmrCelular, String Idade) {
        super(Email, CPF, Nome, NmrCelular, Idade);
    }
    
    
}