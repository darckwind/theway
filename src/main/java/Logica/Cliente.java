package Logica;

import javax.swing.*;

public class Cliente {
    //variable initialization
    private String nombre,apellido,identificacion,email,habitacion;

    public Cliente(JTextField nombre, JTextField apellido, JTextField npasaporte, JTextField email) {
        this.nombre = nombre.getText();
        this.apellido = apellido.getText();
        this.identificacion = npasaporte.getText();
        this.email = email.getText();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", email='" + email + '\'' +
                ", habitacion='" + habitacion + '\'' +
                '}';
    }
    public void EnvioCliente(){

    }
}
