
package modelo;

public class Vendedor {
    private String nombre;
    private String apellido;
    private String rut;
    private int id_vendedor;

    public Vendedor(String nombre, String apellido, String rut, int id_vendedor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.id_vendedor = id_vendedor;
    }

    public Vendedor(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    @Override
    public String toString() {
        return  nombre +" "+ apellido;
    }
    
    
}
