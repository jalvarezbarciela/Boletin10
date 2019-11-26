/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol10_1;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class Numeros {
    private int num;
    private int num1;
    private int num2;
    public Numeros(){
    
}
    
    public void juego(){
    int valor;
    do{
    do{
    num =Integer.parseInt(JOptionPane.showInputDialog("Di un numero de 1 a 50"));
    num1 =Integer.parseInt(JOptionPane.showInputDialog("Di el numero de intentos"));
    }while(num>50||num<1);
        
    for(;num1>0;num1--){
    do {
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero entre 1 e 50"));
    } while(num>50||num<1);
    
    
    if (num2>num){
    JOptionPane.showMessageDialog(null, "O teu número é maior");
    }
    else if (num2<num){
    JOptionPane.showMessageDialog(null, "O teu número é menor");
    }
    else{
    JOptionPane.showMessageDialog(null, "Acertaste");
    break;
    }
    }
    valor =Integer.parseInt(JOptionPane.showInputDialog("Si quieres parar de jugar pulsa 0"));
}while(valor!=0); 
}    
}

