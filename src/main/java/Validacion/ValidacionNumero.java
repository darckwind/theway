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
            JOptionPane.showMessageDialog(null, "porfavor ingrese un numero valido");
            return false;
        } catch(NullPointerException e) {
            JOptionPane.showMessageDialog(null, "el Campo no puede estar vacio");
            return false;
        }
        return true;
    }

}
