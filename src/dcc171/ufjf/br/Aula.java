package dcc171.ufjf.br;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Aula {

    private List<Aluno> alunos;
    private Date horario_ini_insc;
    private Date horario_start;
    private Date horario_end;
    private Date horario_fim_insc;
    private Professor prof;
    private String desc;
    private float total_horas;
    private int max_alunos;
    private SimpleDateFormat df;

    public Aula() {
    }

    public Aula(List<Aluno> alunos, Date horario_ini_insc, Date horario_start, Date horario_end, Date horario_fim_insc, Professor prof, String desc, float total_horas, int max_alunos) {
        this.alunos = alunos;
        this.horario_ini_insc = horario_ini_insc;
        this.horario_start = horario_start;
        this.horario_end = horario_end;
        this.horario_fim_insc = horario_fim_insc;
        this.prof = prof;
        this.desc = desc;
        this.total_horas = total_horas;
        this.max_alunos = max_alunos;
        this.df = new SimpleDateFormat("hh:mm");
    }
    @Override
    public String toString() {
        return  "Alunos: " + alunos.size() + " , Horario Ini Insc" + horario_ini_insc + "Horario Final Insc: " + horario_fim_insc + " , Horario Inicio=" + horario_start + " , Horario Final: " + horario_end + "Professor: " + prof + ", Descrição: " + desc + ", Total Horas: " + total_horas + ", Maximo Alunos: " + max_alunos;
    }
    
    
    
}
