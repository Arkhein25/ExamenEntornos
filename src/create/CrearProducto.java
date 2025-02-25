package create;

import model.Producto;
import util.Input;

import java.util.List;

public class CrearProducto {
    public void agregarProductos(List<Producto> productos, int numeroDeProductos) {
        for (int i = 0; i < numeroDeProductos; i++) {
            System.out.println("Introduzca los datos del Producto " + (i + 1) + ": ");
            String referencia = Input.leerCadena("Referencia (7 caracteres): ");
            byte numeroUnidades = (byte) Input.leerEntero("Número de unidades (máx 127): ");
            String creadoEl = Input.leerCadena("Fecha de creación (AAAAMMDDTHH:mm): ");
            Producto producto = new Producto(referencia, numeroUnidades, creadoEl);
            productos.add(producto);
        }
    }
}