package Marketplace;
import Marketplace.Loja;
import Marketplace.Funcionarios;
//import Marketplace.Compra;
//import Marketplace.itens;
import Marketplace.Cliente;
import Marketplace.Fornecedores;
//import Marketplace.Pagamento;
        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class interface_1{
    
    public static void main(String[] args){

        Scanner Ler = new Scanner (System.in); 
        Scanner menu = new Scanner (System.in);
        
        Scanner usuario = new Scanner (System.in); 
        Scanner senha = new Scanner (System.in); 
         

    boolean opcao = false ;
   
    
	do {

		System.out.println("\n\n Sistema Comercial de Controle do Marketplace ###");
		System.out.println("\n             #########################");
		System.out.println("             |     1 - Venda         |");
		System.out.println("             |     2 - Vendedor      |");
		System.out.println("             |     3 - Cliente       |");
		System.out.println("             |     4 - Fornecedor    |");
		System.out.println("             |     0 - Sair          |");
		System.out.println("             #########################\n");

		//opcao = menu.nextInt();
		System.out.print("\n");
                
           
              
            int opcao1 = menu.nextInt();
                

		switch (opcao1) {
		case 1:
                    Loja Loja = new Loja( );
                    
                    Loja.setNome("Marketplace");
                    Loja.setCnpj("00000-00");
                    Loja.setId_de_distrito(0);
                    Loja.setEmail("MarketSAC_321@idmarket.net"); 
                    Loja.setTelefone("90000-0000");
                   
                    System.out.println( "Nome:" + Loja.getNome());
                    System.out.println( "CNPJ:" + Loja.getCnpj());
                    System.out.println( "E_mail:" + Loja.getId_de_distrito());
                    System.out.println( "Telefone:" + Loja.getE_mail());
                    System.out.println( "Telefone:" + Loja.getTelefone());
                    
			break;
		case 2:
                    Funcionarios f1 = new Funcionarios();
                    
                    f1.setCargo("estoquisra");
                 
                    System.out.println( "Nome:" + f1.getNome());
                    System.out.println( "Horas Tralhadas:" + f1.getCPF());
                    System.out.println("Cargo" + f1.getCargo());
                    System.out.println( "Hora:" + f1.getHorasTralhadas());
                    
                    
			break;
                                              
		case 3:
                    Cliente f8 = new Cliente();
                    
                    f8.setCodigo_cli("0009901");
                    f8.setNome("Josefina");
                    f8.setRg("00.000.000.-0");
                    f8.setEndereso("Rua das Flores");
                    f8.setCPF("000.000.000-00");
                    f8.setTelefone("00000-0000");
                    
                    System.out.println(f8.getCPF());
                    System.out.println(f8.getCodigo_cli());
                    System.out.println(f8.getEndereso());
                    System.out.println(f8.getNome());
                    System.out.println(f8.getRg());
                    System.out.println(f8.getTelefone());
                            
                            
                    
			break;
                        
                case 4:
                    Fornecedores f4 = new Fornecedores();
                    
                    f4.nome = "Brastemp";
                    f4.codigo = "000000-111";
                    f4.cnpj = "00000-00";
                    f4.e_mail = "Pedidos_Brastemp@idbrastemp.net";
                    f4.telefone = "00000-0000";
                    f4.endereço = "Rua 24 de maio";
                    
                    
                    System.out.println("Codigo:"+ f4.codigo); 
                    System.out.println("Nome:"+ f4.nome);
                    System.out.println("Cnpj:"+ f4.cnpj);
                    System.out.println("E_mail:"+ f4.e_mail);
                    System.out.println("Telefone:"+ f4.telefone);
                    System.out.println("Endereço:"+ f4.endereço);
                    
			break;
		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
	} while (opcao);

                        }

    
    }


