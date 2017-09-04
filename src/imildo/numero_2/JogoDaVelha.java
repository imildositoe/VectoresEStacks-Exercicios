package imildo.numero_2;

import java.util.Random;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Imildo Sitoe
 */
public class JogoDaVelha {

    /**
     * Metodo que contem a logica principal do jogo
     *
     * @param s
     */
    public void velha(Stack<Integer> s) {
        int [] s1 = {1,2,12,0,20,18,13,5,9,16};
        int palpite;
        Random r = new Random();

        do {
            palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza um numero de zero a vinte "));
            if (palpite == s1[r.nextInt(s1.length)]) {
                JOptionPane.showMessageDialog(null, "Voce ganhou...\nParabens");
            } else {
                JOptionPane.showMessageDialog(null, "Voce perdeu...\nTente de novo! ");
            }
        } while (palpite != s1[r.nextInt(s1.length)]);
    }
}
