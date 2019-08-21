
package PacoteJava;
import javax.swing.*;
public class Imc {
    public static void main(String[] args) {
        double peso = 0; double altura = 0; double imc = 0; 
        String aux = ""; String mensagem = "";
        
        aux = JOptionPane.showInputDialog(null,"Digite seu peso: ");
        peso = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null,"Digite sua altura: ");
        altura = Double.parseDouble(aux);
        

        imc = peso / (altura*altura);
        
        if(imc <= 18.5){
            mensagem = ("Excesso de magresa");
            
        };
        if(imc >= 18.5 && imc <= 25){
            mensagem = ("Peso Normal");
            
        };
        if(imc >= 25 && imc <= 30){
            mensagem = ("Excesso de peso");
            
        };
        if(imc >= 30 && imc <= 35 ){
            mensagem = ("Obesidade grau 1");
            
        };
        if(imc >= 35 && imc <= 40){
            mensagem = ("Obesidade grau 2");
            
        };
        if(imc >= 40 ){
            mensagem = ("Obesidade grau 3");
            
        };
        JOptionPane.showMessageDialog(null,"Seu imc é: " + imc + "\n"
                + mensagem );
        
        
    }
}
