/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainlocadora;

/**
 *
 * @author joanp
 */

abstract class Veiculo {
    
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valorLocacao;
    private double valorMulta;
    private boolean disponivel;

    public Veiculo(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.valorMulta = valorMulta;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public abstract double calcularValorTotal(int numeroRenovacoes);

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
