package UI;

import javax.swing.*;
import java.awt.*;

public class ATourCentral extends JPanel {

    private ATourCentralSuperior superior;
    private ATourCentralinferior inferior;

    public ATourCentral(){
        Orden();
    }

    public void Orden(){

        superior = new ATourCentralSuperior();
        inferior = new ATourCentralinferior();

        setLayout(new BorderLayout());
        this.add(superior , BorderLayout.NORTH);
        this.add(inferior, BorderLayout.CENTER);


    }
}
