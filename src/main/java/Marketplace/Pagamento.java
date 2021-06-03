

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marketplace;
import java.util.*;

public class Pagamento {
    
    public static void main(String[] args){
    
        Funcionarios hora = new Funcionarios();
        
        
        
        hora.setNome ("Algusto");
        hora.setHorasTrab(250f);
        hora.setValorHora(50f);
        //f1.setBonus(1000f);
        
        System.out.println(hora.getNome() + " Tem salário = R$ " 
                + hora.calculaSalario());
        
        
        
        hora.setNome ("Felipe");
        hora.setHorasTrab(250f);
        hora.setValorHora(20f);
        
        System.out.println(hora.getNome() + " Tem salário = R$ " + 
                hora.calculaSalario());
        
        
    }
    
}
