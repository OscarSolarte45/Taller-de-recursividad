package recursividad;

import java.util.Scanner;

public class SumarMatrizRecursiva {

    public static int sumarMatriz(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        }

        if (columna == matriz[fila].length) {
            return sumarMatriz(matriz, fila + 1, 0);
        }

        return matriz[fila][columna]
                + sumarMatriz(matriz, fila, columna + 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int m = entrada.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int n = entrada.nextInt();

        int[][] matriz = new int[m][n];

        // Llenar la matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        int resultado = sumarMatriz(matriz, 0, 0);

        System.out.println("La suma de los elementos es: " + resultado);

        entrada.close();
    }
}