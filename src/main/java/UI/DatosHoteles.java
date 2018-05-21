package UI;

import javax.swing.*;
import java.awt.*;

public class DatosHoteles extends JDialog {
    private int alto = 340, ancho= 800;
    private String titulo = "Datos Hotel";
    private JButton guardar ,limpiar;
    private JTextField nombre, ubicacion, single, doble, suit, contacto;
    private JLabel lNombre, lUbicacion, lSingle, lDoble, lSuit, lContacto;
    private JPanel panelCentral, panelInferior;

    public DatosHoteles() {
        Ordenar();
    }
    public void Ordenar(){
        ConstruirCentral();
        ConstruiInferior();

        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        setModal(true);
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setVisible(true);
    }
    public void ConstruirCentral(){

        lNombre= new JLabel("Nombre");
        nombre= new JTextField();
        lUbicacion = new JLabel("Ubicacion Hotel");
        ubicacion =  new JTextField();
        lSingle =  new JLabel("Costo Habitacion Single");
        single = new JTextField();
        lDoble =  new JLabel("Costo Habitacion Doble");
        doble = new JTextField();
        lSuit = new JLabel("Costo Habitacion Suit");
        suit = new JTextField();
        lContacto =  new JLabel("Contacto");
        contacto = new JTextField();

        GridLayout grid = new GridLayout(3,4);
        panelCentral =  new JPanel();
        panelCentral.setLayout(grid);
        panelCentral.add(lNombre);
        panelCentral.add(nombre);
        panelCentral.add(lUbicacion);
        panelCentral.add(ubicacion);
        panelCentral.add(lSingle);
        panelCentral.add(single);
        panelCentral.add(lDoble);
        panelCentral.add(doble);
        panelCentral.add(lSuit);
        panelCentral.add(suit);
        panelCentral.add(lContacto);
        panelCentral.add(contacto);

    }
    public void ConstruiInferior(){

        guardar =  new JButton("Guardar");
        limpiar =  new JButton("Limpiar");

        GridLayout grid = new GridLayout(1,2);
        panelInferior = new JPanel();
        panelInferior.setLayout(grid);
        panelInferior.add(guardar);
        panelInferior.add(limpiar);


    }
}

