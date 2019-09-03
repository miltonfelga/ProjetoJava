
package PacoteJava;
import PacoteJava.Entrada;
import PacoteJava.Operacoes;
import javax.swing.JOptionPane;
public class Responder {
    public static void responder(double v1,double v2, int escolha){
        double resp = 0;
        if (escolha == 1){
           resp = Operacoes.soma(v1, v2);
           JOptionPane.showMessageDialog(null,"A resposta é: "+resp);
            
        }
        if (escolha == 2){
           resp = Operacoes.subtracacao(v1, v2);
           JOptionPane.showMessageDialog(null,"A resposta é: "+resp);
            
        }
        if (escolha == 3){
           resp = Operacoes.multiplicacacao(v1, v2);
           JOptionPane.showMessageDialog(null,"A resposta é: "+resp);
            
        }
        if (escolha == 4){
           resp = Operacoes.divisao(v1, v2);
           JOptionPane.showMessageDialog(null,"A resposta é: "+resp);
            
        }
      
            
        }
    }

