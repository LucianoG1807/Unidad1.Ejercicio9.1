public class ArticuloLibreria {

    private String descripcion;
    private double precioUnitario;
    private int stock;

    public ArticuloLibreria(String descripcion, double precioUnitario, int stock) {
        this.descripcion = descripcion;

        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }

        if (stock >= 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
    }

    public void aplicarAumento(double porcentaje) {
        if (porcentaje >= 0) {
            precioUnitario += precioUnitario * porcentaje / 100;
        } else {
            System.out.println("El porcentaje no puede ser negativo.");
        }
    }

    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("Cantidad de venta no válida.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Stock disponible: " + stock);
    }
}