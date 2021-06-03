package Marketplace;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Faturamento {
    
    private int codigo_produtos;
    public double Faturamento_Brut;
    public double Faturamento_Liquido;
    public double Tributacao;
    public double salario_foncionario;
    public double politica_de_precos;
    public int quantidade_de_atendimentos;

    public int getCodigo_produtos() {
        return codigo_produtos;
    }

    public void setCodigo_produtos(int codigo_produtos) {
        this.codigo_produtos = codigo_produtos;
    }

    public double getFaturamento_Brut() {
        return Faturamento_Brut;
    }

    public void setFaturamento_Brut(double Faturamento_Brut) {
        this.Faturamento_Brut = Faturamento_Brut;
    }

    public double getFaturamento_Liquido() {
        return Faturamento_Liquido;
    }

    public void setFaturamento_Liquido(double Faturamento_Liquido) {
        this.Faturamento_Liquido = Faturamento_Liquido;
    }

    public double getTributacao() {
        return Tributacao;
    }

    public void setTributacao(double Tributacao) {
        this.Tributacao = Tributacao;
    }

    public double getSalario_foncionario() {
        return salario_foncionario;
    }

    public void setSalario_foncionario(double salario_foncionario) {
        this.salario_foncionario = salario_foncionario;
    }

    public double getPolitica_de_precos() {
        return politica_de_precos;
    }

    public void setPolitica_de_precos(double politica_de_precos) {
        this.politica_de_precos = politica_de_precos;
    }

    public int getQuantidade_de_atendimentos() {
        return quantidade_de_atendimentos;
    }

    public void setQuantidade_de_atendimentos(int quantidade_de_atendimentos) {
        this.quantidade_de_atendimentos = quantidade_de_atendimentos;
    }



    
}
