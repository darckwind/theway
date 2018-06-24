package Logica;

import javax.swing.*;
import java.util.Date;

public class Tour {
    //variable initialization
    private String nombre,guia,duracion;

    private Date inicio;

    public Tour(JTextField id2, JTextField duracion2, JTextField guia2) {
        this.nombre = id2.getText();
        this.guia = guia2.getText();
        this.duracion = duracion2.getText();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", guia='" + guia + '\'' +
                ", duracion=" + duracion +
                ", inicio=" + inicio +
                '}';
    }
}
