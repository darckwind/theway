package Logica;

import UI.ActualizarTour;

import javax.swing.*;

public class Info {
    public String [] dia = {"1", "2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    public String [] mes = {"1", "2","3","4","5","6","7","8","9","10","11","12"};
    public String [] anio = {"2018","2019","2020","2021"};
    public String [] diaTour;
    private ActualizarTour actualizarTour;

    public void Dias(int duracion){

        diaTour = new String[duracion];
        for (int i = 0; i < duracion; i++){
            this.diaTour[i]=Integer.toString(i+1);
            System.out.println(diaTour[i]);
        }
    }

}
