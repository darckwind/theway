package Validacion;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionTexto extends InputVerifier {


    //Valida que sea solo string
    @Override
    public boolean verify(JComponent input) {
        String test = ((JTextField)input).getText();
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(test);

        try{
            if(matcher.find()){
            }else{
                JOptionPane.showMessageDialog(null, "El campo solo puede contener texto");
                throw new Exception("Not a perfect String");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "el Campo no puede estar vacio");
            return false;
        }
        return true;
    }
}
