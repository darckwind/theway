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
    private ImageIcon imgTour, imgCliente, imgMoto, imgHotel;
    private JToolBar toolBar;

    public PanelLateral() {
        orden();
    }
    public void orden(){
        /**inicializacion de las imagenes
         *
         */
        imgTour = new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"tour.png");
        imgCliente= new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"users.png");
        imgMoto = new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"moto.png");
        imgHotel = new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"hotel.png");
        /**configuracion del tamaño de los iconos
         *
         */
        Icon icoTour = new ImageIcon(this.imgTour.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));
        Icon icoCliente = new ImageIcon(this.imgCliente.getImage().getScaledInstance( 25, 20, Image.SCALE_DEFAULT));
        Icon icoHotel = new ImageIcon(this.imgHotel.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));
        Icon icoMoto = new ImageIcon(this.imgMoto.getImage().getScaledInstance( 25, 20, Image.SCALE_DEFAULT));
        /**inicializacion componentes
         *
         */

        toolBar =  new JToolBar();
        toolBar.setRollover(true);
        toolBar.setFloatable(false);


        tour = new JButton("Tours");
        tour.setIcon(icoTour);
        tour.addActionListener(this);
        datosClientes = new JButton("Datos Clientes");
        datosClientes.setIcon(icoCliente);
        datosClientes.addActionListener(this);
        datosMotos = new JButton("Datos Motos");
        datosMotos.setIcon(icoMoto);
        datosMotos.addActionListener(this);
        hoteles = new JButton("Hoteles");
        hoteles.setIcon(icoHotel);
        hoteles.addActionListener(this);
        toolBar.add(tour);
        toolBar.add(datosClientes);
        toolBar.add(datosMotos);
        toolBar.add(hoteles);
        toolBar.addSeparator(new Dimension(400, 50));

        add(toolBar, BorderLayout.EAST);
    }
    public void actionPerformed(ActionEvent e) {

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
