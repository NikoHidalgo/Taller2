package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Vendedor;

public class VendedorImplDAO extends Conexion implements VendedorDAO {

    @Override
    public ArrayList<Vendedor> lista() {
        conectarDB();
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        conectarDB();
        try {
            PreparedStatement st = con.prepareStatement("select * from vendedor");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String rut = rs.getString("rut");
                int id = rs.getInt("id_vendedor");
                Vendedor v = new Vendedor(nombre, apellido, rut, id);
                vendedores.add(v);
            }

            return vendedores;
        } catch (Exception e) {
            System.out.println("Lista no encontrada o vacia");
        } finally {
            cerrarConexion();
        }
        return vendedores;
    }

}
