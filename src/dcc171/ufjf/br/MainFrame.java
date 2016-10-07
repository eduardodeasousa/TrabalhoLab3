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
    
    
    private final JButton addProf = new JButton("+");
    private final JButton remProf = new JButton("-");
    private final JButton moreProf = new JButton("?"); 
    private final JTextField txtProf = new JTextField("Nome", 34);
    private final JTextField txtEmailP = new JTextField("Email",34);
    private final JTextField txtTelefoneP = new JTextField("Telefone",34);
    private final DefaultListModel<Professor> modeloProf = new DefaultListModel<Professor>();
    private final JList<Professor> lstProf = new JList<>();

    public MainFrame() {
        super("Escola Falsa para Trabalho 1 - Jose Eduardo");
    
        setLayout(new FlowLayout(SwingConstants.LEFT));
        JPanel pnlNoroeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JScrollPane pnlNoroesteFilho = new JScrollPane(lstAlunos);
        pnlNoroesteFilho.setPreferredSize(new Dimension(380,190));
        pnlNoroeste.setPreferredSize(new Dimension(400,300));
      //  pnlNoroeste.setBackground(Color.BLACK);
        JPanel pnlNordeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JScrollPane pnlNordesteFilho = new JScrollPane(lstProf);
        pnlNordesteFilho.setPreferredSize(new Dimension(380,190));
        pnlNordeste.setPreferredSize(new Dimension(400,300));
       //pnlNordeste.setBackground(Color.red);
        JPanel pnlSudeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        pnlSudeste.setPreferredSize(new Dimension(400,300));
       // pnlSudeste.setBackground(Color.BLUE);
        JPanel pnlSudoeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
       // pnlSudoeste.setBackground(Color.MAGENTA);
        pnlSudoeste.setPreferredSize(new Dimension(400,300));
        
        pnlNoroeste.setBorder(new TitledBorder("Aluno"));
        pnlNoroeste.add(txtAluno);
        pnlNoroeste.add(txtEmail);
        pnlNoroeste.add(txtTelefone);
        pnlNoroeste.add(pnlNoroesteFilho);
        pnlNoroeste.add(addAluno);
        pnlNoroeste.add(remAluno);
        pnlNoroeste.add(moreAluno);
        
        pnlNordeste.setBorder(new TitledBorder("Professor"));
        pnlNordeste.add(txtProf);
        pnlNordeste.add(txtEmailP);
        pnlNordeste.add(txtTelefoneP);
        pnlNordeste.add(pnlNordesteFilho);
        pnlNordeste.add(addProf);
        pnlNordeste.add(remProf);
        pnlNordeste.add(moreProf);
        
        add(pnlNoroeste);
        add(pnlNordeste);
        add(pnlSudoeste);
        add(pnlSudeste);
        
        for (Aluno aluno : Escola.getListaAlunos()) {
            modeloAlunos.addElement(aluno);
        }
        
        lstAlunos.setModel(modeloAlunos);
        
        for (Professor professor : Escola.getListaProf()) {
            modeloProf.addElement(professor);
        }
        
        lstProf.setModel(modeloProf);
      
        
    }
    
    
    
}
