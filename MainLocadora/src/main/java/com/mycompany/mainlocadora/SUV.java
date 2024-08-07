/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainlocadora;

/**
 *
 * @author joanp
 */
class SUV extends Veiculo {
    
    private int tamanhoPortaMalas;
    private String tipoTracao;
    private String tipoCombustivel;

    public SUV(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta, int tamanhoPortaMalas, String tipoTracao, String tipoCombustivel) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipoTracao = tipoTracao;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    @Override
    public double calcularValorTotal(int numeroRenovacoes) {
        int renovacoesPagas = Math.max(0, numeroRenovacoes - 3);
        return getValorLocacao() + (renovacoesPagas * getValorMulta());
    }
}
