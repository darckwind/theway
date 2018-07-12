package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTour extends JDialog  implements ActionListener{

    private int alto=100;
    private int ancho=300;
    private String titulo ="Tour's";
    private JButton agregar;
    private JButton actualizar;
    private JComboBox tour;
    private JPanel panel;
    private ImageIcon  imgUpdate, imgAdd;

    public SelectTour(){

        Orden();
    }
    private void Orden(){
        /**
         * Inicializacion Imagnes
         */
        imgUpdate = new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"update.png");
        imgAdd =  new ImageIcon("iconos-botones"+System.getProperty("file.separator")+"add.png");

        /**
         * Inicializacion iconos
         */
        Icon icoUpdate =  new ImageIcon(this.imgUpdate.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));
        Icon icoAdd = new ImageIcon(this.imgAdd.getImage().getScaledInstance( 20, 20, Image.SCALE_DEFAULT));

        /**
         * inicializacion botones con eventos
         */

        panel = new JPanel(new GridBagLayout());
        tour = new JComboBox();
        actualizar = new JButton("Actualizar");
        actualizar.setIcon(icoUpdate);
        actualizar.addActionListener(this);
        agregar = new JButton("agregar");
        agregar.setIcon(icoAdd);
        agregar.addActionListener(this);

        /**
         * configuracion layout
         */

        GridLayout grid =new GridLayout(2,4,5,10);
        setLayout(grid);
        add(tour);
        tour.setPreferredSize(new Dimension(0,20));
        add(new JLabel());
        add(actualizar);
        add(agregar);

        /**
         * configuracion JDialog
         */

        setTitle(titulo);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setModal(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        /**
         * eventos
         */
        String id = "lel";
        int time = 12;
        if(e.getActionCommand()== "Actualizar"){
            setVisible(false);
            ActualizarTour aTour =new ActualizarTour(time,id);
        }else{
            setVisible(false);
            CreacionTour creacion = new CreacionTour();

        }

    }

}
