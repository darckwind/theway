package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectMotos extends JDialog implements ActionListener {

    private JComboBox marca,modelo,patente;
    private JButton crear,eliminar,actualizar;
    private JPanel panelLateral,panelLateralSup,panelLateralinf,panelcentral;
    private int ancho=380,alto=180;
    private String titulo="Motos";
    private ImageIcon imgDelete,imgUpdate,imgAdd;


    public SelectMotos() {
        Orden();
    }

    public void Orden(){
        /**
         * Configuracion de la ventana
         */
        ConstruirCentral();
        ConstruirLateral();

        setLayout(new FlowLayout());

        add(panelLateral);
        add(panelcentral);

        setModal(true);
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setVisible(true);

    }
    public void ConstruirLateral(){
        ConstruirPanelLatSuperior();
        ConstruirPanelLatInferior();
        panelLateral =  new JPanel();
        GridLayout grid = new GridLayout(2,1);
        panelLateral.setLayout(grid);
        panelLateral.add(panelLateralSup);
        panelLateral.add(panelLateralinf);
    }
    public void ConstruirPanelLatSuperior(){
        marca = new JComboBox();
        modelo= new JComboBox();
        patente = new JComboBox();
        panelLateralSup = new JPanel();
        GridLayout grid = new GridLayout(3,1,5,10);
        panelLateralSup.setLayout(grid);
        panelLateralSup.add(marca);
        panelLateralSup.add(modelo);
        panelLateralSup.add(patente);
    }
    public void ConstruirPanelLatInferior(){

        imgDelete = new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"eliminar.png");
        imgUpdate = new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"update.png");

        Icon icoUpdate= new ImageIcon(this.imgUpdate.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));
        Icon icoDelete =  new ImageIcon(this.imgDelete.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));

        eliminar= new JButton("Eliminar");
        eliminar.setIcon(icoDelete);
        eliminar.addActionListener(this);
        actualizar= new JButton("Actualizar");
        actualizar.setIcon(icoUpdate);
        actualizar.addActionListener(this);
        panelLateralinf = new JPanel();
        GridLayout grid = new GridLayout(1,2,5,10);
        panelLateralinf.add(eliminar);
        panelLateralinf.add(actualizar);
    }
    public void ConstruirCentral(){

        imgAdd =  new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"add.png");

        Icon icoAdd = new ImageIcon(this.imgAdd.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));

        crear =  new JButton("Crear");
        crear.setIcon(icoAdd);
        crear.addActionListener(this);
        panelcentral=new JPanel();
        panelcentral.setLayout(new BorderLayout());
        panelcentral.add(crear, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        /**
         * eventos
         */
        if(e.getActionCommand()== "Actualizar"){
            setVisible(false);
            DatosMotos datosMotos = new DatosMotos();
        }else if(e.getActionCommand()=="Eliminar"){

        }else if (e.getActionCommand() == "Crear"){
            setVisible(false);
            DatosMotos datosMotos = new DatosMotos();
        }
    }

}
