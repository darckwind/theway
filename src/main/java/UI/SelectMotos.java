package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectMotos extends JDialog implements ActionListener {

    private JComboBox marca,modelo,patente;
    private JButton crear,eliminar,actualizar;
    private JPanel panelLateral,panelLateralSup,panelLateralinf,panelcentral;
    private int ancho=400,alto=200;
    private String titulo="Motos";


    public SelectMotos() {
        Orden();
    }

    public void Orden(){
        ConstruirCentral();
        ConstruirLateral();

        setLayout(new BorderLayout());
        add(panelcentral, BorderLayout.CENTER);
        add(panelLateral, BorderLayout.WEST);

        setModal(true);
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setVisible(true);

    }
    public void ConstruirLateral(){
        ConstruirPanelLatSuperior();
        ConstruirPanelLatInferior();
        panelLateral =  new JPanel();
        GridLayout grid = new GridLayout(2,1);
        panelLateral.setLayout(grid);
        panelLateral.add(panelLateralSup);
        panelLateral.add(panelLateralinf);
    }
    public void ConstruirPanelLatSuperior(){
        marca = new JComboBox();
        modelo= new JComboBox();
        patente = new JComboBox();
        panelLateralSup = new JPanel();
        GridLayout grid = new GridLayout(3,1);
        panelLateralSup.setLayout(grid);
        panelLateralSup.add(marca);
        panelLateralSup.add(modelo);
        panelLateralSup.add(patente);
    }
    public void ConstruirPanelLatInferior(){
        eliminar= new JButton("Eliminar");
        eliminar.addActionListener(this);
        actualizar= new JButton("Actualizar");
        actualizar.addActionListener(this);
        panelLateralinf = new JPanel();
        GridLayout grid = new GridLayout(1,2);
        panelLateralinf.add(eliminar);
        panelLateralinf.add(actualizar);
    }
    public void ConstruirCentral(){
        crear =  new JButton("Crear");
        crear.addActionListener(this);
        panelcentral=new JPanel();
        panelcentral.setLayout(new BorderLayout());
        panelcentral.add(crear, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        /**
         * eventos
         */
        if(e.getActionCommand()== "Actualizar"){
            setVisible(false);
            DatosMotos datosMotos = new DatosMotos();
        }else if(e.getActionCommand()=="Eliminar"){

        }else if (e.getActionCommand() == "Crear"){
            setVisible(false);
            DatosMotos datosMotos = new DatosMotos();
        }
    }

}
