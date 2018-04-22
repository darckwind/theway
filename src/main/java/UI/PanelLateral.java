package UI;

import javax.swing.*;
import java.awt.*;

public class PanelLateral extends JPanel {

    private JButton tour;
    private JButton datosClientes;
    private JButton datosMotos;
    private JButton hoteles;

    public PanelLateral() {
        orden();
    }
    public void orden(){

        tour = new JButton("Tours");
        datosClientes = new JButton("Datos Clientes");
        datosMotos = new JButton("Datos Motos");
        hoteles = new JButton("Hoteles");
        GridLayout grid = new GridLayout(4,1);
        setLayout(grid);
        add(tour);
        add(datosClientes);
        add(datosMotos);
        add(hoteles);
    }
}
