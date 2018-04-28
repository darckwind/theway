package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTour extends JDialog  implements ActionListener{

    private int alto=200;
    private int ancho=400;
    private String titulo ="Tour's";
    private JButton agregar;
    private JButton actualizar;
    private JComboBox tour;

    public SelectTour(){
        Orden();
    }
    private void Orden(){

        tour = new JComboBox();
        actualizar = new JButton("Actualizar");
        actualizar.addActionListener(this);
        agregar = new JButton("agregar");

        GridLayout grid =new GridLayout(2,4);
        setLayout(grid);
        add(tour);
        add(new JLabel());
        add(actualizar);
        add(agregar);


        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setModal(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        ActualizarTour aTour =new ActualizarTour();
    }

}
