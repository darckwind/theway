package UI;

import javax.swing.*;
import java.awt.*;

public class ATourCentralSuperior extends JPanel {

    private JLabel cordenadaSalida;
    private JTextField cordenadaSalida2;
    private JLabel cordenadaLLegada;
    private JTextField cordenadaLLegada2;
    private JLabel hotel;
    private JComboBox hotel2;



    public ATourCentralSuperior() {
        Ordenar();
    }

    public void Ordenar(){
        cordenadaSalida = new JLabel("Cordenada de Salida");
        cordenadaSalida2 = new JTextField();
        cordenadaLLegada = new JLabel("Cordenada de LLegada");
        cordenadaLLegada2 = new JTextField();
        hotel = new JLabel("hoteles");
        hotel2 = new JComboBox();

        GridLayout grid = new GridLayout(3,2);
        setLayout(grid);
        add(cordenadaSalida);
        add(cordenadaSalida2);
        add(cordenadaLLegada);
        add(cordenadaLLegada2);
        add(hotel);
        add(hotel2);
    }

}
