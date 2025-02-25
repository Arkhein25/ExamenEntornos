package util;

import model.Producto;

import java.util.List;

public class Output {
    public static void mostrarListado(List<Producto> productos) {
        System.out.println("ID\tReferencia\tUnidaxdes\tCreado el\tModificado el");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
