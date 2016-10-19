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

    public Aula(Calendar horario_ini_insc, Calendar horario_start, Calendar horario_fim_insc, Professor prof, String desc, Integer total_horas, int max_alunos) {
        this.alunos = new ArrayList<Aluno>();
        this.horario_ini_insc = horario_ini_insc;
        this.horario_start = horario_start;
        this.horario_end = horario_start;
        this.horario_end.add(Calendar.HOUR_OF_DAY, total_horas);
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

    public Calendar getHorario_ini_insc() {
        return horario_ini_insc;
    }

    public void setHorario_ini_insc(Calendar horario_ini_insc) {
        this.horario_ini_insc = horario_ini_insc;
    }

    public Calendar getHorario_start() {
        return horario_start;
    }

    public void setHorario_start(Calendar horario_start) {
        this.horario_start = horario_start;
    }

    public Calendar getHorario_end() {
        return horario_end;
    }

    public void setHorario_end(Calendar horario_end) {
        this.horario_end = horario_end;
    }

    public Calendar getHorario_fim_insc() {
        return horario_fim_insc;
    }

    public void setHorario_fim_insc(Calendar horario_fim_insc) {
        this.horario_fim_insc = horario_fim_insc;
    }

    public int getMax_alunos() {
        return max_alunos;
    }

    public void setMax_alunos(int max_alunos) {
        this.max_alunos = max_alunos;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }
    
    
    
}
