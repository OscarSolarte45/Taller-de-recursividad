package recursividad;
import java.util.Scanner;

public class Sumatoria_recursiva {

    public static int sumatoria(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = entrada.nextInt();

        System.out.println("La sumatoria hasta " + n + " es: " + sumatoria(n));

        entrada.close();
    }
}
