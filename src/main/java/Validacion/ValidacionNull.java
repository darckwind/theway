package Validacion;

import javax.swing.*;

public class ValidacionNull extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String test = ((JTextField)input).getText();

        try{
            if(test.isEmpty()){
                throw new Exception("Not a perfect");

            }else{
                System.out.println("funca");
            }

        }catch(Exception j){
            j.getMessage();
            return false;
        }
        return true;
    }
}
