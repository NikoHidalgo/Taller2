
package modelo;

import java.util.Date;


public class Venta {
    private Vendedor v;
    private Date fecha;
    private int id_Vendedor;
    private int monto;
    private int id_venta;

    public Venta(Vendedor v,Date fecha, int id_Vendedor, int monto, int id_venta) {
        this.v = v;
        this.fecha = fecha;
        this.id_Vendedor = id_Vendedor;
        this.monto = monto;
        this.id_venta = id_venta;
    }

    public Venta(Vendedor v, Date fecha, int id_Vendedor, int monto) {
        this.v = v;
        this.fecha = fecha;
        this.id_Vendedor = id_Vendedor;
        this.monto = monto;
    }

    public Vendedor getV() {
        return v;
    }

    public void setV(Vendedor v) {
        this.v = v;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_Vendedor() {
        return id_Vendedor;
    }

    public void setId_Vendedor(int id_Vendedor) {
        this.id_Vendedor = id_Vendedor;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
}
