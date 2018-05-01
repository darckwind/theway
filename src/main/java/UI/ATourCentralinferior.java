package UI;

import javax.swing.*;
import java.awt.*;

public class ATourCentralinferior extends JPanel{

    private JLabel lore;
    private JTextArea lore2;

    public ATourCentralinferior(){
        Ordenar();
    }
    public void Ordenar(){
        lore = new JLabel("Descripcioon del lugar");
        lore2 = new JTextArea();

        GridLayout grid = new GridLayout(2,1);
        setLayout(grid);
        add(lore);
        add(lore2);
    }

}
