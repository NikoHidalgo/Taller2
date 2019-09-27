package controlador;

import dao.VendedorImplDAO;
import dao.VentaImplDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Vendedor;
import modelo.Venta;
import vista.VentRegistroVenta;

public class RegistrarController implements ActionListener {

    private VentRegistroVenta registrar;

    public RegistrarController(VentRegistroVenta registrar) {
        this.registrar = registrar;
    }

    public void añadirBox() {
        VendedorImplDAO v = new VendedorImplDAO();
        ArrayList<Vendedor> vendedores = v.lista();
        for (int i = 0; i < vendedores.size(); i++) {
            registrar.vendedoresBox.addItem(vendedores.get(i));
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        VentaImplDAO vDao = new VentaImplDAO();
        try {
            Vendedor v = (Vendedor) registrar.vendedoresBox.getSelectedItem();
            String sucursal = registrar.sucursalBox.getSelectedItem().toString();

            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            Date fecha;
            int montos = Integer.parseInt(registrar.monto.getText());

            fecha = formato.parse(registrar.fecha.getText());
            Venta venta = new Venta(v, fecha, v.getId_vendedor(), montos);
            vDao.registrar(venta);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
