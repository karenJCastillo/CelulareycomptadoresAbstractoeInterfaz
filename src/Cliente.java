import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String name;
    private String correo;
    private List<Producto> productosComprados = new ArrayList<>();

    public Cliente(String name, String correo) {
        this.name = name;
        this.correo = correo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() >= cantidad) {
            producto.setCantidadStock(producto.getCantidadStock() - cantidad); // se le quita al Stock la cantidad que se compro
            productosComprados.add(producto); // se agrega a la lista
            System.out.printf("Compra realizada de " + "  "+producto.getNombre() +"    " +"cantidad comprada" + "   "+cantidad);
        } else {
            System.out.printf("no Stock para el producto " +"    "+ producto.getNombre() +"    "+ "que desea comprar en este momento ");
        }
    }

    ;

    public void mostrarCompra() {
        System.out.println("compra realizada por " + name);
        System.out.println("productos comprados");
        for (Producto p : productosComprados) { // lista
            p.mostrarDetalles(); // imprime lo que este en la lista con el metodo qye muestra los detalles

        }

    }
}