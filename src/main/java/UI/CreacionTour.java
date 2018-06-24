package UI;

import Logica.Tour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreacionTour extends JDialog implements ActionListener{
    private int alto = 200;
    private int ancho= 400;
    private String titulo = "Configuracion Tour";
    private JLabel id,guia;
    private JTextField id2,guia2;
    private JLabel duracion, fechaInicio;
    private JTextField duracion2;
    private JButton crear;
    private JButton limpiar;
    private Tour tour;
    private JPanel calendar;
    private JComboBox dia, mes,anio;




    public CreacionTour(){
        Oredn();
    }

    private void Oredn(){

        /**
         * inicializacion componentes
         */
        Calendario();
        id = new JLabel("Id Tour");
        id2 = new JTextField();
        duracion = new JLabel("Duracion");
        duracion2 = new JTextField();
        guia= new JLabel("Guia");
        guia2 = new JTextField();
        fechaInicio = new JLabel("Fecha Inicio");
        crear = new JButton("Crear");
        crear.addActionListener(this);
        limpiar = new JButton("Limpiar");
        limpiar.addActionListener(this);

        /**
         * configuracion layout
         */

        GridLayout grid = new GridLayout(5,2);
        setLayout(grid);
        add(id);
        add(id2);
        add(duracion);
        add(duracion2);
        add(guia);
        add(guia2);
        add(fechaInicio);
        add(calendar);
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
    public void Calendario(){
        calendar =  new JPanel();
        dia = new JComboBox();
        mes = new JComboBox();
        anio = new JComboBox();

        GridLayout grida = new GridLayout(1,3);
        calendar.setLayout(grida);

        calendar.add(dia);
        calendar.add(mes);
        calendar.add(anio);

    }

    public void actionPerformed(ActionEvent e) {
        /**
         * eventos
         */
        if(e.getActionCommand()== "Crear"){
            tour =  new Tour(id2,duracion2,guia2);
            setVisible(false);
            ActualizarTour aTour =new ActualizarTour();
        }else{
            id2.setText(null);
            duracion2.setText(null);

        }

    }

}
