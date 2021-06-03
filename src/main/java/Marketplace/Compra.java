package Marketplace;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Compra {
    
    private int id_da_compra;
    private String id_itens;
    private int quantidades;
    private int valor_total;
    private int data_da_compra;

    public int getId_da_compra() {
        return id_da_compra;
    }

    public void setId_da_compra(int id_da_compra) {
        this.id_da_compra = id_da_compra;
    }

    public String getId_itens() {
        return id_itens;
    }

    public void setId_itens(String id_itens) {
        this.id_itens = id_itens;
    }

    public int getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(int quantidades) {
        this.quantidades = quantidades;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    public int getData_da_compra() {
        return data_da_compra;
    }

    public void setData_da_compra(int data_da_compra) {
        this.data_da_compra = data_da_compra;
    }
    
    
     /*
    public void escreve() {
        // TODO implement here
    }

    public void delete() {
        // TODO implement here
    }
    public void update() {
        // TODO implement here
    }
    public void pequisa_id_da_compra() {
        // TODO implement here
    }

      */
}
