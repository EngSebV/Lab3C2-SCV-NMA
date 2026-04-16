//Funcion que reciba como parametro una cola y un dato
//Debe eliminar el dato de la cola
//Imprimir la cola completa
//Eliminar el dato sin usar arrays ni listas, solo con la estructura de datos de la cola
//Sin arrays ni listas, solo con la estructura de datos de la cola

import java.util.LinkedList;
import java.util.Queue;
public class Punto1 {
    public static void main(String[] args) throws Exception {
        Queue<String> cola = new LinkedList<>();
        cola.add("dato1");
        cola.add("dato2");
        cola.add("dato3");
        eliminarDato(cola, "dato2");
    }

    public static void eliminarDato(Queue<String> cola, String dato) {
    int size = cola.size();
    boolean encontrado = false;
    
    for (int i = 0; i < size; i++) {
        String current = cola.poll();
        if (!current.equals(dato) || encontrado) {
            cola.add(current);
        } else {
            encontrado = true; 
        }
    }
    
    System.out.println("Cola después de eliminar:");
    for (String elemento : cola) {
        System.out.println(elemento);
    }
}
}
