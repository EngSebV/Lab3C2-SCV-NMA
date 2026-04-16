//Estructura de datos dinamica lineal
//Transacciones (depositos y retiros)
//Funcion que calcule total de depositos, total de retiros y el balance final (depositos-retiros)
import java.util.LinkedList;

public class Punto4 {
    public static void main(String[] args) {
        // Lista de transacciones (números positivos = depósitos, negativos = retiros)
        LinkedList<Integer> transacciones = new LinkedList<>();
        
        // Agregar transacciones (depósitos y retiros)
        transacciones.add(500);   // Depósito
        transacciones.add(-200);  // Retiro
        transacciones.add(1000);  // Depósito
        transacciones.add(-150);  // Retiro
        transacciones.add(300);   // Depósito
        transacciones.add(-50);   // Retiro
        transacciones.add(2000);  // Depósito
        
        System.out.println("Transacciones realizadas:");
        System.out.println();
        
        // Mostrar todas las transacciones
        for (int i = 0; i < transacciones.size(); i++) {
            int transaccion = transacciones.get(i);
            if (transaccion > 0) {
                System.out.println("Depósito: +$" + transaccion);
            } else {
                System.out.println("Retiro: $" + transaccion);
            }
        }
        
        // Calcular totales
        int totalDepositos = 0;
        int totalRetiros = 0;
        
        for (int i = 0; i < transacciones.size(); i++) {
            int transaccion = transacciones.get(i);
            
            if (transaccion > 0) {
                totalDepositos = totalDepositos + transaccion;
            } else {
                totalRetiros = totalRetiros + transaccion;
            }
        }
        
        // Calcular balance final
        int balanceFinal = totalDepositos + totalRetiros;  // totalRetiros es negativo
        
        // Mostrar resultados
        System.out.println();
        System.out.println("Total");
        System.out.println("Total de depósitos: $" + totalDepositos);
        System.out.println("Total de retiros: $" + (-totalRetiros));  // Convertir a positivo para mostrar
        System.out.println("Balance final: $" + balanceFinal);
    }
}
