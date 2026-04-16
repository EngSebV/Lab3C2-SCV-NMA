//Mediciones diarias de temperatura por 4 semanas (28 días)
//Estructura de datos dinamica lineal
//Imprimir las tempraturas de los ultimos 21 dias de la ultima a la mas antigua
//Imprimir el promedio de las temperaturas de los ultimos 21 dias
import java.util.LinkedList;

public class Punto3 {
    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> semanas = new LinkedList<>();
        
        // Semana 1 (se descarta)
        LinkedList<Integer> s1 = new LinkedList<>();
        s1.add(30); s1.add(32); s1.add(28); s1.add(31); s1.add(29); s1.add(27); s1.add(33);
        semanas.add(s1);
        
        // Semana 2
        LinkedList<Integer> s2 = new LinkedList<>();
        s2.add(30); s2.add(31); s2.add(29); s2.add(28); s2.add(32); s2.add(30); s2.add(31);
        semanas.add(s2);
        
        // Semana 3
        LinkedList<Integer> s3 = new LinkedList<>();
        s3.add(29); s3.add(28); s3.add(30); s3.add(31); s3.add(29); s3.add(28); s3.add(30);
        semanas.add(s3);
        
        // Semana 4
        LinkedList<Integer> s4 = new LinkedList<>();
        s4.add(31); s4.add(29); s4.add(28); s4.add(30); s4.add(31); s4.add(29); s4.add(28);
        semanas.add(s4);
        
        System.out.println("Últimos 21 días (del más nuevo al más viejo):");
        
        int suma = 0;
        int dia = 28;
        
        // Recorro desde la última semana hasta la semana 2 (índice 1)
        for (int i = 3; i >= 1; i--) {
            for (int j = 6; j >= 0; j--) {
                System.out.println("Día " + dia + ": " + semanas.get(i).get(j));
                suma = suma + semanas.get(i).get(j);
                dia--;
            }
        }
        
        System.out.printf("\nPromedio: %.2f", (suma / 21.0));
    }
}