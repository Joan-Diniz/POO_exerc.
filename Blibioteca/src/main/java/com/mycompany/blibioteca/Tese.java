/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blibioteca;
/**
 *
 * @author joanp
 */
import java.util.ArrayList;
import java.util.Date;

public class Tese extends Publicacoes {
    
    private int numeroPaginas;
    private String Resumo;
    private Date dataDefesa;
    private String Instituicao;

    public Tese(int numeroPaginas, String Resumo, Date dataDefesa, String Instituicao, String Titulo, Date DatadePublicacao, ArrayList<Publicacoes> Referencias, ArrayList<Autor> Autores, double valorMulta) {
        super(Titulo, DatadePublicacao, Referencias, Autores, valorMulta);
        this.numeroPaginas = numeroPaginas;
        this.Resumo = Resumo;
        this.dataDefesa = dataDefesa;
        this.Instituicao = Instituicao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getResumo() {
        return Resumo;
    }

    public void setResumo(String Resumo) {
        this.Resumo = Resumo;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicao() {
        return Instituicao;
    }

    public void setInstituicao(String Instituicao) {
        this.Instituicao = Instituicao;
    }
    
      @Override
    public void exibirInformacoes(){
        
        System.out.println("Tese: " + getTitulo());
        System.out.println("Data de Publicacao: " + getDatadePublicacao());
        System.out.println("Numero de Paginas : " + numeroPaginas);
        System.out.println("Resumo: " + Resumo);
        System.out.println("Data de Defesa : " + dataDefesa);
          System.out.println("Instituicao: " + Instituicao);
    }
    
    
}
