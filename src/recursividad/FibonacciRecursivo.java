package recursividad;

import java.util.Scanner;

public class FibonacciRecursivo {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el limite de la serie: ");
        int limite = entrada.nextInt();

        System.out.print("Serie de Fibonacci: ");

        int posicion = 0;

        while (fibonacci(posicion) <= limite) {
            System.out.print(fibonacci(posicion) + " ");
            posicion++;
        }

        entrada.close();
    }
}
