/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainlocadora;

/**
 *
 * @author joanp
 */
class Luxo extends Veiculo {
    private int quantidadeAirbags;
    private int tamanhoPortaMalas;
    private boolean gpsIntegrado;

    public Luxo(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta, int quantidadeAirbags, int tamanhoPortaMalas, boolean gpsIntegrado) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.quantidadeAirbags = quantidadeAirbags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.gpsIntegrado = gpsIntegrado;
    }

    public int getQuantidadeAirbags() {
        return quantidadeAirbags;
    }

    public void setQuantidadeAirbags(int quantidadeAirbags) {
        this.quantidadeAirbags = quantidadeAirbags;
    }

    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public boolean isGpsIntegrado() {
        return gpsIntegrado;
    }

    public void setGpsIntegrado(boolean gpsIntegrado) {
        this.gpsIntegrado = gpsIntegrado;
    }

    
    
    @Override
    public double calcularValorTotal(int numeroRenovacoes) {
        int renovacoesPagas = Math.max(0, numeroRenovacoes - 5);
        return getValorLocacao() + (renovacoesPagas * getValorMulta());
    }
}
