package buscar;

import model.Producto;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class BuscarProducto {
    public int buscar(List<Producto> productos, UUID id) {
        Iterator<Producto> iterator = productos.iterator();
        boolean encontrado = false;
        int pos = 0;
        while (iterator.hasNext() && !encontrado) {
            Producto producto = iterator.next();
            if (producto.getId().equals(id)) {
                encontrado = true;
            } else {
                pos++;
            }
        }
        if (encontrado) {
            return pos;
        }
        return -1;
    }
}
