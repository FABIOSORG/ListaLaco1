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
 
   
int opc = 0, opc1 = 0, opc2 = 0, opc3 = 0, opc4 = 0;
double valor1, valor2, resultado;
while (opc!=5){
    
   opc= Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n1- somar\n2- subtrair\n3- Multiplicar\n4- Dividir\n5- Sair"));
   
   if(opc1==1){
      valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
      valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
      resultado = valor1+valor2;
      JOptionPane.showMessageDialog(null,"A soma é igual a: "+resultado+"RESULTADO SOMA");
             }
   if(opc2==2){
      valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
      valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
      resultado= valor2-valor1;
      JOptionPane.showMessageDialog(null,"A subtração é igual a: "+resultado+"RESULTADO SUBTRAÇÃO");
     }
   if(opc3==3){
      valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
      valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
      resultado= valor1*valor2;
      JOptionPane.showMessageDialog(null,"A multiplicação é igual a: "+resultado+"RESULTADO MULTIPLICAÇÃO");
     }
   if(opc4==4){
      valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
      valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
      resultado = valor1/valor2;
      JOptionPane.showMessageDialog(null,"A divisão é igual a: "+resultado+"RESULTADO DIVISÃO");
     }
   
}    
}
}
    