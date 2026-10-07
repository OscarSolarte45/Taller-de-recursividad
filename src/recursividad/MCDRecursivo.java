package recursividad;

import java.util.Scanner;

public class MCDRecursivo {

    public static int mcd(int m, int n) {
        if (n == 0) {
            return m;
        }

        return mcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int m = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int n = entrada.nextInt();

        int resultado = mcd(m, n);

        System.out.println("El M.C.D. de " + m + " y " + n + " es: " + resultado);

        entrada.close();
    }
}
