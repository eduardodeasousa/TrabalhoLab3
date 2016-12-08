package dcc171.ufjf.br;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class MainFrame extends JFrame {

    private final JTextField txtAluno = new JTextField("Nome", 34);
    private final JTextField txtEmail = new JTextField("Email", 34);
    private final JTextField txtTelefone = new JTextField("Telefone", 34);

    private final JButton addAluno = new JButton("+");
    private final JButton remAluno = new JButton("-");

    private final DefaultListModel<Aluno> modeloAlunos = new DefaultListModel<>();
    private final JList<Aluno> lstAlunos = new JList<>();

    private final JButton addProf = new JButton("+");
    private final JButton remProf = new JButton("-");
    private final JButton moreProf = new JButton("Aulas que leciona");
    private final JTextField txtProf = new JTextField("Nome", 34);
    private final JTextField txtEmailP = new JTextField("Email", 34);
    private final JTextField txtTelefoneP = new JTextField("Telefone", 34);
    private final DefaultListModel<Professor> modeloProf = new DefaultListModel<>();
    private final JList<Professor> lstProf = new JList<>();

    private final JButton btnAddAula = new JButton("+Aluno");
    private final JButton btnRemAula = new JButton("-Aula");
    private final JButton btnMoreAula = new JButton("Alunos matriculados");
    private final JTextField txtMaxAlunos = new JTextField("Max Alunos", 34);
    private final JTextField txtDesc = new JTextField("Descrição", 34);

    private final JTextField txtTotalHoras = new JTextField("Total Horas", 34);
    private final JTextField txtInscIni = new JTextField("Inicio da Inscricao", 34);
    private final JTextField txtInscFim = new JTextField("Fim da da inscrição", 34);
    private final JTextField txtAulaIni = new JTextField("Horario Inicial da Aula", 34);

    private final DefaultListModel<Aula> modeloAula = new DefaultListModel<>();
    private final JList<Aula> lstAula = new JList<>();
    private final JButton btnCriaAula = new JButton("+Aula");

    public MainFrame() {
        super("Escola Falsa para Trabalho 1 - Jose Eduardo");

        setLayout(new FlowLayout(SwingConstants.LEFT));
        JPanel pnlNoroeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JScrollPane pnlNoroesteFilho = new JScrollPane(lstAlunos);
        pnlNoroesteFilho.setPreferredSize(new Dimension(380, 190));
        pnlNoroeste.setPreferredSize(new Dimension(400, 300));
        JPanel pnlNordeste = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JScrollPane pnlNordesteFilho = new JScrollPane(lstProf);
        pnlNordesteFilho.setPreferredSize(new Dimension(380, 190));
        pnlNordeste.setPreferredSize(new Dimension(400, 300));
        JPanel pnlSul = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        pnlSul.setPreferredSize(new Dimension(800, 320));
        JScrollPane pnlSulFilho = new JScrollPane(lstAula);

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

        addAulaListener listenerAddAula = new addAulaListener();
        btnCriaAula.addActionListener(listenerAddAula);

        remAulaListener listenerRemAula = new remAulaListener();
        btnRemAula.addActionListener(listenerRemAula);

        whoAulaListener listenerWhoAula = new whoAulaListener();
        btnMoreAula.addActionListener(listenerWhoAula);

        getAulasDeProf listenerAulaProf = new getAulasDeProf();
        moreProf.addActionListener(listenerAulaProf);

        pnlNoroeste.setBorder(new TitledBorder("Aluno"));
        pnlNoroeste.add(txtAluno);
        pnlNoroeste.add(txtEmail);
        pnlNoroeste.add(txtTelefone);
        pnlNoroeste.add(pnlNoroesteFilho);
        pnlNoroeste.add(addAluno);
        pnlNoroeste.add(remAluno);

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
        pnlSul.add(btnAddAula);
        pnlSul.add(btnRemAula);
        pnlSul.add(btnCriaAula);
        pnlSul.add(btnMoreAula);
        pnlSulFilho.setPreferredSize(new Dimension(760, 200));
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
            Aluno novoAluno = new Aluno(txtAluno.getText(), txtEmail.getText(), txtTelefone.getText());
            ArrayList<Aluno> listaAluno = (ArrayList<Aluno>) Escola.getListaAlunos();
            listaAluno.add(novoAluno);
            Escola.setListaAlunos(listaAluno);
            modeloAlunos.removeAllElements();
            for (Aluno aluno : Escola.getListaAlunos()) {
                modeloAlunos.addElement(aluno);
            }
            lstAlunos.setModel(modeloAlunos);
        }
    }

    private class remAlunoListener implements ActionListener {

        public remAlunoListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (lstAlunos.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "Selecione um aluno", "Problema de seleção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                ArrayList<Aluno> listaTemp = (ArrayList<Aluno>) Escola.getListaAlunos();
                listaTemp.remove(lstAlunos.getSelectedValue());
                Escola.setListaAlunos(listaTemp);
                modeloAlunos.remove(lstAlunos.getSelectedIndex());
            }
        }
    }

    private class addProfListener implements ActionListener {

        public addProfListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Professor novoProfessor = new Professor(txtProf.getText(), txtEmailP.getText(), txtTelefoneP.getText());
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

    private class remProfListener implements ActionListener {

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

    private class addAlunoAulaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (lstAlunos.getSelectedValue() != null && lstAula.getSelectedValue() != null) {
                SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
                ArrayList<Aula> listaTemp = Escola.getListaAula();
                Aula aulaTemp = lstAula.getSelectedValue();
                listaTemp.remove(lstAula.getSelectedValue());
                ArrayList<Aluno> listaAlunos = aulaTemp.getAlunos();
                Aluno debuga = lstAlunos.getSelectedValue();
                if (!lstAula.getSelectedValue().getAlunos().contains(lstAlunos.getSelectedValue())) {
                    listaAlunos.add(lstAlunos.getSelectedValue());
                    aulaTemp.setAlunos(listaAlunos);
                    Calendar cal = Calendar.getInstance();
                    if (aulaTemp.getHorario_fim_insc().before(cal.getTime())) 
                    {
                        return;
                    }
                    if (aulaTemp.getHorario_fim_insc().after(cal.getTime())) {
                        if (aulaTemp.getAlunos().size() < aulaTemp.getMax_alunos()) {
                            listaTemp.add(aulaTemp);
                            Escola.setListaAula(listaTemp);
                            modeloAula.removeAllElements();
                            for (Aula aula : Escola.getListaAula()) {
                                modeloAula.addElement(aula);
                            }
                            lstAula.setModel(modeloAula);
                        } else {
                            JOptionPane.showMessageDialog(null, "Numero máximo de alunos atingido", "Turma cheia", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Horário não permitido. ", "Problema de seleção", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um aluno e uma aula.", "Problema de seleção", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private class addAulaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (lstProf.getSelectedValue() != null) {
                ArrayList<Aula> listaAula = Escola.getListaAula();
                Calendar cal = Calendar.getInstance();
                Calendar cal1 = Calendar.getInstance();
                Calendar cal2 = Calendar.getInstance();
                Calendar cal3 = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                try {
                    cal.setTime(sdf.parse(txtInscIni.getText()));
                    cal1.setTime(sdf.parse(txtInscFim.getText()));
                    cal2.setTime(sdf.parse(txtAulaIni.getText()));
                    Aula novaAula = new Aula(cal, cal1, cal2, lstProf.getSelectedValue(), txtDesc.getText(), Integer.parseInt(txtTotalHoras.getText()), Integer.parseInt(txtMaxAlunos.getText()));
                    listaAula.add(novaAula);
                    Escola.setListaAula(listaAula);
                    modeloAula.removeAllElements();
                    for (Aula aula : Escola.getListaAula()) {
                        modeloAula.addElement(aula);
                    }
                    lstAula.setModel(modeloAula);
                } catch (ParseException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um professor.", "Problema de seleção", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private class remAulaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (lstAula.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "Selecione uma aula.", "Problema de seleção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                ArrayList<Aula> listAula = Escola.getListaAula();
                listAula.remove(lstAula.getSelectedValue());
                Escola.setListaAula(listAula);
                modeloAula.remove(lstAula.getSelectedIndex());
            }
        }
    }

    private class whoAulaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Aula aulaTemp = lstAula.getSelectedValue();
            if (aulaTemp != null) {
                ArrayList<Aluno> alunosTemp = aulaTemp.getAlunos();
                alunosMatriculadosFrame novaJanela = new alunosMatriculadosFrame(alunosTemp);
                novaJanela.setSize(500, 660);
                novaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                novaJanela.setLocationRelativeTo(null);
                novaJanela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma aula.", "Problema de seleção", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private class getAulasDeProf implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Professor profSelec = lstProf.getSelectedValue();
            ArrayList<Aula> listAulas = Escola.getListaAula();
            ArrayList<Aula> contido = new ArrayList<>();
            for (Aula aula : listAulas) {
                if (aula.getProf().equals(profSelec)) {
                    contido.add(aula);
                }
            }
            professoresEmAulaFrame janela = new professoresEmAulaFrame(contido);
            janela.setSize(500, 660);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setLocationRelativeTo(null);
            janela.setVisible(true);

        }
    }
}
