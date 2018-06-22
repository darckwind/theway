package Logica;

import java.util.Date;

public class Tour {
    //variable initialization
    private String nombre,guia;
    private int duracion;
    private Date inicio;

    public Tour() {
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
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
