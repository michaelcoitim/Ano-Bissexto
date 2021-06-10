/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anobissexto;

import java.util.Calendar;

/**
 *
 * @author Michael Coitim
 */
public class AnoBissexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calendar ano = Calendar.getInstance();
        int anoAtual = ano.getWeekYear();
        
            // atribuirções de testes 
         anoAtual = 1991;
            
         
         // arry para mostras os dias e os meses
        String mes[]={"jan","fer","mar","abr","mai","jun",
            "jul","ago","set","out","nov","dez"};
        int tod[]= {31,28,30,31,30,31,31,31,30,31,30,31};
        
        // a logica para indentificar o ano Bissexto
        // verificar se o ano é em primeiro caso divisivel por 4 excluindo os que são divisiveis por 100
        // segundo caso os anos que são divisiveis por 4 , 100 e 400 
         if (  (anoAtual%4==0 && anoAtual % 100 !=0)
                 ||(anoAtual %4 ==0 && anoAtual % 100==0 && anoAtual%400==0)){
               
                    System.out.println("Ano "+anoAtual+  " é Bisesto");
                    tod[1]=29;
            }else{
             System.out.println("Ano "+anoAtual);
         }
        
         // percorendo os arrays e mostrando os meses o seus dias 
        for (int c =0; c< mes.length; c++){
           
            System.out.println("O mês  de "+mes[c]+" tem "+tod[c] + " dias");
      }
    }
    
}
