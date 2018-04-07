/** ****************************************************************************
 * Clase Inventario
 *
 * Objetos: producto1, producto2, producto3... productoN
 *
 * Atributos: nombreProducto, cantidadProducto, precioProducto, códigoProducto,
 * y colorProducto.
 *
 * Métodos: Agregar, modificar, eliminar, cargar, descargar, descartar y mostrar
 * productos.
 *
 * Guía 2
 ***************************************************************************** */
package NuevoPaquete;

/**
 *
 * @author Josué González 00034715
 */
public class SistemaInventario {

    private String nombreProducto, colorProducto;
    private int cantidadProducto, codigoProducto;
    private double precioProducto;

    //Constructor vacío
    public SistemaInventario() {
    }
    //Métodos GETTER

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getColorProducto() {
        return colorProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }
    //Métodos SETTER

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setColorProducto(String colorProducto) {
        this.colorProducto = colorProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    //Métodos
    public void agregarProducto() {
        //Este método agregará producto en el inventario
    }

    public void modificarProducto() {
        //Este método podrá modificar productos del inventario
    }

    public void eliminarProducto() {
        //Este método eliminará productos del inventario
    }

    public void cargarProducto() {
        //Este método aumentará la cantidad de un producto del inventario
    }

    public void descargarProducto() {
        //Este método reducirá cantidad de productos del inventario
    }

    public void descartarProducto() {
        //Este método inhabilitará productos del inventario
    }

    public void mostrar() {
        //El método mostrará el inventario.
    }

    public static void main(String[] args) {
        System.out.println("Holi");
    }

}
