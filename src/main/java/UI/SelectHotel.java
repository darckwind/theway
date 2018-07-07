package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectHotel extends JDialog implements ActionListener {

    private int alto = 100, ancho=380;
    private String titulo  ="Hoteles";
    private JButton actualizar,eliminar,crear;
    private JComboBox hoteles;
    private JPanel panelCentral, panelLateral, panelCenSup, panelCenInf;
    private ImageIcon imgDelete,imgUpdate,imgAdd;

    public SelectHotel() {
        Orden();
    }

    public void Orden(){
        ConstruirCentral();
        ConstruirLateral();
        setLayout(new FlowLayout());
        add(panelCentral);
        add(panelLateral);

        setModal(true);
        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setVisible(true);

    }

    public void ConstruirCentral(){
        ConstruirPanelCentSuperior();
        ConstruirPanelCentInferior();
        panelCentral =  new JPanel();

        GridLayout grid = new GridLayout(2,1,5,10);
        panelCentral.setLayout(grid);
        panelCentral.add(panelCenSup);
        panelCentral.add(panelCenInf);

    }

    public void ConstruirPanelCentInferior(){

        imgDelete = new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"eliminar.png");
        imgUpdate = new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"update.png");

        Icon icoUpdate= new ImageIcon(this.imgUpdate.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));
        Icon icoDelete =  new ImageIcon(this.imgDelete.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));

        actualizar = new JButton("Actualizar");
        actualizar.setIcon(icoUpdate);
        actualizar.addActionListener(this);
        eliminar =  new JButton("Eliminar");
        eliminar.setIcon(icoDelete);
        eliminar.addActionListener(this);

        panelCenInf = new JPanel();
        GridLayout grid = new GridLayout(1,2,5,10);
        panelCenInf.setLayout(grid);

        panelCenInf.add(actualizar);
        panelCenInf.add(eliminar);
    }

    public void ConstruirPanelCentSuperior(){
        hoteles = new JComboBox();
        panelCenSup = new JPanel();
        panelCenSup.setLayout(new BorderLayout());
        panelCenSup.add(hoteles);
    }

    public void ConstruirLateral(){

        imgAdd =  new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"add.png");

        Icon icoAdd = new ImageIcon(this.imgAdd.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));

        crear =  new JButton("Crear");
        crear.setIcon(icoAdd);
        crear.addActionListener(this);
        panelLateral = new JPanel();
        panelLateral.setLayout(new BorderLayout());
        panelLateral.add(crear, BorderLayout.SOUTH);

    }
    public void actionPerformed(ActionEvent e) {
        /**
         * eventos
         */
        if (e.getActionCommand()=="Actualizar"){
            setVisible(false);
            DatosHoteles datosHoteles = new DatosHoteles();

        }else if (e.getActionCommand()=="Crear"){
            setVisible(false);
            DatosHoteles datosHoteles = new DatosHoteles();

        }else if (e.getActionCommand()== "Eliminar"){
            System.out.println("coming soon");

        }
    }
}
