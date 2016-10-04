package dcc171.ufjf.br;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private static ArrayList<Aluno>     lista_alunos;
    private static ArrayList<Professor> lista_prof;
    private static ArrayList<Aula>      lista_aula;
    private static ArrayList<Curso>     lista_curso;   

    public Escola() {
        lista_alunos = new ArrayList<>();
        lista_prof = new ArrayList<>();
        lista_aula = new ArrayList<>();
        lista_curso = new ArrayList<>();
    }
    
    public static List<Aluno> getLista_alunos() {
        return lista_alunos;
    }

    public static void setLista_alunos(ArrayList<Aluno> lista_alunos) {
        Escola.lista_alunos = lista_alunos;
    }

    public static List<Professor> getLista_prof() {
        return lista_prof;
    }

    public static void setLista_prof(ArrayList<Professor> lista_prof) {
        Escola.lista_prof = lista_prof;
    }

    public static List<Aula> getLista_aula() {
        return lista_aula;
    }

    public static void setLista_aula(ArrayList<Aula> lista_aula) {
        Escola.lista_aula = lista_aula;
    }

    public static List<Curso> getLista_curso() {
        return lista_curso;
    }

    public static void setLista_curso(ArrayList<Curso> lista_curso) {
        Escola.lista_curso = lista_curso;
    }
    
    public void adicionaAluno (Aluno a)
    {
        lista_alunos.add(a);
    }
    
    public void adicionaProfessor (Professor p)
    {
        Escola.lista_prof.add(p);
    }
    
    public void adicionaAula (Aula a)
    {
        Escola.lista_aula.add(a);
    }
    
    public void adicionaCurso (Curso c)
    {
        Escola.lista_curso.add(c);
    }

    @Override
    public String toString() {
        try {
        String alunos = lista_alunos.get(0).toString();
        return alunos;
        }
        catch (Exception e)
        {
            System.out.println("Problema: " + e);
        }
        return null;
    }
    
    
    
}
