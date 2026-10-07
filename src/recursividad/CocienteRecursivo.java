package recursividad;

import java.util.Scanner;

public class CocienteRecursivo {

    public static int cociente(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        }

        return 1 + cociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = entrada.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = entrada.nextInt();

        if (divisor == 0) {
            System.out.println("No se puede dividir entre cero.");
        } else {
            int resultado = cociente(dividendo, divisor);

            System.out.println("El cociente entero es: " + resultado);
        }

        entrada.close();
    }
}
