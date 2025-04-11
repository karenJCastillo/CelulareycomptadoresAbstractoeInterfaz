public class Celular extends Producto implements Vendible{
    private String capacidadBateria;
    private String capacidadCamara;

    public Celular(String nombre, String marca, double precio, int cantidadStock, String capacidadBateria, String capacidadCamara) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.capacidadCamara = capacidadCamara;
    }

    public String getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(String capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getCapacidadCamara() {
        return capacidadCamara;
    }

    public void setCapacidadCamara(String capacidadCamara) {
        this.capacidadCamara = capacidadCamara;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "capacidadBateria='" + capacidadBateria + '\'' +
                ", capacidadCamara='" + capacidadCamara + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Celular");
        System.out.println("Nombre"+"  "+nombre);
        System.out.printf("Marca"+"  "+marca);
        System.out.println("precio"+"  " +":$"+ precio);
        System.out.printf("Cantidad en Stock "+"  "+ cantidadStock);
        System.out.println("Capacidad de la bateria: "+"  "+capacidadBateria);
        System.out.println("Capacidad de la Camara"+"  "+capacidadCamara);

    }
    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = cantidad * precio;
        if( cantidad > 5){
            total*= 0.2;
        }
        return total;
    }
}
