/* Trabalho de Laboratório de Programação 3
   José Eduardo de Azevedo Sousa - 201135028
*/
package dcc171.ufjf.br;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Trabalho1 {

  
    public static void main(String[] args) {
       
        System.out.println("Iniciando");
        
        MainFrame janela = new MainFrame();
        janela.setSize(815,605);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        System.out.println("Fechando");
    }
    
    }
   
