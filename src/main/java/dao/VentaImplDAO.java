package dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import modelo.Venta;

public class VentaImplDAO extends Conexion implements VentaDAO {

    @Override
    public void registrar(Venta v) {
        conectarDB();
        String portal = "Portal Temuco";
        try {
            PreparedStatement st = con.prepareStatement("insert into venta (sucursal, monto, fecha,id_vendedor) values ('" +portal+ "','" + v.getMonto() + "','" + v.getFecha() +"','"+v.getId_Vendedor()+"');");
            st.executeUpdate();
            System.out.println("Venta Guardada");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public ArrayList<Venta> lista() {
        return null;
    }

}
