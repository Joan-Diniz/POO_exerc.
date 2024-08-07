/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainlocadora;

/**
 *
 * @author joanp
 */
class Popular extends Veiculo {
    
    private boolean arCondicionado;

    public Popular(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta, boolean arCondicionado) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.arCondicionado = arCondicionado;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }   

    @Override
    public double calcularValorTotal(int numeroRenovacoes) {
        int renovacoesPagas = Math.max(0, numeroRenovacoes - 1);
        return getValorLocacao() + (renovacoesPagas * getValorMulta());
    }
}


