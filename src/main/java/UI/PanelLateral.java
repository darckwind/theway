package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelLateral extends JPanel implements ActionListener {

    private JButton tour;
    private JButton datosClientes;
    private JButton datosMotos;
    private JButton hoteles;

    public PanelLateral() {
        orden();
    }
    public void orden(){

        tour = new JButton("Tours");
        tour.addActionListener(this);
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
    public void actionPerformed(ActionEvent e) {
        SelectTour selectTour =new SelectTour();
    }
}
