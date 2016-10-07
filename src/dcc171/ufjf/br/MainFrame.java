package dcc171.ufjf.br;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;


public class MainFrame extends JFrame {
    
    private final JLabel lblProfessor = new JLabel("Professor");
    private final JLabel lblCurso = new JLabel("Curso");
    private final JLabel lblAula = new JLabel("Aula");
    private final JTextField txtAluno = new JTextField("Nome", 34);
    private final JTextField txtEmail = new JTextField("Email",34);
    private final JTextField txtTelefone = new JTextField("Telefone",34);
    private final JButton addAluno = new JButton("+");
    private final JButton remAluno = new JButton("-");
    private final JButton moreAluno = new JButton("?"); 
    private final DefaultListModel<Aluno> modeloAlunos = new DefaultListModel<Aluno>();
    private final JList<Aluno> lstAlunos = new JList<>();
   // private final JList<String>lstAlunos1 = new JList<String>((String[]) Escola.getLista_alunos().toArray());
 

    public MainFrame() {
        super("Escola Falsa para Trabalho 1 - Jose Eduardo");
    
        setLayout(new FlowLayout(SwingConstants.LEFT));
        JPanel pnlNoroeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JScrollPane pnlNoroesteFilho = new JScrollPane(lstAlunos);
        pnlNoroesteFilho.setPreferredSize(new Dimension(380,200));
      //  pnlNoroeste.setBackground(Color.BLACK);
        pnlNoroeste.setPreferredSize(new Dimension(400,300));
        JPanel pnlNordeste = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
       // pnlNordeste.setBackground(Color.red);
        pnlNordeste.setPreferredSize(new Dimension(400,300));
        JPanel pnlSudeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
       // pnlSudeste.setBackground(Color.BLUE);
        pnlSudeste.setPreferredSize(new Dimension(400,300));
        JPanel pnlSudoeste = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
       // pnlSudoeste.setBackground(Color.MAGENTA);
        pnlSudoeste.setPreferredSize(new Dimension(400,300));
        
        pnlNoroeste.setBorder(new TitledBorder("Aluno"));
        pnlNoroeste.add(txtAluno);
        pnlNoroeste.add(txtEmail);
        pnlNoroeste.add(txtTelefone);
        //pnlNoroesteFilho.add(lstAlunos);
        pnlNoroeste.add(pnlNoroesteFilho);
        pnlNoroeste.add(addAluno);
        pnlNoroeste.add(remAluno);
        pnlNoroeste.add(moreAluno);
        
        add(pnlNoroeste);
        add(pnlNordeste);
        add(pnlSudoeste);
        add(pnlSudeste);
        
        for (Aluno aluno : Escola.getListaAlunos()) {
            modeloAlunos.addElement(aluno);
        }
        lstAlunos.setModel(modeloAlunos);
      
        
    }
    
    
    
}
