
package PacoteJava;
import javax.swing.JOptionPane;

public class Feira {
    public static void main(String[] args) {
        String st = null;
        String a;
        int escolha;
        
        a= JOptionPane.showInputDialog(null, "Escolha a opção desejada! \n"
                + "1- Abacaxi \n"
                + "2- Abacate \n"
                + "3- Abobora \n"
                + "4- Chocolate \n"
                + "5- Coco \n"
                + "6- Laranja \n"
                + "7- Morango \n"
                + "8- Tangerina \n");
                escolha = Integer.parseInt(a);
                          
                          switch(escolha)
                          {
                              case 1 : st = "Abacaxi"; break;
                              case 2 : st = "Abacate"; break;
                              case 3 : st = "Abobora"; break;
                              case 4 : st = "Chocolate"; break;
                              case 5 : st = "Coco"; break;
                              case 6 : st = "Laranja"; break;
                              case 7 : st = "Morango"; break;
                              case 8 : st = "Tangerina"; break;
                              default : st = "Inexistente !";
                          }
                          
                          JOptionPane.showMessageDialog(null, "Você escolheu: " + st);
    }
    
}
