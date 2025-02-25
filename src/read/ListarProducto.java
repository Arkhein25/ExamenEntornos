package read;

import model.Producto;
import util.Output;

import java.util.List;

public class ListarProducto {
    public void mostrarListado(List<Producto> productos) {
        Output.mostrarListado(productos);
    }
}
