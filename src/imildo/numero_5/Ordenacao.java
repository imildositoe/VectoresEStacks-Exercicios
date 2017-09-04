package imildo.numero_5;

import java.util.Vector;

/**
 *
 * @author Imildo Sitoe
 */
public class Ordenacao {
    
    /**
     * Metodo que ordena os elementos de um vector
     * @param vector 
     * @return um vector ordenado decrescentemente
     */
    public Vector<Integer> sort(Vector<Integer> vector ) {
        Vector<Integer> novoVector = new Vector<>();
        Integer aux = 0;
        
        for (int i = 0; i < vector.size(); i++) {
            for (int j = i+1; j < vector.size(); j++) {
                if(vector.elementAt(j) > vector.elementAt(i)) {
                    aux = vector.elementAt(j);
                }
            }
            novoVector.add(aux);
        }
        return novoVector;
    }
    
}
