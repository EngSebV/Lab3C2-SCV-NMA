//funcion1 que dadas las pilas p1 y la cola c1 determine si la cola es el inverso de la pila
//Ejemplo: p1 = [1,2,3,4,5] c1 = [5,4,3,2,1] -> true
//Ejemplo: p1 = [1,2,3,4,5] c1 = [5,4,3,2,2] -> false
//Funcion2 que dada una pila P1 y P2 cree una cola C1 con los elementos de p1 que no estan en p2
//Ejemplo: p1 = [1,2,3,4,5] p2 = [3,4] -> c1 = [1,2,5]
//Ejemplo: p1 = [1,2,3,4,5] p2 = [6,7] -> c1 = [1,2,3,4,5]

import java.util.*;

public class Punto7 {
    public static void main(String[] args) {
        // Crear pila
        Stack<Integer> p1 = new Stack<>();
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        p1.push(5);
        
        // Crear cola (inverso)
        Queue<Integer> c1 = new LinkedList<>();
        c1.add(5);
        c1.add(4);
        c1.add(3);
        c1.add(2);
        c1.add(1);
        
        // Función 1
        System.out.println("Función 1: " + esInverso(p1, c1));
        
        // Función 2
        Stack<Integer> p2 = new Stack<>();
        p2.push(3);
        p2.push(4);
        
        Queue<Integer> resultado = funcion2(p1, p2);
        System.out.println("Función 2: " + resultado);
    }
    
    // Función 1: Verifica si la cola es el inverso de la pila
    public static boolean esInverso(Stack<Integer> pila, Queue<Integer> cola) {
        if (pila.size() != cola.size()) {
            return false;
        }
        
        // Crear copia de la cola para no modificarla
        Queue<Integer> copiaCola = new LinkedList<>(cola);
        
        // Recorrer la pila de arriba a abajo
        for (int i = pila.size() - 1; i >= 0; i--) {
            if (pila.get(i) != copiaCola.poll()) {
                return false;
            }
        }
        
        return true;
    }
    
    // Función 2: Crea cola con elementos de P1 que no están en P2
    public static Queue<Integer> funcion2(Stack<Integer> p1, Stack<Integer> p2) {
        Queue<Integer> cola = new LinkedList<>();
        
        // Recorrer P1 respetando el orden
        for (int i = 0; i < p1.size(); i++) {
            int elemento = p1.get(i);
            if (!p2.contains(elemento)) {
                cola.add(elemento);
            }
        }
        
        return cola;
    }
}