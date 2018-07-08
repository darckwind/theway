package UI;

import Logica.Cliente;
import Logica.DiaTour;
import Validacion.ValidacionEmail;
import Validacion.ValidacionNull;
import Validacion.ValidacionTexto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActualizarCliente extends JDialog implements ActionListener {

    private JComboBox cliente;
    private JButton guardar, limpiar;
    private JTextField nombre, apellido,npasaporte, email, modelomoto, patente;
    private JLabel lNombre,lapellido,lNPasaporte,lEmail,lModeloMoto,lPatente,lcliente,lHabitacion;
    private JPanel panelLateralSup,panelLateralInf, panelCentral, panelLateral;
    private JComboBox habitacion;
    private int alto=250;
    private int ancho=600;
    private Cliente client;
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
        setResizable(true);
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
        guardar.addActionListener(this);
        limpiar =  new JButton("Limpiar");
        limpiar.addActionListener(this);
        panelLateralInf =  new JPanel();
        GridLayout grid = new GridLayout(2,1);
        panelLateralInf.add(guardar);
        panelLateralInf.add(limpiar);
    }

    public void ConstruirPanelCentral(){
        nombre = new JTextField();
        lNombre= new JLabel("Nombre");
        nombre.setInputVerifier(new ValidacionTexto());
        apellido =  new JTextField();
        lapellido =  new JLabel("Apelido");
        apellido.setInputVerifier(new ValidacionTexto());
        npasaporte = new JTextField();
        lNPasaporte =  new JLabel("N° Identificacion");
        npasaporte.setInputVerifier(new ValidacionNull());
        email= new JTextField();
        lEmail =  new JLabel("Email");
        email.setInputVerifier(new ValidacionEmail());

        lHabitacion = new JLabel("Preferencia de habitacion");
        habitacion = new JComboBox();
        habitacion.addItem("Suit");
        habitacion.addItem("Double");
        habitacion.addItem("Single");

        modelomoto = new JTextField();
        lModeloMoto = new JLabel("Modelo Moto");
        patente =  new JTextField();
        lPatente = new JLabel("Patente");

        panelCentral =  new JPanel();
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        panelCentral.setLayout(grid);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.1;
        c.gridx = 0;
        c.gridy = 0;
        panelCentral.add(lNombre,c);
        c.gridx = 1;
        c.gridy = 0;
        panelCentral.add(nombre,c);
        c.gridx = 0;
        c.gridy = 1;
        panelCentral.add(lapellido,c);
        c.gridx = 1;
        c.gridy = 1;
        panelCentral.add(apellido,c);

        c.gridx = 0;
        c.gridy = 2;
        panelCentral.add(lNPasaporte,c);
        c.gridx = 1;
        c.gridy = 2;
        panelCentral.add(npasaporte,c);
        c.gridx = 0;
        c.gridy = 3;
        panelCentral.add(lEmail,c);
        c.gridx=1;
        c.gridy=3;
        panelCentral.add(email,c);
        c.gridx=0;
        c.gridy=4;
        panelCentral.add(lHabitacion,c);
        c.gridx=1;
        c.gridy=4;
        panelCentral.add(habitacion,c);
        c.gridx=0;
        c.gridy=5;
        panelCentral.add(lModeloMoto,c);
        c.gridx=1;
        c.gridy=5;
        panelCentral.add(modelomoto,c);
        c.gridx=0;
        c.gridy=6;
        panelCentral.add(lPatente,c);
        c.gridx=1;
        c.gridy=6;
        panelCentral.add(patente,c);

    }
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand()=="Guardar"){
            try {
                if (nombre.getText().isEmpty()||apellido.getText().isEmpty()||npasaporte.getText().isEmpty()||email.getText().isEmpty()||modelomoto.getText().isEmpty()||patente.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Rellene los campos pertinentes antes de enviar");
                }else{
                    client =  new Cliente(nombre,apellido,npasaporte,email);
                    System.out.println(client);
                }
            }catch (NullPointerException de){
                de.getMessage();
            }

        }else if (e.getActionCommand()=="Limpiar"){
            nombre.setText(null);
            apellido.setText(null);
            npasaporte.setText(null);
            email.setText(null);
            modelomoto.setText(null);
            patente.setText(null);

        }

    }
}
