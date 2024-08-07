/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainlocadora;

/**
 *
 * @author joanp
 */
class Emprestimo {
    private Cliente cliente;
    private Veiculo veiculo;
    private int numeroRenovacoes;
    private boolean ativo;

    public Emprestimo(Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.numeroRenovacoes = 0;
        this.ativo = true;
        veiculo.setDisponivel(false);
        if (cliente instanceof PessoaFisica) {
            ((PessoaFisica) cliente).setTemEmprestimo(true);
        }
    }

    public void renovar() {
        numeroRenovacoes++;
    }

    public double finalizar() {
        ativo = false;
        veiculo.setDisponivel(true);
        if (cliente instanceof PessoaFisica) {
            ((PessoaFisica) cliente).setTemEmprestimo(false);
        }
        return veiculo.calcularValorTotal(numeroRenovacoes);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getNumeroRenovacoes() {
        return numeroRenovacoes;
    }

    public void setNumeroRenovacoes(int numeroRenovacoes) {
        this.numeroRenovacoes = numeroRenovacoes;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
   
}
