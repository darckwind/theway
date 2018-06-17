package UI;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.*;

public class PanelCentral extends JPanel {

    private JLabel tours;
    private JTable displayTours;
    private JPanel panelCentral,panelLateral;


    public PanelCentral() {
        Ordenar();
    }

    public void Ordenar(){
        ConstruirSup();
        ConstruirCentral();
        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);
        add(panelLateral, BorderLayout.NORTH);


    }
    public void ConstruirSup(){
        panelLateral = new JPanel();
        panelLateral.setLayout(new BorderLayout());
        tours = new JLabel("Lista Tours");
        panelLateral.add(tours);

    }
    public void ConstruirCentral(){
        panelCentral =  new JPanel();


        String[] columnNames = {"Codigo","Nombre","Cant. Clientes"};
        Object[][] data = {
                {"10010", "Patagonia","7"},
                {"13592", "San pedro","15"},
                {"10123", "Salar","10"},

        };
        panelCentral.setLayout(new BorderLayout());
        displayTours =  new JTable(data,columnNames);
        panelCentral.add(displayTours);

    }
}

