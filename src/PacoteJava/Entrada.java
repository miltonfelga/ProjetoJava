
package PacoteJava;

import javax.swing.JOptionPane;
import PacoteJava.Responder;
import PacoteJava.Operacoes;

public class Entrada {
    public static void main(String[] args) {
        double v1 = 0, v2 = 0;
        String aux = "";
        int escolha = 0;
        String st = null;
        
       
        try{
        aux = JOptionPane.showInputDialog(null, "Escolha uma operação: \n "
                + "1- soma \n"
                + "2- subtracao \n"
                + "3- multiplicacao \n"
                + "4- divisao \n");
        escolha = Integer.parseInt(aux);
        
        if (escolha >4){
            JOptionPane.showMessageDialog(null,"Digite um número valido");
            Entrada.main(args);
        }
        
        aux = JOptionPane.showInputDialog(null, "Digite um valor: ");
        v1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite um valor: ");
        v2 = Double.parseDouble(aux);
         
        switch(escolha){
                case 1 : st = "Soma"; break;
                case 2 : st = "Subtração"; break;
                case 3 : st = "Multiplicação"; break;
                case 4 : st = "Divisão"; break;
                default: st = "Inexistente";

        }
        Responder.responder(v1, v2, escolha);
        
            
    }
    catch (NumberFormatException erro) {
    
        JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
        main(args);
    }
    
}

}