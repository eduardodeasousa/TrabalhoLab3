package dcc171.ufjf.br;

import java.util.GregorianCalendar;
import java.util.List;

public class Aula {

    private List<Aluno> alunos;
    private GregorianCalendar horario_ini_insc;
    private GregorianCalendar horario_start;
    private GregorianCalendar horario_end;
    private GregorianCalendar horario_fim_insc;
    private Professor prof;
    private String desc;
    private float total_horas;
    private int max_alunos;

    public Aula() {
    }

    public Aula(List<Aluno> alunos, GregorianCalendar horario_ini_insc, GregorianCalendar horario_start, GregorianCalendar horario_end, GregorianCalendar horario_fim_insc, Professor prof, String desc, float total_horas, int max_alunos) {
        this.alunos = alunos;
        this.horario_ini_insc = horario_ini_insc;
        this.horario_start = horario_start;
        this.horario_end = horario_end;
        this.horario_fim_insc = horario_fim_insc;
        this.prof = prof;
        this.desc = desc;
        this.total_horas = total_horas;   
        this.max_alunos = max_alunos;
    }

    @Override
    public String toString() {
        return  "Alunos: " + alunos.size() + " , Horario Ini Insc" + horario_ini_insc + "Horario Final Insc: " + horario_fim_insc + " , Horario Inicio=" + horario_start + " , Horario Final: " + horario_end + "Professor: " + prof + ", Descrição: " + desc + ", Total Horas: " + total_horas + ", Maximo Alunos: " + max_alunos;
    }
    
    
    
}
