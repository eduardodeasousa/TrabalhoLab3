package dcc171.ufjf.br;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Aula {

    private ArrayList<Aluno> alunos;
    private Calendar horario_ini_insc;
    private Calendar horario_start;
    private Calendar horario_end;
    private Calendar horario_fim_insc;
    private Professor prof;
    private String desc;
    private float total_horas;
    private int max_alunos;
    private SimpleDateFormat df;

    public Aula() {
    }

    public Aula(Calendar horario_ini_insc, Calendar horario_start, Calendar horario_end, Calendar horario_fim_insc, Professor prof, String desc, float total_horas, int max_alunos) {
        this.alunos = new ArrayList<Aluno>();
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
        return  "Alunos: " + this.alunos.size() +" ,Max Alunos: " + max_alunos + " ,Horario Ini Insc: " + horario_ini_insc.get(Calendar.HOUR_OF_DAY)+":"+horario_ini_insc.get(Calendar.MINUTE)+  " ,Horario Final Insc: " + horario_fim_insc.get(Calendar.HOUR_OF_DAY)+":" + horario_fim_insc.get(Calendar.MINUTE) + " ,Horario Inicio: " + horario_start.get(Calendar.HOUR)+ ":" + horario_start.get(Calendar.MINUTE) + " ,Horario Final: " + horario_end.get(Calendar.HOUR)+":"+horario_end.get(Calendar.MINUTE) + " ,Professor: " + prof + " ,Descrição: " + desc + " ,Total Horas: " + total_horas + ", Maximo Alunos: " + max_alunos;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
}
