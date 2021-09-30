package jogo;



import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roger
 */
public class Principal {
    public static void main(String args[]) {
        //Entrada de dados.
        Scanner keyboard = new Scanner(System.in);
        int entrada;
        //Variavel do sistema para geração de um numero aleatório
        int numale = new Random().nextInt(20) + 1; 
        
        //Variavel do sistema para amazenar o numero de tentativas
        int numten = 1;
        
        
        
        out.println("Será que você consegue descobrir o numero??");
        out.println();
        out.println("Digite um numero de 1 a 20:");
            entrada = keyboard.nextInt();
                 
        
              while(entrada != numale) {
                    if (entrada <= 20 && entrada >= 1){
                        
                              
                    out.println ("Numero incorreto, tente novamente!!!");
                    out.println("Digite um numero de 1 a 20:");
                    entrada = keyboard.nextInt();
                    numten++;
                        
                    
                    }else { 
                    out.println("Numero fora do esperado");
                    out.println("Digite um numero de 1 a 20:");
                    entrada = keyboard.nextInt();
                                       
            
                    } 
               
                
                }   
                
            out.println ("Voce acertou!!");
            out.println ("Com: " + numten + " tentativas");
            }
        
    }
    