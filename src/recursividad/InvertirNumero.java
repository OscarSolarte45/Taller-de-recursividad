package recursividad;

import java.util.Scanner;

public class InvertirNumero {
    public static int invertir(int n, int invertido) {
        if (n == 0) {
            return invertido;
        }

        int digito = n % 10;
        invertido = invertido * 10 + digito;

        return invertir(n / 10, invertido);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = entrada.nextInt();

        int resultado = invertir(n, 0);

        System.out.println("El numero invertido es: " + resultado);

        entrada.close();
    }
}
