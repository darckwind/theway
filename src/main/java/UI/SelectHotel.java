package UI;

import javax.swing.*;
import java.awt.*;

public class SelectHotel extends JDialog {

    private int alto = 200, ancho=400;
    private String titulo;
    private JButton actualizar,eliminar,crear;
    private JComboBox hoteles;
    private JPanel panelCentral, panelLateral, panelCenSup, panelCenInf;

    public SelectHotel() {
        Orden();
    }

    public void Orden(){
        ConstruirCentral();
        ConstruirLateral();
        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.WEST);
        add(panelLateral, BorderLayout.CENTER);

        setModal(true);
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setVisible(true);

    }

    public void ConstruirCentral(){
        ConstruirPanelCentSuperior();
        ConstruirPanelCentInferior();
        panelCentral =  new JPanel();

        GridLayout grid = new GridLayout(2,1);
        panelCentral.setLayout(grid);
        panelCentral.add(panelCenSup);
        panelCentral.add(panelCenInf);

    }

    public void ConstruirPanelCentInferior(){
        actualizar = new JButton("Actualizar");
        eliminar =  new JButton("Eliminar");

        panelCenInf = new JPanel();
        GridLayout grid = new GridLayout(1,2);
        panelCenInf.setLayout(grid);

        panelCenInf.add(actualizar);
        panelCenInf.add(eliminar);
    }

    public void ConstruirPanelCentSuperior(){
        hoteles = new JComboBox();
        panelCenSup = new JPanel();
        panelCenSup.setLayout(new BorderLayout());
        panelCenSup.add(hoteles);
    }

    public void ConstruirLateral(){

        crear =  new JButton("Crear");
        panelLateral = new JPanel();
        panelLateral.setLayout(new BorderLayout());
        panelLateral.add(crear);

    }
}
