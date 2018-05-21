package UI;

import javax.swing.*;
import java.awt.*;

public class DatosMotos extends JDialog {

    private JLabel lMarca, lModelo, lAno, lNChasis, lNMotor, lPantente;
    private JTextField marca,modelo,nMotor,nChasis,ano,patente;
    private JButton guardar, limpiar;
    private JPanel panelCentral, panelInferior;
    private  int alto = 440, ancho= 800;
    private String titulo = "Datos Motos";

    public DatosMotos() {
        Orden();
    }

    public void Orden(){
        ConstruirCentral();
        ConstruirInferior();
        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        setModal(true);
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setVisible(true);
    }

    public void ConstruirCentral(){

        lMarca= new JLabel("Marca");
        marca= new JTextField();
        lModelo=  new JLabel("Modelo");
        modelo=new JTextField();
        lAno = new JLabel("año");
        ano= new JTextField();
        lNChasis = new JLabel("N° Chasis");
        nChasis = new JTextField();
        lNMotor = new JLabel("N° Motor");
        nMotor = new JTextField();
        lPantente =new JLabel("Patente");
        patente= new JTextField();

        panelCentral= new JPanel();

        GridLayout grid = new GridLayout(3,4);
        panelCentral.setLayout(grid);

        panelCentral.add(lMarca);
        panelCentral.add(marca);
        panelCentral.add(lModelo);
        panelCentral.add(modelo);
        panelCentral.add(lAno);
        panelCentral.add(ano);
        panelCentral.add(lNChasis);
        panelCentral.add(nChasis);
        panelCentral.add(lNMotor);
        panelCentral.add(nMotor);
        panelCentral.add(lPantente);
        panelCentral.add(patente);

    }

    public void ConstruirInferior(){

        guardar= new JButton("Guardar");
        limpiar =  new JButton("Limpiar");
        panelInferior = new JPanel();
        GridLayout grid =  new GridLayout(1,2);
        panelInferior.setLayout(grid);
        panelInferior.add(guardar);
        panelInferior.add(limpiar);
    }

}
