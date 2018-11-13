/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class Idade {
    public static void main(String[] args) {
 int idade = 0;
 int cont1 = 0, cont2 = 0, cont=0;
 while (cont <=9){

 idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")); 	
 
 cont=cont+1;	 
         

  if(idade >= 18){      
            
      cont1 = cont1+1;//contador para idade maior que 18 anos
  
  }else{
      
      cont2= cont2 + 1;//contador para idade menor que 18 anos
      
  }
 }
 
 
  JOptionPane.showMessageDialog(null,"Total de pessoas maiores de 18 anos:\n"+cont2+"\nTotal de pessoas menores de 18 anos:\n"+cont1);
  
 	 
}
}
  
    
    
