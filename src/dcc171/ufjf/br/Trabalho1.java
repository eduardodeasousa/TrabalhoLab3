/* Trabalho de Laboratório de Programação 3
   José Eduardo de Azevedo Sousa - 201135028
*/
package dcc171.ufjf.br;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;

public class Trabalho1 {

  
    public static void main(String[] args) {
       
        System.out.println("Iniciando");
       //Adicionando Aluno, Professor e Aula iniciais.
        Aluno novoAluno = new Aluno("Jose Eduardo","eduardoteste","123");
        ArrayList<Aluno> novaList = new ArrayList<Aluno>();
        novaList.add(novoAluno);
        Escola.setListaAlunos(novaList);
        
        Professor novoProf = new Professor("Igor Knop","igorteste","321");
        ArrayList<Professor> novaLProf = new ArrayList<Professor>();
        novaLProf.add(novoProf);
        Escola.setListaProf(novaLProf);
        Calendar hora_ini = Calendar.getInstance();
        hora_ini.set(Calendar.HOUR_OF_DAY, 10);
        hora_ini.set(Calendar.MINUTE,00);
        hora_ini.set(Calendar.SECOND, 00);
        
        int maxAlunos = 15;
        float horas = (float) 2.0;
        Aula novaAula = new Aula(hora_ini,hora_ini,hora_ini,hora_ini,novoProf,"Lab Prog 3",horas,maxAlunos);
        ArrayList<Aula> listaAulas = new ArrayList<>();
        listaAulas.add(novaAula);
        Escola.setListaAula(listaAulas);
       
        MainFrame janela = new MainFrame();
        janela.setSize(826,670);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        System.out.println("Fechando");
       
    }
    
    }
   
