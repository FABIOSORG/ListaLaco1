/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class EleicaoGremioEstudantil {
    public static void main(String[] args) {
             
 int voto = 0;
 int contchapaA  = 0;
 int contchapaB = 0;
 while (voto != 3){

 voto=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Chapa A ou digite 2 para Chapa B ")); 	
	 
         
 if(voto == 1){  
	 
	 contchapaA = contchapaA+1;
 }
  if(voto == 2){  
	  
	  contchapaB = contchapaB+1;
  }
 }
 
  JOptionPane.showMessageDialog(null,"Total de votos Chapa A: "+Integer.toString(contchapaA));
  JOptionPane.showMessageDialog(null,"Total de votos Chapa B: "+Integer.toString(contchapaB));
  
 	 
}
}
  
            
