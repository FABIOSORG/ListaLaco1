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
public class CalculoQuatroOperacoes {
    public static void main(String[] args) {
 
   
int opc = 0;
double valor1, valor2, resultado;
while (opc!=5){
    
   opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n 1- Somar\n 2- Subtrair\n 3- Multiplicar\n 4- Dividir\n 5- Sair", JOptionPane.INFORMATION_MESSAGE));
   if(opc==5){
      
      System.exit(0); 
     }
      
   valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
   valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
   
   if(opc==1){
      resultado = valor1+valor2;
      JOptionPane.showMessageDialog(null,"A soma é igual a: "+resultado+" RESULTADO SOMA ");
             }
   if(opc==2){
      resultado= valor1-valor2;
      JOptionPane.showMessageDialog(null,"A subtração é igual a: "+resultado+" RESULTADO SUBTRAÇÃO ");
     }
   if(opc==3){
      resultado= valor1*valor2;
      JOptionPane.showMessageDialog(null,"A multiplicação é igual a: "+resultado+" RESULTADO MULTIPLICAÇÃO ");
     }
   if(opc==4){
      resultado = valor1/valor2;
      JOptionPane.showMessageDialog(null,"A divisão é igual a: "+resultado+" RESULTADO DIVISÃO ");
     }
   
}    
}
}
    