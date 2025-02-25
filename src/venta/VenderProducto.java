package venta;

import model.Producto;
import util.Input;

import java.util.List;

public class VenderProducto {
    public void venderProducto(List<Producto> productos) {
        // Mostrar listado de productos
        for (Producto producto : productos) {
            System.out.println("Referencia: " + producto.getReferencia() +
                    ", Unidades: " + producto.getNumeroUnidades() +
                    ", Creado el: " + producto.getCreadoEl() +
                    ", Modificado el: " + (producto.getModificadoEl() != null ? producto.getModificadoEl() : "<Sin información>"));
        }

        // Pedir referencia del producto
        String referencia = Input.leerCadena("Introduce la referencia del producto que deseas vender: ");

        // Buscar producto por referencia
        Producto producto = productos.stream()
                .filter(p -> p.getReferencia().equals(referencia))
                .findFirst()
                .orElse(null);

        if (producto != null) {
            // Pedir número de unidades a vender
            int unidadesAVender = Input.leerEntero("Introduce el número de unidades a vender: ");

            // Actualizar la cantidad de unidades
            if (unidadesAVender >= producto.getNumeroUnidades()) {
                producto.setNumeroUnidades((byte) 0);
            } else {
                producto.setNumeroUnidades((byte) (producto.getNumeroUnidades() - unidadesAVender));
            }

            // Actualizar fecha de modificación
            String modificadoEl = Input.leerCadena("Introduce la fecha de modificación (AAAAMMDDTHH:mm): ");
            producto.setModificadoEl(modificadoEl);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
