package UI;

import Logica.DiaTour;
import Logica.Info;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ActualizarTour extends JDialog implements ActionListener {

    private int alto=340,ancho=800,duracion;
    private String titulo = "Configuracion Tours",idTour;
    private JPanel panelLateralInf,panelLateralSup, pannelLateral,panelCentral,panelCentralSup,panelCentralInf;
    private JComboBox dia,hotel2;
    private JLabel dia2,lore,cordenadaSalida,cordenadaLLegada,hotel;
    private JTextField cordenadaSalida2,cordenadaLLegada2;
    private JTextArea lore2;
    private JButton guardar;
    private JButton limpiar;
    private DiaTour diaTour;
    private Info info;



    public ActualizarTour(int time, String idTour){
        this.duracion=time;
        this.idTour=idTour;
        System.out.println(time);
        System.out.println(idTour);
        Orden();
    }
    private void Orden(){
        ConstruirLateral();
        CconstruirCentral();
        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);
        add(pannelLateral, BorderLayout.WEST);

        setModal(true);
        setTitle(titulo+" "+idTour);
        setSize(ancho, alto);
        setMinimumSize(getSize());
        setResizable(false);
        setVisible(true);
    }
    private void ConstruirLateral(){
        ConstruirLateralInf();
        ConstruirLaterlSup();
        pannelLateral = new JPanel();
        pannelLateral.setLayout(new BorderLayout());
        pannelLateral.add(panelLateralSup, BorderLayout.NORTH);
        pannelLateral.add(panelLateralInf, BorderLayout.SOUTH);

    }
    private void ConstruirLateralInf(){
        panelLateralInf = new JPanel();
        guardar = new JButton("Guardar");
        guardar.addActionListener(this);
        limpiar = new JButton("Limpiar");
        limpiar.addActionListener(this);
        panelLateralInf = new JPanel();
        GridLayout grid = new GridLayout(2, 1,5,10);
        panelLateralInf.add(guardar);
        panelLateralInf.add(limpiar);
    }
    public void ConstruirLaterlSup(){
        panelLateralSup = new JPanel();
        dia = new JComboBox();
        for (int i = 0; i <duracion;i++){
            dia.addItem(i+1);
        }
        dia2 = new JLabel("Dia");
        GridLayout grid = new GridLayout(2, 1,5,10);
        panelLateralSup.setLayout(grid);
        panelLateralSup.add(dia2);
        panelLateralSup.add(dia);
    }



    public void CconstruirCentral(){
        ConstrirCentrarInf();
        ConstruirCentralSup();
        panelCentral=new JPanel();
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        panelCentral.setLayout(grid);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx=0;
        c.gridy=0;
        panelCentral.add(panelCentralSup,c );
        c.gridx=0;
        c.gridy=1;
        panelCentral.add(panelCentralInf,c);

    }
    public void ConstruirCentralSup(){

        panelCentralSup = new JPanel();
        cordenadaSalida = new JLabel("Cordenada de Salida");
        cordenadaSalida2 = new JTextField();
        cordenadaLLegada = new JLabel("Cordenada de LLegada");
        cordenadaLLegada2 = new JTextField();
        hotel = new JLabel("hoteles");
        hotel2 = new JComboBox();

        GridLayout grid = new GridLayout(3,2,5,10);
        panelCentralSup.setLayout(grid);
        panelCentralSup.add(cordenadaSalida);
        panelCentralSup.add(cordenadaSalida2);
        panelCentralSup.add(cordenadaLLegada);
        panelCentralSup.add(cordenadaLLegada2);
        panelCentralSup.add(hotel);
        panelCentralSup.add(hotel2);
    }

    public void ConstrirCentrarInf(){
        panelCentralInf = new JPanel();
        lore = new JLabel("Descripcioon del lugar");
        lore2 = new JTextArea();

        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        panelCentralInf.setLayout(grid);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        panelCentralInf.add(lore,c);
        c.ipady = 110;
        c.gridx=0;
        c.gridy=1;
        panelCentralInf.add(lore2,c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand()=="Guardar"){
            diaTour  = new DiaTour(cordenadaSalida2,cordenadaLLegada2,lore2,idTour,dia);
            System.out.println(diaTour);
        }else if (e.getActionCommand()=="Limpiar"){
            lore2.setText(null);
            cordenadaSalida2.setText(null);
            cordenadaLLegada2.setText(null);

        }

    }
}
