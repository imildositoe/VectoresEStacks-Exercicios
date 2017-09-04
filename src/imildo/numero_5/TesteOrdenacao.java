package imildo.numero_5;

import java.util.Vector;

/**
 *
 * @author Imildo Sitoe
 */
public class TesteOrdenacao {
    
    /**
     * Metodo que testa a classe Ordenacao
     * @param args 
     */
    public static void main(String[] args) {
        Ordenacao o = new Ordenacao();
        
        Vector<Integer> v1 = new Vector();

        v1.add(10);
        v1.add(7);
        v1.add(16);
        v1.add(0);
        v1.add(23);
        v1.add(-4);
        
        for(Integer i : o.sort(v1)) {
            System.out.println(i);
        }
    }
}
