/* Trabalho de Laboratório de Programação 3
   José Eduardo de Azevedo Sousa - 201135028
*/
package dcc171.ufjf.br;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Trabalho1 {

  
    public static void main(String[] args) {
       
        System.out.println("Iniciando");
        
        Escola esc = new Escola();
        Aluno novoAluno = new Aluno("Jose Eduardo","eduardoteste","123");
        ArrayList<Aluno> novaList = new ArrayList<Aluno>();
        novaList.add(novoAluno);
        Escola.setListaAlunos(novaList);
        
        MainFrame janela = new MainFrame();
        janela.setSize(815,605);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        System.out.println("Fechando");
       
    }
    
    }
   
