package recursividad;

import java.util.Scanner;

public class CopiarCadena {

    public static String copiarCadena(String cadena) {
        if (cadena.isEmpty()) {
            return "";
        }

        return cadena.substring(0, 1) + copiarCadena(cadena.substring(1));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena1 = entrada.nextLine();

        String cadena2 = copiarCadena(cadena1);

        System.out.println("Cadena original: " + cadena1);
        System.out.println("Cadena copiada: " + cadena2);

        entrada.close();
    }
}