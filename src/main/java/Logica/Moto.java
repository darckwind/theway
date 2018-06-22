package Logica;

public class Moto {

    //variable initialization
    private String marca,modelo,nChasis,nMotor,patente;
    private int ano;

    public Moto(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getnChasis() {
        return nChasis;
    }

    public void setnChasis(String nChasis) {
        this.nChasis = nChasis;
    }

    public String getnMotor() {
        return nMotor;
    }

    public void setnMotor(String nMotor) {
        this.nMotor = nMotor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nChasis='" + nChasis + '\'' +
                ", nMotor='" + nMotor + '\'' +
                ", patente='" + patente + '\'' +
                ", ano=" + ano +
                '}';
    }
}
