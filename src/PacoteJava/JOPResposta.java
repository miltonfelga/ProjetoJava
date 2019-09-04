package Pacote;

import javax.swing.*;

public class JOPResposta {
    
    public static void main(String[] args) {
        String aux = "";
        double valor1;
        
        try {
            aux = JOptionPane.showInputDialog(null, "Insira o primeito valor");
            valor1 = Double.parseDouble(aux);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Favor inserir somente números");
            System.exit(0);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
            System.exit(0);
            
        }
        
    }
    
}
