package dcc171.ufjf.br;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private static ArrayList<Aluno>     listaAlunos;
    private static ArrayList<Professor> listaProf;
    private static ArrayList<Aula>      listaAula;
    private static ArrayList<Curso>     listaCurso;   

    public Escola() {
        listaAlunos = new ArrayList<>();
        listaProf = new ArrayList<>();
        listaAula = new ArrayList<>();
        listaCurso = new ArrayList<>();
    }
    
    public static List<Aluno> getListaAlunos() {
       
        return Escola.listaAlunos;
    }

    public static void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        Escola.listaAlunos = listaAlunos;
    }

    public static List<Professor> getListaProf() {
        return listaProf;
    }

    public static void setListaProf(ArrayList<Professor> listaProf) {
        Escola.listaProf = listaProf;
    }

    public static List<Aula> getListaAula() {
        return listaAula;
    }

    public static void setListaAula(ArrayList<Aula> listaAula) {
        Escola.listaAula = listaAula;
    }

    public static List<Curso> getListaCurso() {
        return listaCurso;
    }

    public static void setListaCurso(ArrayList<Curso> listaCurso) {
        Escola.listaCurso = listaCurso;
    }
    
    public void adicionaAluno (Aluno a)
    {
        System.out.println("Tamanho: " +Escola.listaAlunos.size());
        Escola.listaAlunos.add(a);
        System.out.println("Tamanho: " +Escola.listaAlunos.size());
    }
    
    public void adicionaProfessor (Professor p)
    {
        Escola.listaProf.add(p);
    }
    
    public void adicionaAula (Aula a)
    {
        Escola.listaAula.add(a);
    }
    
    public void adicionaCurso (Curso c)
    {
        Escola.listaCurso.add(c);
    }

    @Override
    public String toString() {
        try {
        String alunos = listaAlunos.get(0).toString();
        return alunos;
        }
        catch (Exception e)
        {
            System.out.println("Problema: " + e);
        }
        return null;
    }
    
    
    
}
