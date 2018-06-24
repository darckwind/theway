package UI;

import Logica.DiaTour;
import Logica.Info;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActualizarTour extends JDialog implements ActionListener {

    private int alto=640;
    private int ancho=800;
    private String titulo = "Configuracion Tours";
    private JPanel panelLateralInf,panelLateralSup, pannelLateral,panelCentral,panelCentralSup,panelCentralInf;
    private JComboBox dia,hotel2;
    private JLabel dia2,lore,cordenadaSalida,cordenadaLLegada,hotel;
    private JTextField cordenadaSalida2,cordenadaLLegada2;
    private JTextArea lore2;
    private JButton guardar;
    private JButton limpiar;
    private DiaTour diaTour;
    private Info info;



    public ActualizarTour(){
        Orden();

    }
    private void Orden(){
        ConstruirLateral();
        CconstruirCentral();
        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);
        add(pannelLateral, BorderLayout.WEST);

        setModal(true);
        setTitle(titulo);
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
        GridLayout grid = new GridLayout(2, 1);
        panelLateralInf.add(guardar);
        panelLateralInf.add(limpiar);
    }
    public void ConstruirLaterlSup(){

        panelLateralSup = new JPanel();
        dia = new JComboBox();
        dia2 = new JLabel("Dia");
        GridLayout grid = new GridLayout(2, 1);
        panelLateralSup.setLayout(grid);
        panelLateralSup.add(dia2);
        panelLateralSup.add(dia);
    }

    public void CconstruirCentral(){
        ConstrirCentrarInf();
        ConstruirCentralSup();
        panelCentral=new JPanel();
        panelCentral.setLayout(new BorderLayout());
        panelCentral.add(panelCentralSup , BorderLayout.NORTH);
        panelCentral.add(panelCentralInf, BorderLayout.CENTER);

    }
    public void ConstruirCentralSup(){

        panelCentralSup = new JPanel();
        cordenadaSalida = new JLabel("Cordenada de Salida");
        cordenadaSalida2 = new JTextField();
        cordenadaLLegada = new JLabel("Cordenada de LLegada");
        cordenadaLLegada2 = new JTextField();
        hotel = new JLabel("hoteles");
        hotel2 = new JComboBox();

        GridLayout grid = new GridLayout(3,2);
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

        GridLayout grid = new GridLayout(2,1);
        panelCentralInf.setLayout(grid);
        panelCentralInf.add(lore);
        panelCentralInf.add(lore2);
    }

    public JComboBox getDia() {
        return dia;
    }

    public void setDia(JComboBox dia) {
        this.dia = dia;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand()=="Guardar"){
            String nHotel = (String) hotel2.getSelectedItem();
            int sDia = (int) dia.getSelectedItem();
            diaTour  = new DiaTour(sDia,cordenadaSalida2,cordenadaLLegada2,nHotel,lore2);
            System.out.println(diaTour);
        }else if (e.getActionCommand()=="Limpiar"){
            lore2.setText(null);
            cordenadaSalida2.setText(null);
            cordenadaLLegada2.setText(null);

        }

    }
}
