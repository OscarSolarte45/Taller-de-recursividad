package recursividad;

import java.util.Scanner;

public class MultiplicacionRecursiva {

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }

        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = entrada.nextInt();

        int resultado = multiplicar(a, b);

        System.out.println("El resultado de " + a + " x " + b + " es: " + resultado);

        entrada.close();
    }
}
