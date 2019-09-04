package PacoteJava;

import javax.swing.JOptionPane;
import PacoteJava.Responder;
import PacoteJava.Operacoes;

public class Entrada{
    public static void main(String[] args) {
        double v1 = 0, v2 = 0,resp = 0;
        String aux = "",st = null;
        int escolha = 0;
        
        try{
        aux = JOptionPane.showInputDialog(null, "Escolha uma operação: \n "
                + "1- soma \n"
                + "2- subtracao \n"
                + "3- multiplicacao \n"
                + "4- divisao \n");
        escolha = Integer.parseInt(aux);
        
        switch(escolha){
                case 1 : st = "Soma"; break;
                case 2 : st = "Subtração"; break;
                case 3 : st = "Multiplicação"; break;
                case 4 : st = "Divisão"; break;
                default: st = "Inexistente";main(args);            
        }
        
        aux = JOptionPane.showInputDialog(null, "Digite um valor: ");
        v1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite um valor: ");
        v2 = Double.parseDouble(aux);
        
        if (escolha == 1){
           resp = Operacoes.soma(v1, v2);
        }
        
        if (escolha == 2){
           resp = Operacoes.subtracacao(v1, v2);
        }
        
        if (escolha == 3){
           resp = Operacoes.multiplicacacao(v1, v2);  
        }
        
        if (escolha == 4){
           resp = Operacoes.divisao(v1, v2);   
        }
    
        JOptionPane.showMessageDialog(null,"Valores digitados: "+"\n"
                + v1+" e "+v2+"\n"
                        + "Operador Selecionado:"+"\n"
                        + st+"\n"
                        + "A "+st+" de "+v1+" e "+v2+" = "+resp); 
        Responder.responder();
        }
        
        
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Favor inserir somente números");
            System.exit(0);
        }
        catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
            System.exit(0);
        
    }
    
}

}