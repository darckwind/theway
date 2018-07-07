package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTour extends JDialog  implements ActionListener{

    private int alto=100;
    private int ancho=300;
    private String titulo ="Tour's";
    private JButton agregar;
    private JButton actualizar;
    private JComboBox tour;
    private JPanel panel;

    public SelectTour(){

        Orden();
    }
    private void Orden(){
        /**
         * inicializacion botones con eventos
         */

        panel = new JPanel(new GridBagLayout());
        tour = new JComboBox();
        actualizar = new JButton("Actualizar");
        actualizar.addActionListener(this);
        agregar = new JButton("agregar");
        agregar.addActionListener(this);

        /**
         * configuracion layout
         */

        GridLayout grid =new GridLayout(2,4,5,10);
        setLayout(grid);
        add(tour);
        tour.setPreferredSize(new Dimension(0,20));
        add(new JLabel());
        add(actualizar);
        add(agregar);

        /**
         * configuracion JDialog
         */

        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setModal(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        /**
         * eventos
         */
        if(e.getActionCommand()== "Actualizar"){
            setVisible(false);
            ActualizarTour aTour =new ActualizarTour();
        }else{
            setVisible(false);
            CreacionTour creacion = new CreacionTour();

        }

    }

}
