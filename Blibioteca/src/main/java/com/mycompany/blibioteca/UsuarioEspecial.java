/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blibioteca;

/**
 *
 * @author joanp
 */
public class UsuarioEspecial extends Usuario {

    public UsuarioEspecial(String Nome, String Telefone, String Email, String Cpf) {
        super(Nome, Telefone, Email, Cpf);
    }
    
    @Override
    public boolean podeEmprestar(){
        return true;
    }
    
}
