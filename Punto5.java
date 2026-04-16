//un bus recorre una ruta de origen a destino, pasando estacion por estacion
//El conductor debe de volver a la estacion de origen,haciendo el mismo recorrido
//Mostrar el recorrido de ida y vuelta
//Estructura de datos dinamica lineal
//Lista enlazada doblemente enlazada
//Imprimir lista
//Invertir lista
//Imprimir lista invertida

import java.util.LinkedList;

public class Punto5 {
    public static void main(String[] args) {
        // Crear la ruta de estaciones (ida)
        LinkedList<String> rutaIda = new LinkedList<>();
        
        // Agregar estaciones
        rutaIda.add("Universidad Arboleda");
        rutaIda.add("Oxxo carrera 11");
        rutaIda.add("Universidad Pedagogica");
        rutaIda.add("Quinta Camacho");
        rutaIda.add("Lourdes");
        
        System.out.println("Ruta escenica:");
        System.out.println();
        
        for (int i = 0; i < rutaIda.size(); i++) {
            System.out.println((i+1) + ". " + rutaIda.get(i));
        }
        
        System.out.println();
        System.out.println("De vuelta: mismo recorrido pero mas triste");
        System.out.println();
        
        for (int i = rutaIda.size() - 1; i >= 0; i--) {
            System.out.println((rutaIda.size() - i) + ". " + rutaIda.get(i));
        }
        
        System.out.println();
        
        // Invertir la lista
        LinkedList<String> rutaVuelta = new LinkedList<>();
        for (int i = rutaIda.size() - 1; i >= 0; i--) {
            rutaVuelta.add(rutaIda.get(i));
        }
        
    }
}