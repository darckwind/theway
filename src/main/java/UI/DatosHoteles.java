package UI;

import Logica.hoteles;
import Validacion.ValidacionEmail;
import Validacion.ValidacionNull;
import Validacion.ValidacionNumero;
import Validacion.ValidacionTexto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatosHoteles extends JDialog implements ActionListener {
    private int alto = 250, ancho= 500;
    private String titulo = "Datos Hotel";
    private JButton guardar ,limpiar;
    private JTextField nombre, ubicacion, contacto,email;
    private JCheckBox single, doble, suit;
    private JLabel lNombre, lUbicacion, lSingle, lDoble, lSuit, lContacto,lEmail, habitacion;
    private JPanel panelCentral, panelInferior;
    private hoteles hotel;

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
        setResizable(true);
        setVisible(true);
    }
    public void ConstruirCentral(){

        lNombre= new JLabel("Nombre");
        nombre= new JTextField();
        nombre.setInputVerifier(new ValidacionTexto());
        lUbicacion = new JLabel("Ubicacion Hotel");
        ubicacion =  new JTextField();
        ubicacion.setInputVerifier(new ValidacionNull());
        habitacion =  new JLabel("Habitaciones Disponibles");
        lContacto =  new JLabel("Telefono");
        contacto = new JTextField();
        contacto.setInputVerifier(new ValidacionNumero());
        lEmail = new JLabel("Email");
        email = new JTextField();
        email.setInputVerifier(new ValidacionEmail());

        /**
         * checkbox
         */
        single = new JCheckBox("Single");
        doble = new JCheckBox("Doble");
        suit = new JCheckBox("Suit");


        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        panelCentral =  new JPanel();
        panelCentral.setLayout(grid);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.5;
        c.weighty =0.3;
        c.gridx = 0;
        c.gridy = 0;
        panelCentral.add(lNombre,c);
        c.gridx = 1;
        c.gridy = 0;
        panelCentral.add(nombre,c);
        c.gridx = 0;
        c.gridy = 1;
        panelCentral.add(lUbicacion,c);
        c.gridx = 1;
        c.gridy = 1;
        panelCentral.add(ubicacion,c);
        c.gridx=0;
        c.gridy=2;
        panelCentral.add(habitacion,c);
        c.gridx = 0;
        c.gridy = 3;
        panelCentral.add(single,c);
        c.gridx = 1;
        c.gridy = 3;
        panelCentral.add(doble,c);
        c.gridx = 2;
        c.gridy = 3;
        panelCentral.add(suit,c);
        c.gridx = 0;
        c.gridy = 4;
        panelCentral.add(lContacto,c);
        c.gridx = 1;
        c.gridy = 4;
        panelCentral.add(contacto,c);
        c.gridx=0;
        c.gridy=5;
        panelCentral.add(lEmail,c);
        c.gridx=1;
        c.gridy=5;
        panelCentral.add(email,c);


    }
    public void ConstruiInferior(){

        guardar =  new JButton("Guardar");
        guardar.addActionListener(this);
        limpiar =  new JButton("Limpiar");
        limpiar.addActionListener(this);

        //GridLayout grid = new GridLayout(1,2,5,10);
        panelInferior = new JPanel();
        panelInferior.setLayout(new FlowLayout());
        panelInferior.add(guardar);
        panelInferior.add(limpiar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="Limpiar"){
            nombre.setText(null);
            ubicacion.setText(null);
            single.setText(null);
            doble.setText(null);
            suit.setText(null);
            contacto.setText(null);
            email.setText(null);
        }else if (e.getActionCommand()=="Guardar"){

            try{
               if (nombre.getText().isEmpty()||contacto.getText().isEmpty()||ubicacion.getText().isEmpty()||email.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Rellene los campos pertinentes antes de enviar");
               }else {
                   hotel = new hoteles(nombre,contacto,ubicacion,single,doble,suit,email);
                   dispose();
               }


            }catch (NullPointerException es){
                es.getMessage();
            }

        }
    }
}

