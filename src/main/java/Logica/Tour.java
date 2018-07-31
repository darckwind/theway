package Logica;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import javax.swing.*;
import java.util.Date;

public class Tour {
    //variable initialization
    private String nombre,guia,duracion;

    private Date inicio;

    public Tour(JTextField id2, JTextField duracion2, JTextField guia2, Date fecha) {
        this.nombre = id2.getText();
        this.guia = guia2.getText();
        this.duracion = duracion2.getText();
        this.inicio = fecha;
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
        return "{" +
                "nombre='" + nombre + '\'' +
                ", guia='" + guia + '\'' +
                ", duracion=" + duracion +
                ", inicio=" + inicio +
                '}';

    }


}
