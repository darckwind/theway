package Validacion;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionEmail extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String email = ((JTextField)input).getText();
        Pattern pattern = Pattern.compile("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        try{
            if(matcher.find()){
            }else{
                JOptionPane.showMessageDialog(null, "Correo no valido");
                throw new Exception("Not a perfect Email");
            }
        }catch(Exception j){
            j.getMessage();
            return false;
        }
        return true;
    }
}
