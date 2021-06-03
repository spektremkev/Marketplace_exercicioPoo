/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marketplace;

import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;


public class Pessoas {
    
    private String Nome;
    private String Rg;
    private String Telefone;
    private String endereso;
    private String CPF;
    
   // public int date2;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome; 
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone ;
    }

    public String getEndereso() {
        return endereso;
    }

    public void setEndereso(String endereso) {
        this.endereso = endereso;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
    
    //calculo de idade 
    
    Calendar c = Calendar .getInstance();
    Date date = c .getTime();
    DateFormat f1 = DateFormat.getDateInstance();
    /*
    Date date2 = f1.parse("29/12;1993");
    System.out.println(date2);
    */
}
