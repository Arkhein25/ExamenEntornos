package compra;

import model.Producto;
import util.Input;

import java.util.List;

public class ComprarProducto {
    public void comprarProducto(List<Producto> productos) {
        // Mostrar listado de productos
        System.out.println("Listado de productos:");
        for (Producto producto : productos) {
            System.out.println("Referencia: " + producto.getReferencia() +
                    ", Unidades: " + producto.getNumeroUnidades() +
                    ", Creado el: " + producto.getCreadoEl() +
                    ", Modificado el: " + (producto.getModificadoEl() != null ? producto.getModificadoEl() : "<Sin información>"));
        }

        // Pedir referencia del producto
        String referencia = Input.leerCadena("Introduce la referencia del producto que deseas comprar: ");

        // Buscar producto por referencia
        Producto producto = productos.stream()
                .filter(p -> p.getReferencia().equals(referencia))
                .findFirst()
                .orElse(null);

        if (producto != null) {
            // Pedir número de unidades a comprar
            int unidadesAComprar = Input.leerEntero("Introduce el número de unidades a comprar: ");

            // Actualizar la cantidad de unidades
            int nuevasUnidades = producto.getNumeroUnidades() + unidadesAComprar;
            if (nuevasUnidades > 127) {
                producto.setNumeroUnidades((byte) 127);
            } else {
                producto.setNumeroUnidades((byte) nuevasUnidades);
            }

            // Actualizar fecha de modificación
            String modificadoEl = Input.leerCadena("Introduce la fecha de modificación (AAAAMMDDTHH:mm): ");
            if (producto.getModificadoEl() == null || !producto.getModificadoEl().equals(modificadoEl)) {
                producto.setModificadoEl(modificadoEl);
            } else {
                System.out.println("La nueva fecha de modificación debe ser diferente a la existente.");
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
