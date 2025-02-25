package util;

import java.util.Scanner;
import java.util.Locale;

public class Input {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }
}