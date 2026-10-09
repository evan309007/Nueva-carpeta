/**
 * Programa principal del sistema de inventario de la papeleria.
 * Usa un arreglo de objetos Producto y las estructuras for e if.
 */

public class Inventario {

    public static void main(String[] args) {

        // Arreglo de 6 Producto
        Producto[] productos = new Producto[6];
        productos[0] = new Producto("cuaderno profesional", 45.50, 30);
        productos[1] = new Producto("lapiz (pieza)",      6.00, 120);
        productos[2] = new Producto("pluma azul",            9.75, 0);// sin existencia para comprobacion
        productos[3] = new Producto("caja de colores",      68.90, 15);
        productos[4] = new Producto("resistol blanco",      22.00, 8);
        productos[5] = new Producto("folder manila",   3.50, 200);

        double totalInventario = 0;   // acumulador del valor del inventario

        System.out.println("======= INVENTARIO DE PAPELERIA  ========");
        System.out.printf("%-22s %9s %10s %11s%n", "Producto", "Precio", "   Existencia", "Total");
        System.out.println("-----------------------------------------------------------");

        // ciclo for para recorre el arreglo 
        for (int i = 0; i < productos.length; i++) {
            //ciclo if para que se procesen solamente los productos con existencia
            if (productos[i].getexistencia() >= 1) {
                productos[i].mostrarinformacion();
                totalInventario += productos[i].calculartotal();
            }
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-22s %32s%n", "VALOR TOTAL INVENTARIO", String.format("$%.2f", totalInventario));

        // ciclo for para avisar de los productos agotados
        System.out.println();
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getexistencia() == 0) {
                System.out.println("Aviso: \"" + productos[i].getnombre() + "\" esta agotado. favor de avisar al proveedor.");
            }
        }
    }
}
