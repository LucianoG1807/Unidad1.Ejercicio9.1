public class main {

    public static void main(String[] args) {

        ArticuloLibreria articulo = new ArticuloLibreria(
                "Cuaderno A4",
                5000,
                20
        );

        articulo.aplicarAumento(15);
        articulo.vender(3);

        articulo.mostrarInformacion();
    }
}