package seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el límite:");
        int limite = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Serie: ");

        for (int i = 0; i < limite; i++) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        sc.close();
    }
}