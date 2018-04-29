package UI;

import javax.swing.*;
import java.awt.*;

public class ISecion extends JDialog {

    private int alto = 200;
    private int ancho= 400;
    private String titulo = "Inicio de Secion";
    private JLabel user;
    private JLabel pass;
    private JTextField usuario;
    private JTextField password;
    private JButton inicio;
    private JButton cancelar;

    public ISecion(){
        Orden();
    }
    private void Orden(){

        /**
         *Iniciacion componentes
         */

        user = new JLabel("Usuario");
        pass = new JLabel("Clave");
        usuario = new JTextField();
        password = new JTextField();
        inicio = new JButton("Inicio");
        cancelar = new JButton("Cancel");

        /**
         * configuracion layout
         */

        GridLayout grid =new GridLayout(3,2);
        setLayout(grid);
        add(user);
        add(usuario);
        add(pass);
        add(password);
        add(inicio);
        add(cancelar);

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
}
