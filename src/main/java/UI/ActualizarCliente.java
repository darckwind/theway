package UI;

import javax.swing.*;
import java.awt.*;

public class ActualizarCliente extends JDialog {

    private JComboBox cliente;
    private JButton guardar, limpiar;
    private JTextField nombre, apellido,npasaporte, email, modelomoto, patente;
    private JLabel lNombre,lapellido,lNPasaporte,lEmail,lModeloMoto,lPatente,lcliente;
    private JPanel panelLateralSup,panelLateralInf, panelCentral, panelLateral;
    private int alto=640;
    private int ancho=800;
    private String titulo = "Cliente";


    public ActualizarCliente() {
        Orden();
    }

    public void Orden(){
        ConstruirPanelLateral();
        ConstruirPanelCentral();
        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);
        add(panelLateral, BorderLayout.WEST);

        setModal(true);
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setVisible(true);

    }

    public void ConstruirPanelLateral(){
        ConstruirLateralSup();
        ConstruirLateralInf();
        panelLateral = new JPanel();
        panelLateral.setLayout(new BorderLayout());
        panelLateral.add(panelLateralSup, BorderLayout.NORTH);
        panelLateral.add(panelLateralInf, BorderLayout.SOUTH);


    }
    public void ConstruirLateralSup(){
        cliente = new JComboBox();
        lcliente = new JLabel("Cliente");
        panelLateralSup = new JPanel();
        GridLayout grid = new GridLayout(2,1);
        panelLateralSup.setLayout(grid);
        panelLateralSup.add(cliente);
        panelLateralSup.add(lcliente);
    }
    public void ConstruirLateralInf(){
        guardar = new JButton("Guardar");
        limpiar =  new JButton("limpiar");
        panelLateralInf =  new JPanel();
        GridLayout grid = new GridLayout(2,1);
        panelLateralInf.add(guardar);
        panelLateralInf.add(limpiar);
    }

    public void ConstruirPanelCentral(){
        nombre = new JTextField();
        lNombre= new JLabel("Nombre");
        apellido =  new JTextField();
        lapellido =  new JLabel("Apelido");
        npasaporte = new JTextField();
        lNPasaporte =  new JLabel("N° Pasaporte/Rut");
        email= new JTextField();
        lEmail =  new JLabel("Email");
        modelomoto = new JTextField();
        lModeloMoto = new JLabel("Modelo Moto");
        patente =  new JTextField();
        lPatente = new JLabel("Patente");

        panelCentral =  new JPanel();
        GridLayout grid = new GridLayout(3,4);
        panelCentral.setLayout(grid);
        panelCentral.add(lNombre);
        panelCentral.add(nombre);
        panelCentral.add(lapellido);
        panelCentral.add(apellido);
        panelCentral.add(lNPasaporte);
        panelCentral.add(npasaporte);
        panelCentral.add(lEmail);
        panelCentral.add(email);
        panelCentral.add(lModeloMoto);
        panelCentral.add(modelomoto);
        panelCentral.add(lPatente);
        panelCentral.add(patente);

    }
}
