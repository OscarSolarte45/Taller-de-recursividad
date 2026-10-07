package recursividad;

import java.util.Scanner;

public class SumarDigitos {

    public static int sumarDigitos(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumarDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = entrada.nextInt();

        System.out.println("La suma de los digitos es: " + sumarDigitos(n));

        entrada.close();
    }
}
