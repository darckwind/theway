package UI;

import javax.swing.*;
import java.awt.*;

public class ATourLateral extends JPanel {

    private JComboBox dia;
    private JLabel dia2;
    private JButton guardar;
    private JButton limpiar;
    private JPanel panelSuperior,panelInferior;

    public ATourLateral(){
        ConstruyeSuperior();
        ConstruyeInferior();
        Ordenar();
    }

    public void ConstruyeSuperior(){
        dia = new JComboBox();
        dia2 = new JLabel("Dia");
        panelSuperior =new JPanel();
        GridLayout grid = new GridLayout(2,1);
        panelSuperior.setLayout(grid);
        panelSuperior.add(dia2);
        panelSuperior.add(dia);

    }
    public void  ConstruyeInferior(){
        guardar = new JButton("Guardar");
        limpiar = new JButton("Limpiar");
        panelInferior = new JPanel();
        GridLayout grid = new GridLayout(2,1);
        panelInferior.add(guardar);
        panelInferior.add(limpiar);

    }

    public void Ordenar(){

        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.NORTH);
        add(panelInferior, BorderLayout.SOUTH);

    }


}
