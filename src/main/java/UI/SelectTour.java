package UI;

import javax.swing.*;
import java.awt.*;

public class SelectTour extends JFrame {

    private int alto=200;
    private int ancho=400;
    private String titulo ="Tour's";
    private JButton agregar;
    private JButton actualizar;
    private JComboBox tour;

    public SelectTour(){

    }
    private void Orden(){
        setLayout(new BorderLayout());
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}
