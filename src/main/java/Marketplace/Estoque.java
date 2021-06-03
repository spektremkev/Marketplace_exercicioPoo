/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marketplace;
import java.time.Period;

import java.time.LocalDate;
 

public class Estoque extends itens{
    private int quant_itens;
    private int data_de_entra;
    private int data_de_saida;
  
       
    public interface Validade{
        Period calculaValidade();
    }
    
        
    /**
    implements Val{
    
        private LocalDate dataValidade;
        
} 
        */
}
