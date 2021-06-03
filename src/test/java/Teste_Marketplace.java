/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Marketplace.categoria_do_itens;
import Marketplace.Faturamento;
import Marketplace.Fornecedores;
import Marketplace.Cliente;
import Marketplace.Compra;
import Marketplace.itens;
import Marketplace.Funcionarios;
import Marketplace.Loja;
import Marketplace.Pessoas;



import java.util.Scanner;



/**
 *
 * @author gabri
 */
public class Teste_Marketplace {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Funcionarios f1 = new Funcionarios();
        Loja f2 = new Loja();
        itens f3 = new itens();
        Fornecedores f4 = new Fornecedores();
        Faturamento f5 = new Faturamento();
        Compra f6 = new Compra();
        categoria_do_itens f7 = new categoria_do_itens();
        Cliente f8 = new Cliente();
        Pessoas f9 = new Pessoas();
        
        System.out.println("-------------------Cliente-----------------------------");
        System.out.println(f8);
        
        
        System.out.println();
        System.out.println("-------------------------------------------------------");
        
        
        
        System.out.println("-------------------Loja--------------------------------");
        System.out.println();
        System.out.println("-------------------------------------------------------");
        
        System.out.println("-------------------itens-------------------------------");
        
        System.out.println(f3);
        System.out.println("-------------------------------------------------------");
        
        
        System.out.println("-------------------Fornecedores------------------------");
        System.out.println(f4);
        System.out.println("-------------------------------------------------------");
        
        System.out.println("-------------------Faturamento-------------------------");
        System.out.println(f5);
        System.out.println("-------------------------------------------------------");
        
        
        System.out.println("--------------------Compra-----------------------------");
        System.out.println(f6);
        System.out.println("-------------------------------------------------------");
        
        
        System.out.println("----------------categoria_do_itens---------------------");
        System.out.println(f7);
        System.out.println("-------------------------------------------------------");
        
        
        System.out.println("-------------------Funcionarios------------------------");
        System.out.println(f1);
        System.out.println("-------------------------------------------------------");
        
        
        
        System.out.println("--------------------Cliente-----------------------------");
        System.out.println(f9);
        System.out.println("-------------------------------------------------------");
        
    }

  

}
