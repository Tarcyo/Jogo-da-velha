/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Tarcyo
 */
public class JogoDaVelha {

   
    
    public static String sorteado="";
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, " O jogo vai começar!.");
        JOptionPane.showMessageDialog(null,"Quem vai começar a jogar é...");
        Random random=new Random();
        int x=random.nextInt(2);
        switch(x){
            case 0:
                sorteado="X";
                break;
            case 1:
                sorteado="O";
                break;
        }
        JOptionPane.showMessageDialog(null, "Quem escolheu "+sorteado+"!");
        Telinha telinha= new Telinha();
        telinha.setVisible(true);
        
    }
    
    
}
