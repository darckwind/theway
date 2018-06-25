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
    private  int alto = 440, ancho= 800;
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
        //cisjaodajslid
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
