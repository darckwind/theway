package Logica;

import javax.swing.*;

public class hoteles {
    //variable initialization
    private String ubicacion,nombre,email,telefono;
    private boolean suit,single,doble;

    public hoteles(JTextField nombre,JTextField contacto ,JTextField ubicacion, JCheckBox single, JCheckBox doble, JCheckBox suit, JTextField email) {
        this.nombre= nombre.getText();
        this.ubicacion =  ubicacion.getText();
        this.email = email.getText();
        this.single= single.isSelected();
        this.doble = doble.isSelected();
        this.suit =  suit.isSelected();
        this.telefono = contacto.getText();
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isSuit() {
        return suit;
    }

    public void setSuit(boolean suit) {
        this.suit = suit;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    public boolean isDoble() {
        return doble;
    }

    public void setDoble(boolean doble) {
        this.doble = doble;
    }

    @Override
    public String toString() {
        return "hoteles{" +
                "ubicacion='" + ubicacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", suit=" + suit +
                ", single=" + single +
                ", doble=" + doble +
                '}';
    }
}
