package recursividad;

import java.util.Scanner;

public class SumarArregloRecursivo {

    public static int sumar(int[] arreglo, int posicion) {
        if (posicion == arreglo.length) {
            return 0;
        }

        return arreglo[posicion] + sumar(arreglo, posicion + 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores: ");
        int n = entrada.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }

        int resultado = sumar(arreglo, 0);

        System.out.println("La suma de los elementos es: " + resultado);

        entrada.close();
    }
}
