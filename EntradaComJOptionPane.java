
package PacoteJava;
import javax.swing.*;
import javax.swing.JOptionPane;


public class EntradaComJOptionPane {
    public static void main(String[] args) {
        
    
    String aux="";
    double nota1 =0, nota2 =0 , trabalho = 0, media = 0;
    try{
        aux =JOptionPane.showInputDialog(null,"Entre com a nota1");
        nota1=Double.parseDouble(aux);
        
        aux=JOptionPane.showInputDialog(null,"Entre com a nota 2 ");
        nota2=Double.parseDouble(aux);
        
        aux=JOptionPane.showInputDialog(null,"Entre com a nota do trabalho ");
        trabalho=Double.parseDouble(aux);
        
        media=(nota1+nota2+trabalho)/3;
        JOptionPane.showMessageDialog(null,"Media: "+ media);
    }
    catch(NumberFormatException erro){
        JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos"+ erro.toString());
    }
    System.exit(0);
    }
}

    
        
    

            
