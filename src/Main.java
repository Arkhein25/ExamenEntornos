import java.util.UUID;

import compra.ComprarProducto;
import create.CrearProducto;
import model.Producto;
import read.ListarProducto;
import venta.VenderProducto;
import buscar.BuscarProducto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        CrearProducto crearProducto = new CrearProducto();
        ListarProducto listarProducto = new ListarProducto();
        VenderProducto venderProducto = new VenderProducto();
        BuscarProducto buscarProducto = new BuscarProducto();
        ComprarProducto comprarProducto = new ComprarProducto();

        crearProducto.agregarProductos(productos, 3);

        System.out.println("\nListado de productos:");
        listarProducto.mostrarListado(productos);

        System.out.println("\nVender producto:");
        venderProducto.venderProducto(productos);

        System.out.println("\nComprar unidades de un producto:");
        comprarProducto.comprarProducto(productos);

        System.out.println("\nListado de productos después de la compra:");
        listarProducto.mostrarListado(productos);

        UUID idBuscar = productos.get(0).getId();
        int posicion = buscarProducto.buscar(productos, idBuscar);
        if (posicion != -1) {
            System.out.println("\nProducto encontrado en la posición: " + posicion);
        } else {
            System.out.println("\nProducto no encontrado.");
        }
    }
}