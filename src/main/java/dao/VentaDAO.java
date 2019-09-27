
package dao;

import java.util.ArrayList;
import modelo.Venta;

public interface VentaDAO {
    public void registrar(Venta v);
    public ArrayList<Venta> lista();
}
