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
        datosClientes.addActionListener(this);
        datosMotos = new JButton("Datos Motos");
        datosMotos.addActionListener(this);
        hoteles = new JButton("Hoteles");
        hoteles.addActionListener(this);
        GridLayout grid = new GridLayout(4,1);
        setLayout(grid);
        add(tour);
        add(datosClientes);
        add(datosMotos);
        add(hoteles);
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if(e.getActionCommand()=="Tours"){
            SelectTour selectTour =new SelectTour();
        }else if(e.getActionCommand()=="Datos Clientes"){
            SelectCliente selectCliente = new SelectCliente();
        }else if(e.getActionCommand()=="Datos Motos"){
            SelectMotos selectMotos = new SelectMotos();
        }else if (e.getActionCommand()=="Hoteles"){
            SelectHotel selectHotel = new SelectHotel();
        }



    }
}
