package Validacion;

import javax.swing.*;

public class ValidacionNumero extends InputVerifier{
    //Valida que sea solo numeros
    @Override
    public boolean verify(JComponent input) {
        String test = ((JTextField)input).getText();
        try {
            int duracion = Integer.parseInt(test);
        } catch(NumberFormatException e) {
            System.out.println("not numero");
            return false;
        } catch(NullPointerException e) {
            System.out.println("vacio");
            return false;
        }
        return true;
    }

}
