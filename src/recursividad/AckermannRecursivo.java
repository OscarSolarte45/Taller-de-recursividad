package recursividad;

import java.util.Scanner;

public class AckermannRecursivo {

    public static int ackermann(int m, int n) {

        if (m == 0) {
            return n + 1;
        }

        if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        }

        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de m: ");
        int m = entrada.nextInt();

        System.out.print("Ingrese el valor de n: ");
        int n = entrada.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Los valores de m y n deben ser mayores o iguales a 0.");
        } else {
            int resultado = ackermann(m, n);

            System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado);
        }

        entrada.close();
    }
}
