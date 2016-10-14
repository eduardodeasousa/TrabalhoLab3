package dcc171.ufjf.br;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private static ArrayList<Aluno>     listaAlunos;
    private static ArrayList<Professor> listaProf;
    private static ArrayList<Aula>      listaAula; 

    public Escola() {
        listaAlunos = new ArrayList<>();
        listaProf = new ArrayList<>();
        listaAula = new ArrayList<>();
    }
    
    public static ArrayList<Aluno> getListaAlunos() {
       
        return Escola.listaAlunos;
    }

    public static void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        Escola.listaAlunos = listaAlunos;
    }

    public static ArrayList<Professor> getListaProf() {
        return listaProf;
    }

    public static void setListaProf(ArrayList<Professor> listaProf) {
        Escola.listaProf = listaProf;
    }

    public static ArrayList<Aula> getListaAula() {
        return listaAula;
    }

    public static void setListaAula(ArrayList<Aula> listaAula) {
        Escola.listaAula = listaAula;
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
    
}
