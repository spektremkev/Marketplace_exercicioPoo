
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marketplace;
//import Marketplace.Pessoas;
import Marketplace.Pagamento;



public class Funcionarios extends Pessoas {
    
    Pagamento hora = new Pagamento();
  
   
    private float valorHora;
    private float horasTralhadas;
    //public float Bonus;
    private String cargo;

    public Pagamento getHora() {
        return hora;
    }

    public void setHora(Pagamento hora) {
        this.hora = hora;
    }

    public float getHorasTralhadas() {
        return horasTralhadas;
    }

    public void setHorasTralhadas(float horasTralhadas) {
        this.horasTralhadas = horasTralhadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

      
    public void setValorHora(float vH){
    valorHora = 10;
    }
    
    public void setHorasTrab (float hT){
    horasTralhadas = hT;
    }
    
    public float calculaSalario(){
     return valorHora * horasTralhadas;
    }
  
    
/*
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
  
    */

}