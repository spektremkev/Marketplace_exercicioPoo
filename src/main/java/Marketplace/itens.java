package Marketplace;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.*;

import java.time.Period;
import java.time.LocalDate;

public class itens {
  
    private int produt_cod;
    private String produt_descri;
    private String Marca;
    private double preço;
    //private int Val;
    private int ind_itens;
    
    private LocalDate dataValidade;
    
    public Period calculaValidade() {
         return Period.between(dataValidade, LocalDate.now());
    }
    
    
    public LocalDate getdataValidade(){
        return dataValidade;
    
    }
    
    public void setDateValidade(LocalDate dataValidade){
        this.dataValidade = dataValidade;
    }
    
    

    public int getProdut_cod() {
        return produt_cod;
    }

    public void setProdut_cod(int produt_cod) {
        this.produt_cod = produt_cod;
    }

    public String getProdut_descri() {
        return produt_descri;
    }

    public void setProdut_descri(String produt_descri) {
        this.produt_descri = produt_descri;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }


    public int getInd_itens() {
        return ind_itens;
    }

    public void setInd_itens(int ind_itens) {
        this.ind_itens = ind_itens;
    }
    
    
    
    public void delete() {
        // TODO implement here
    }
    
    public void escreve() {
        // TODO implement here
    }
    
    public void pequisa() {
        // TODO implement here
    }
    
    public void update() {
        // TODO implement here
    }

    
}
