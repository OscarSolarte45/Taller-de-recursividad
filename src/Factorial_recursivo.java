import java.util.Scanner;

public class Factorial_recursivo {

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        long n = entrada.nextLong();

        System.out.println("El factorial de " + n + " es: " + factorial(n));
        
        entrada.close();
    }
    
}