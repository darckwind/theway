package UI;

import Logica.Moto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatosMotos extends JDialog implements ActionListener {

    private JLabel lMarca, lModelo, lAno, lNChasis, lNMotor, lPantente;
    private JTextField marca,modelo,nMotor,nChasis,ano,patente;
    private JButton guardar, limpiar;
    private JPanel panelCentral, panelInferior;
    private  int alto = 340, ancho= 500;
    private String titulo = "Datos Motos";
    private Moto moto;

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
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        panelCentral.setLayout(grid);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty=0.5;
        c.gridx=0;
        c.gridy=0;
        panelCentral.add(lMarca,c);
        c.gridx=1;
        c.gridy=0;
        panelCentral.add(marca,c);
        c.gridx=0;
        c.gridy=1;
        panelCentral.add(lModelo,c);
        c.gridx=1;
        c.gridy=1;
        panelCentral.add(modelo,c);
        c.gridx=0;
        c.gridy=2;
        panelCentral.add(lAno,c);
        c.gridx=1;
        c.gridy=2;
        panelCentral.add(ano,c);
        c.gridx=0;
        c.gridy=3;
        panelCentral.add(lNChasis,c);
        c.gridx=1;
        c.gridy=3;
        panelCentral.add(nChasis,c);
        c.gridx=0;
        c.gridy=4;
        panelCentral.add(lNMotor,c);
        c.gridx=1;
        c.gridy=4;
        panelCentral.add(nMotor,c);
        c.gridx=0;
        c.gridy=5;
        panelCentral.add(lPantente,c);
        c.gridx=1;
        c.gridy=5;
        panelCentral.add(patente,c);

    }

    public void ConstruirInferior(){

        guardar= new JButton("Guardar");
        guardar.addActionListener(this);
        limpiar =  new JButton("Limpiar");
        limpiar.addActionListener(this);
        panelInferior = new JPanel();
        GridLayout grid =  new GridLayout(1,2);
        panelInferior.setLayout(grid);
        panelInferior.add(guardar);
        panelInferior.add(limpiar);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="Guardar"){
            moto =  new Moto(marca,modelo,ano,nChasis,nMotor,patente);
            System.out.println(moto);
        }else if (e.getActionCommand()=="Limpiar"){
            marca.setText(null);
            modelo.setText(null);
            ano.setText(null);
            nChasis.setText(null);
            nMotor.setText(null);
            patente.setText(null);
        }
    }

}
