package recursividad;
import java.util.Scanner;

public class SumatoriaFracciones {

    public static double sumatoria(int n) {
        if (n == 1) {
            return 1.0;
        }

        return (1.0 / n) + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = entrada.nextInt();

        System.out.println("La sumatoria es: " + sumatoria(n));

        entrada.close();
    }
}