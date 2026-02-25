package seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Objeto para leer datos del usuario
        
        System.out.println("Ingresa el límite:");
        int limite = sc.nextInt(); // Cantidad de números a mostrar

        int a = 0; // Primer número de la serie
        int b = 1; // Segundo número de la serie

        System.out.print("Serie: ");

        // Se ejecuta según el límite ingresado
        for (int i = 0; i < limite; i++) {
            
            System.out.print(a + " "); // Imprime el número actual

            int siguiente = a + b; // Calcula el siguiente número
            a = b;                 // El segundo pasa a ser el primero
            b = siguiente;         // El nuevo valor pasa a ser el segundo
        }

        sc.close(); // Cierra el Scanner
    }
}