public class Laptop extends Producto implements Vendible {
private String procesador;
private int memoriaRAM;

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, int memoriaRAM) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop");
        System.out.println("Nombre"+"  "+nombre);
        System.out.printf("Marca"+"  "+marca);
        System.out.println("precio"+"  "+ ":$"+ precio);
        System.out.printf("Cantidad en Stock "+"  "+ cantidadStock);
        System.out.println("Procesador"+"  "+procesador);
        System.out.println("Memoria RAM"+"  "+memoriaRAM);

    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = cantidad * precio; //TOTAL DEL PRECIO
        if( cantidad > 5){
            total*= 0.2;
        }
        return total;
    }
}
