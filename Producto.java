/**
 * la clase Producto guarda un articulo del inventario de la papeleria
 * y el objeto guarda su nombre, precio unitario y unidades.
 */
public class Producto {

    // atributos del objeto Producto
    private String nombre;
    private double precio;
    private int existencia;

    
    // inicializa los atributos del objeto.
    public Producto(String nombre, double precio, int existencia) {
        this.nombre = nombre;         
        this.precio = precio;
        this.existencia = existencia;
    }

    // getters
    public String getnombre()  { return this.nombre; }
    public double getprecio()  { return this.precio; }
    public int getexistencia() { return this.existencia; }

    // calcula el valor total del producto
    public double calculartotal() {
        return this.precio * this.existencia;
    }

    // Muestra los datos del producto.
    public void mostrarinformacion() {
        System.out.printf("%-22s %8.2f %10d %15.2f%n", this.nombre, this.precio, this.existencia, this.calculartotal());
    }
}