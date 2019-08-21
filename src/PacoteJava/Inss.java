
package PacoteJava;
import javax.swing.JOptionPane;


public class Inss {
    public static void main(String[] args) {
        double salario = 0; double nSalario = 0; double inss = 0;
        double aliquota = 0;
        String aux;
        aux = JOptionPane.showInputDialog(null, "Digite seu salario e calcule seu inss");
        salario = Double.parseDouble(aux);
        
        if (salario < 466.00){
            JOptionPane.showMessageDialog(null, "Salario invalido!!");
            System.exit(0);
        }
        if(salario<= 965.67){
            aliquota = 8;
            inss = salario * aliquota/100;
            nSalario = salario-inss;
        }
        if(salario >= 956.68 && salario <= 1609.45){
            aliquota = 9;
            inss = salario * aliquota/100;
            nSalario = salario-inss;
        }
        if(salario >= 1609.46){
            aliquota = 11;
            inss = salario * aliquota/100;
            nSalario = salario-inss;
            if(inss > 354.07){
                inss = 354.07;
            }
        }
            JOptionPane.showMessageDialog(null, "Seu salario liquido é: " + nSalario + "\n"
                    + "Sua aliquota é: " + aliquota + "\n"
                            + "Seu INSS é: " + inss);

        
    
            }
}
