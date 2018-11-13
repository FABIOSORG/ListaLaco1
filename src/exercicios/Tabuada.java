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
public class Tabuada {
    public static void main(String[] args) {

int tabuada;        
int conttabuada = 0;        
int contx=0;


tabuada=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inteiro da tabuada a ser calculada"));

while ( contx <= 10){


conttabuada = contx*tabuada;

JOptionPane.showMessageDialog(null,tabuada+" x "+contx+"="+conttabuada);
contx= contx+1;
}

}
}

