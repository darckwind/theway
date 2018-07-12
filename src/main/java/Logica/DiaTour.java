package Logica;

import javax.swing.*;

public class DiaTour {

    //variable initialization
    private String cordenadaSalida,cordenadaLLegada,descripcion,hotel,idTour;
    private int dia;

    public DiaTour(JTextField cordenadaSalida2, JTextField cordenadaLLegada2, JTextArea lore2, String idTour, JComboBox dia) {
        this.cordenadaSalida=cordenadaSalida2.getText();
        this.cordenadaLLegada = cordenadaLLegada2.getText();
        this.descripcion =  lore2.getText();
        this.idTour=idTour;
        this.dia= (int) dia.getSelectedItem();
    }

    public String getCordenadaSalida() {
        return cordenadaSalida;
    }

    public void setCordenadaSalida(String cordenadaSalida) {
        this.cordenadaSalida = cordenadaSalida;
    }

    public String getCordenadaLLegada() {
        return cordenadaLLegada;
    }

    public void setCordenadaLLegada(String cordenadaLLegada) {
        this.cordenadaLLegada = cordenadaLLegada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getIdTour() {
        return idTour;
    }

    public void setIdTour(String idTour) {
        this.idTour = idTour;
    }


    @Override
    public String toString() {
        return "DiaTour{" +
                "cordenadaSalida='" + cordenadaSalida + '\'' +
                ", cordenadaLLegada='" + cordenadaLLegada + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", hotel='" + hotel + '\'' +
                ", idTour='" + idTour + '\'' +
                ", dia=" + dia +
                '}';
    }
}
