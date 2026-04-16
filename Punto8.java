//Funcion que reciba como parametro una pila de enteros aelatorios algunos repetidos y un dato
//Extraer todos los datos iguales al dato recibido como parametro 
//Guardar los datos extraidos en una cola sin modificar el orden de llegada de los datos a la pila
//Imprimir los datos de la cola y el numero de datos extraidos de la pila
//Imprimir la pila luego de extraer los datos

import java.util.*;

public class Punto8 {
    public static void main(String[] args) {
        // Crear pila con números aleatorios (algunos repetidos)
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(2);
        pila.push(8);
        pila.push(3);
        pila.push(5);
        pila.push(1);
        pila.push(5);
        pila.push(4);
        pila.push(5);
        pila.push(7);
        
        int dato = 5; // Dato a buscar y extraer
        
        // Llamar a la función
        extraerDatos(pila, dato);
    }
    
    public static void extraerDatos(Stack<Integer> pila, int dato) {
        // Cola para guardar los datos extraídos
        Queue<Integer> colaExtraidos = new LinkedList<>();
        
        // Pila auxiliar para mantener el orden original
        Stack<Integer> pilaAuxiliar = new Stack<>();
        
        // PASO 1: Sacar todos los elementos de la pila original
        while (!pila.isEmpty()) {
            int elemento = pila.pop();
            
            // Si el elemento es igual al dato, lo guardamos en la cola
            if (elemento == dato) {
                colaExtraidos.offer(elemento);
            } 
            // Si no es igual, lo guardamos en la pila auxiliar
            else {
                pilaAuxiliar.push(elemento);
            }
        }
        
        // PASO 2: Regresar los elementos a la pila original (para mantener el orden)
        while (!pilaAuxiliar.isEmpty()) {
            pila.push(pilaAuxiliar.pop());
        }
        
        // PASO 3: Mostrar resultados
        System.out.println("Datos extraídos (cola): " + colaExtraidos);
        System.out.println("Número de datos extraídos: " + colaExtraidos.size());
        System.out.println();
        System.out.println("Pila modificada: " + pila);
    }
}
