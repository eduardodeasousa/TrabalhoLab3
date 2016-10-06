package dcc171.ufjf.br;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MainFrame extends JFrame {
    
    private final JLabel lblAluno = new JLabel("Aluno");
    private final JLabel lblProfessor = new JLabel("Professor");
    private final JLabel lblCurso = new JLabel("Curso");
    private final JLabel lblAula = new JLabel("Aula");
    private final JList<Aluno> lstAlunos = new JList<>(new DefaultListModel<Aluno>());
 

    public MainFrame() {
        super("Escola Falsa para Trabalho 1 - Jose Eduardo");
    
        setLayout(new FlowLayout(SwingConstants.LEFT));
        JPanel pnlNoroeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        pnlNoroeste.setBackground(Color.BLACK);
        pnlNoroeste.setPreferredSize(new Dimension(150,200));
        JPanel pnlNordeste = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        pnlNordeste.setBackground(Color.red);
        pnlNordeste.setPreferredSize(new Dimension(150,200));
        JPanel pnlSudeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        pnlSudeste.setBackground(Color.BLUE);
        pnlSudeste.setPreferredSize(new Dimension(150,200));
        JPanel pnlSudoeste = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        pnlSudoeste.setBackground(Color.MAGENTA);
        pnlSudoeste.setPreferredSize(new Dimension(150,200));
        pnlNoroeste.add(lblAluno,BorderLayout.EAST);
        add(pnlNoroeste);
        add(pnlNordeste);
        add(pnlSudoeste);
        add(pnlSudeste);
      
        
    }
    
    
    
}
