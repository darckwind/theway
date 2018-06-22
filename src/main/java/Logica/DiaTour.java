package Logica;

public class DiaTour {

    //variable initialization
    private String cordenadaSalida,cordenadaLLegada,descripcion,hotel;
    private int dia;

    public DiaTour() {
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

    @Override
    public String toString() {
        return "DiaTour{" +
                "cordenadaSalida='" + cordenadaSalida + '\'' +
                ", cordenadaLLegada='" + cordenadaLLegada + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", hotel='" + hotel + '\'' +
                ", dia=" + dia +
                '}';
    }
}
