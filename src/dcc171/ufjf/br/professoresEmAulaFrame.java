package dcc171.ufjf.br;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class professoresEmAulaFrame extends JFrame {
    private final DefaultListModel<Aula> modeloAula = new DefaultListModel<Aula>();
    private final JList<Aula> lstAula = new JList<>();

    public professoresEmAulaFrame(ArrayList<Aula> aulas) {
        super("Aulas que o professor leciona");
        new FlowLayout(SwingConstants.LEFT);
        JPanel pnlMain = new JPanel(new BorderLayout());
        JScrollPane pnlMainFilho = new JScrollPane(lstAula);
        pnlMain.add(pnlMainFilho);
        add(pnlMain);       
        for (Aula aula : aulas) {
            modeloAula.addElement(aula);
        }
        lstAula.setModel(modeloAula);
    }
    
    
}
