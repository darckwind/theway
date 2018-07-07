package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCliente extends JDialog implements ActionListener {

    private int ancho=300, alto = 100;
    private String titulo ="Clientes";
    private JButton agregar;
    private JButton actualizar;
    private JComboBox cliente;

    public SelectCliente() {
        Orden();
    }

    public void Orden(){
        /**
         * inicializacion botones con eventos
         */

        cliente = new JComboBox();
        actualizar = new JButton("Actualizar");
        actualizar.addActionListener(this);
        agregar = new JButton("agregar");
        agregar.addActionListener(this);

        /**
         * configuracion layout
         */

        GridLayout grid =new GridLayout(2,4,5,10);
        setLayout(grid);
        add(cliente);
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
            ActualizarCliente actualizarCliente = new ActualizarCliente();
        }else{
            setVisible(false);
            ActualizarCliente actualizarCliente = new ActualizarCliente();

        }
    }
}
