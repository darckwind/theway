package UI;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

    private int alto=640;
    private int ancho=800;
    private String titulo = " The Way";
    private PanelCentral pCentral;
    private PanelLateral pLateral;


    public UI() {
        orden();
        ventana();
    }

    public void orden() {
        pCentral = new PanelCentral();
        pLateral = new PanelLateral();
        setLayout(new BorderLayout());
        add(pLateral, BorderLayout.WEST);
        add(pCentral, BorderLayout.CENTER);

    }
    public void ventana(){
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
