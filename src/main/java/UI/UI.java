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
        /**
         * inicializacion componentes
         */
        pCentral = new PanelCentral();
        pLateral = new PanelLateral();
        setLayout(new BorderLayout());
        add(pLateral, BorderLayout.NORTH);
        add(pCentral, BorderLayout.CENTER);

    }
    public void ventana(){
        /**
         * icono
         */
        ImageIcon ImageIcon = new ImageIcon("imagenes/imagen.png");
        Image image = ImageIcon.getImage();
        this.setIconImage(image);
        /**
         * configuracion ventana
         */
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
