/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcc171.ufjf.br;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

/**
 *
 * @author 11910875651
 */
public class alunosMatriculadosFrame extends JFrame{

    private final DefaultListModel<Aluno> modeloAluno = new DefaultListModel<Aluno>();
    private final JList<Aluno> lstAluno = new JList<>();
    
    public alunosMatriculadosFrame(ArrayList<Aluno> alunosTemp) {
        super("Relaçao de Alunos na Classe");    
        new FlowLayout(SwingConstants.LEFT);
        JPanel pnlMain = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JScrollPane pnlMainFilho = new JScrollPane(lstAluno);
        pnlMain.add(pnlMainFilho);
        add(pnlMain);       
        for (Aluno aluno : alunosTemp)
        {
             modeloAluno.addElement(aluno);
        }
        lstAluno.setModel(modeloAluno);
      
    }
    
}
