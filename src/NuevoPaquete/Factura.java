/** ****************************************************************************
 * Clase Factura
 *
 * Objetos: Factura1, Factura2, Factura3... FacturaN
 * 
 * Atributos: costoProducto, totalProducto, nombreProducto, numeroFactura, 
 * fechaFactura, cantidadProducto;
 *
 * Guía 2
 ***************************************************************************** */
package NuevoPaquete;

/**
 *
 * @author Josué González 00034715
 */
public class Factura {

    private double costoProducto, totalProducto;
    private String nombreProducto;
    private int numeroFactura, fechaFactura, cantidadProducto;

    //Constructor vacío
    public Factura() {
    }

    //Constructor con argumentos
    public Factura(double costoProducto, double totalProducto, String nombreProducto, int numeroFactura, int fechaFactura, int cantidadProducto) {
        this.costoProducto = costoProducto;
        this.totalProducto = totalProducto;
        this.nombreProducto = nombreProducto;
        this.numeroFactura = numeroFactura;
        this.fechaFactura = fechaFactura;
        this.cantidadProducto = cantidadProducto;
    }

    //Métodos GETTER
    public double getCostoProducto() {
        return costoProducto;
    }

    public double getTotalProducto() {
        return totalProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getFechaFactura() {
        return fechaFactura;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    //Métodos SETTER
    public void setCostoProducto(double costoProducto) {
        this.costoProducto = costoProducto;
    }

    public void setTotalProducto(double totalProducto) {
        this.totalProducto = totalProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setFechaFactura(int fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

}
