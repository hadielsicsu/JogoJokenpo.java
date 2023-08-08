/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jokenpo;
import java.util.Scanner;

/**
 *
 * @author hadielsicsu
 */
public class Jokenpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entradadeDados = new Scanner (System.in);
        
         int j1 = 0;
         int j2 = 0; 
        
         System.out.println("Escolha entre 0, 1 e 2, sendo :"); 
         System.out.println("Pedra = 0 ");
         System.out.println("Papel = 1"); 
         System.out.println("Tesoura = 2");
         
         System.out.println("Jogador 1:");
         j1 = entradadeDados.nextInt();
         
         System.out.println("Jogador 2:");
         j2 = entradadeDados.nextInt();
         
    }
}    
         /*
         switch (j1){
                 case 0:
                     switch (j2){
                         case 0:
                             System.out.println("Empate");
                             break;
                             
                         case 1:
                             System.out.println("Jogador 2 ganhou");
                             break;
                             
                         case 2:
                             System.out.println("Jogador 1 ganhou");
                             break;
                         default:
                             System.out.println("Voce é muito ruim"); 
                             break;
                     }
                     break;
                         
               
                  case 1:
                     switch (j2){
                         case 0:
                             System.out.println("Jogador 1 ganhou");
                             break;
                             
                         case 1:
                             System.out.println("Empatou");
                             break;
                             
                         case 2:
                             System.out.println("Jogador 2 ganhou");
                             break;
                         default:
                             
                             System.out.println("Voce é muito ruim"); 
                             break;
                     }
                     break;  
                     
                     
                   case 2:
                      switch (j2){
                            case 0:
                                System.out.println("Jogador 2 ganhou");
                                break;

                            case 1:
                                System.out.println("Jogador 1 ganhou");
                                break;

                            case 2:
                                System.out.println("Empate");
                                break;
                            default:

                               System.out.println("Voce é muito ruim");
                               break;

                        }
                        break;

  
