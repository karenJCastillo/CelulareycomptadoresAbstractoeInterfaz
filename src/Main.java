public class Main {
    public static void main(String[] args) {
        Laptop computador = new Laptop("Super computador", "lenovo",20000,10,"intel core 5 ultima generacion super poderoso",16);
        Celular celular = new Celular("super celular ", "motorola", 9000, 5, "super bateria", "super camara");

        Cliente comprador = new Cliente("Maia", "kc6539769 @gmail.com");
        Cliente compradordos = new Cliente("Sasha"," sasha123 @gmail.com");
        comprador.comprarProducto(computador, 9);
        compradordos.comprarProducto(celular, 4);

        System.out.println("   Actualizacion del Stock realizada."); // se actualizotodo
        computador.mostrarDetalles(); // se vuele a motrar la info de los productos
        celular.mostrarDetalles();

        comprador.mostrarCompra(); // se muestra la compra de los dos clientes
        compradordos.mostrarCompra();



    }
}