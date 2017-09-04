package imildo.numero_4;

import java.util.Vector;

/**
 *
 * @author Imildo Sitoe
 */
public class TesteComparacao {

    
    /**
     * Metodo que testa a classe comparacao
     * @param args 
     */
    public static void main(String[] args) {
        Comparacao c = new Comparacao();
        Vector<Boolean> v1 = new Vector();
        Vector<Boolean> v2 = new Vector();

        v1.add(true);
        v1.add(true);
        v1.add(true);
        v1.add(true);

        v2.add(false);
        v2.add(true);
        v2.add(true);
        v2.add(true);

        if (c.compare(v1, v2)) {
            System.out.println("Os vectores sao iguais");
        }else{
            System.out.println("Os vectores sao diferentes");
        }
    }
}
