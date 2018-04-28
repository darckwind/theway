package UI;

import javax.swing.*;

public class CreacionTour extends JDialog {
    private int alto = 200;
    private int ancho= 400;
    private String titulo = "Configuracion Tour";

    public CreacionTour(){
        Oredn();
    }

    private void Oredn(){

        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setModal(true);
        setVisible(true);

    }

}
