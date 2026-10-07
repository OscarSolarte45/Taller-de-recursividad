package recursividad;

import java.util.Scanner;

public class PotenciaRecursiva {

    public static long potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }

        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = entrada.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = entrada.nextInt();

        long resultado = potencia(base, exponente);

        System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);

        entrada.close();
    }
}
