package uem.aula;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Imildo Sitoe
 */
public class IAJSTeste {
    
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        System.out.println("Introduza o numero total de estudantes :");
        int total = e.nextInt();
        
        Vector<Estudante> vector = new Vector<>(total);
        
        System.out.println("Introduza o nome :");
        String nome = e.next();
        
    }
}
