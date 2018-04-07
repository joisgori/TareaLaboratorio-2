/** ****************************************************************************
 * Clase Registro
 *
 * Objetos: ProveedorN, EmpresaN, AdministradorN
 *
 * Atributos: nombreProveedor, nombreEmpresa, nombreAdministrador,
 * telefonoProveedor, telefonoEmpresa, telefonoAdministrador.
 *
 * Métodos: Agregar, mostrar, modificar, eliminar (con opciones en cada uno, 
 * para escoger si es referente al proveedor, la empresa o el administrador...
 *
 * Guía 2
 ***************************************************************************** */
package NuevoPaquete;

/**
 *
 * @author Josué González 00034715
 */
public class Registro {

    private String nombreProveedor, nombreEmpresa, nombreAdministrador;
    private int telefonoProveedor, telefonoEmpresa, telefonoAdministrador;

    //Constructor vacío
    public Registro() {
    }

    //Métodos GETTER
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public int getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public int getTelefonoAdministrador() {
        return telefonoAdministrador;
    }

    //Métodos SETTER
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public void setTelefonoAdministrador(int telefonoAdministrador) {
        this.telefonoAdministrador = telefonoAdministrador;
    }
    
    //Métodos del registro
    public void agregar(){
        //Proporcionará opciones (proovedor, empresa, administrador) para que el usuario escoja y el método lo agregue al registro.
    }
    
    public void mostrar(){
        //Proporcionará opciones (proovedor, empresa, administrador) para que el usuario escoja y el método muestre el registro.
    }
    
    public void modificar(){
        //Proporcionará opciones (proovedor, empresa, administrador) para que el usuario escoja y el método permita modificar el registro.
    }
    
    public void eliminar(){
        //Proporcionará opciones (proovedor, empresa, administrador) para que el usuario escoja y el método lo elimine del registro.
    }
    
}
