package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreacionTour extends JDialog implements ActionListener{
    private int alto = 200;
    private int ancho= 400;
    private String titulo = "Configuracion Tour";
    private JLabel id;
    private JTextField id2;
    private JLabel duracion;
    private JTextField duracion2;
    private JButton crear;
    private JButton limpiar;

    public CreacionTour(){
        Oredn();
    }

    private void Oredn(){

        /**
         * inicializacion componentes
         */

        id = new JLabel("Id Tour");
        id2 = new JTextField();
        duracion = new JLabel("Duracion");
        duracion2 = new JTextField();
        crear = new JButton("Crear");
        crear.addActionListener(this);
        limpiar = new JButton("Limpiar");

        /**
         * configuracion layout
         */

        GridLayout grid = new GridLayout(3,2);
        setLayout(grid);
        add(id);
        add(id2);
        add(duracion);
        add(duracion2);
        add(crear);
        add(limpiar);

        /**coniguracion JDialog
         *
         */
        setModal(true);
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
        if(e.getActionCommand()== "Crear"){
            setVisible(false);
            ActualizarTour aTour =new ActualizarTour();
        }else{
            System.out.println("");

        }

    }

}
