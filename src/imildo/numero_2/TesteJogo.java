package imildo.numero_2;

import java.util.Stack;

/**
 *
 * @author Imildo Sitoe
 */
public class TesteJogo {

    /**
     * Metodo que testa a classe JogoDaVelha
     *
     * @param args
     */
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        Stack<Integer> stack = new Stack();

        stack.add(20);
        stack.add(0);
        stack.add(12);
        stack.add(2);
        stack.add(17);
        stack.add(9);
        stack.add(14);
        stack.add(4);
        stack.add(19);
        stack.add(15);
        stack.add(13);
        stack.add(11);
        stack.add(8);

        jogo.velha(stack);
    }
}
