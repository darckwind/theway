package UI;

import javax.swing.*;
import java.awt.*;

public class ActualizarTour extends JDialog {

    private int alto=640;
    private int ancho=800;
    private String titulo = "Configuracion Tours";
    private ATourCentral tourCentral;
    private ATourLateral tourLateral;



    public ActualizarTour(){
        Orden();

    }
    private void Orden(){
        tourCentral = new ATourCentral();
        tourLateral = new ATourLateral();
        setLayout(new BorderLayout());
        add(tourCentral, BorderLayout.CENTER);
        add(tourLateral, BorderLayout.WEST);

        setModal(true);
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setVisible(true);


    }
}
