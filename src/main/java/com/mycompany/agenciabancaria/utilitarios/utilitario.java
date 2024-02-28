/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciabancaria.utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author joanp
 */
public class utilitario {
    
    static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");
    
    public static String doubleToString(Double valor){
        return formatandoValores.format(valor);
    }
}
