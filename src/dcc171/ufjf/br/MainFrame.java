package dcc171.ufjf.br;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.ArrayList;
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
    
    private final JButton btnAddAula = new JButton("+Aluno");
    private final JButton btnRemAula = new JButton("-");
    private final JButton btnMoreAula = new JButton("?");
    private final JTextField txtMaxAlunos = new JTextField("Max Alunos",34);
    private final JTextField txtDesc = new JTextField("Descrição",34);
    
    private final JTextField txtTotalHoras = new JTextField("Total Horas",34);
    private final JTextField txtInscIni = new JTextField("Inicio da Inscricao",34);
    private final JTextField txtInscFim = new JTextField("Fima da inscrição",34);
    private final JTextField txtAulaFim = new JTextField("Horario Final da Aula",34);
    private final JTextField txtAulaIni = new JTextField("Horario Inicial da Aula",34);
    
    private final DefaultListModel<Aula> modeloAula = new DefaultListModel<Aula>();
    private final JList<Aula> lstAula = new JList<>();

    
    
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
        JPanel pnlSul = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        pnlSul.setPreferredSize(new Dimension(800,300));
        JScrollPane pnlSulFilho = new JScrollPane(lstAula);
      //  pnlSudeste.setBackground(Color.BLUE);
    //    JPanel pnlSudoeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        addAlunoListener listenerAluno = new addAlunoListener();
        addAluno.addActionListener(listenerAluno);
        
        remAlunoListener listenerAlunoRem = new remAlunoListener();
        remAluno.addActionListener(listenerAlunoRem);
        
        addProfListener listenerProf = new addProfListener();
        addProf.addActionListener(listenerProf);
        
        remProfListener listenerProfRem = new remProfListener();
        remProf.addActionListener(listenerProfRem);
        
        addAlunoAulaListener listenerAddAlunoAula = new addAlunoAulaListener();
        btnAddAula.addActionListener(listenerAddAlunoAula);
        
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
        
        pnlSul.add(txtDesc);
        pnlSul.add(txtMaxAlunos);
        pnlSul.add(txtTotalHoras);
        pnlSul.add(txtInscIni);
        pnlSul.add(txtInscFim);
        pnlSul.add(txtAulaIni);
        pnlSul.add(txtAulaFim);
        pnlSul.add(btnAddAula);
        pnlSul.add(btnRemAula);
        pnlSulFilho.setPreferredSize(new Dimension(760,200));
        pnlSul.add(pnlSulFilho);
 
        
        pnlSul.setBorder(new TitledBorder("Aulas"));
        
        add(pnlNoroeste);
        add(pnlNordeste);
        add(pnlSul);
        
        for (Aluno aluno : Escola.getListaAlunos()) {
            modeloAlunos.addElement(aluno);
        }
        
        lstAlunos.setModel(modeloAlunos);
        
        for (Professor professor : Escola.getListaProf()) {
            modeloProf.addElement(professor);
        }
        
        lstProf.setModel(modeloProf);
        
        for (Aula aula : Escola.getListaAula()) {
            modeloAula.addElement(aula);
        }
        
        lstAula.setModel(modeloAula);
      
    }
    
    private class addAlunoListener implements ActionListener {

        public addAlunoListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            Aluno novoAluno = new Aluno(txtAluno.getText(),txtEmail.getText(),txtTelefone.getText());
            ArrayList<Aluno> listaAluno = (ArrayList<Aluno>) Escola.getListaAlunos();
            listaAluno.add(novoAluno);
            Escola.setListaAlunos(listaAluno);
            modeloAlunos.removeAllElements();
            for (Aluno aluno : Escola.getListaAlunos())
            {
            modeloAlunos.addElement(aluno);
            }
            lstAlunos.setModel(modeloAlunos);
            }
    }
    
    private class remAlunoListener implements ActionListener
    {

        public remAlunoListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<Aluno> listaTemp = (ArrayList<Aluno>) Escola.getListaAlunos();
            listaTemp.remove(lstAlunos.getSelectedValue());
            Escola.setListaAlunos(listaTemp);
            modeloAlunos.remove(lstAlunos.getSelectedIndex());
        }
    }
    
    private class addProfListener implements ActionListener {

        public addProfListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Professor novoProfessor = new Professor(txtProf.getText(),txtEmailP.getText(),txtTelefoneP.getText());
            ArrayList<Professor> listaProf = Escola.getListaProf();
            listaProf.add(novoProfessor);
            Escola.setListaProf(listaProf);
            modeloProf.removeAllElements();
            for (Professor professor : Escola.getListaProf()) {
            modeloProf.addElement(professor);
            }
            lstProf.setModel(modeloProf);
            
        }
        
    }
    
    private class remProfListener implements ActionListener{

        public remProfListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
          ArrayList<Professor> listaTemp = Escola.getListaProf();
          listaTemp.remove(lstProf.getSelectedValue());
          Escola.setListaProf(listaTemp);
          modeloProf.remove(lstProf.getSelectedIndex());
    
        }
        
    }
    
    private class addAlunoAulaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
           ArrayList<Aula> listaTemp = Escola.getListaAula();
           Aula aulaTemp = lstAula.getSelectedValue();
           listaTemp.remove(lstAula.getSelectedValue());
           ArrayList<Aluno> listaAlunos = aulaTemp.getAlunos();
           Aluno debuga = lstAlunos.getSelectedValue();
           if (!lstAula.getSelectedValue().getAlunos().contains(lstAlunos.getSelectedValue()))
           {
           listaAlunos.add(lstAlunos.getSelectedValue());
           aulaTemp.setAlunos(listaAlunos);
           listaTemp.add(aulaTemp);
           Escola.setListaAula(listaTemp);
           
           modeloAula.removeAllElements();
           for (Aula aula : Escola.getListaAula()) 
            {
                modeloAula.addElement(aula);
            }
           lstAula.setModel(modeloAula);
           }
        }
    }
}
