package dcc171.ufjf.br;

import java.util.List;

public class Escola {

    private static List<Aluno>     lista_alunos;
    private static List<Professor> lista_prof;
    private static List<Aula>      lista_aula;
    private static List<Curso>     lista_curso;   

    public static List<Aluno> getLista_alunos() {
        return lista_alunos;
    }

    public static void setLista_alunos(List<Aluno> lista_alunos) {
        Escola.lista_alunos = lista_alunos;
    }

    public static List<Professor> getLista_prof() {
        return lista_prof;
    }

    public static void setLista_prof(List<Professor> lista_prof) {
        Escola.lista_prof = lista_prof;
    }

    public static List<Aula> getLista_aula() {
        return lista_aula;
    }

    public static void setLista_aula(List<Aula> lista_aula) {
        Escola.lista_aula = lista_aula;
    }

    public static List<Curso> getLista_curso() {
        return lista_curso;
    }

    public static void setLista_curso(List<Curso> lista_curso) {
        Escola.lista_curso = lista_curso;
    }
    
    public void adicionaAluno (Aluno a)
    {
        lista_alunos.add(a);
    }
    
    public void adicionaProfessor (Professor p)
    {
        this.lista_prof.add(p);
    }
    
    public void adicionaAula (Aula a)
    {
        this.lista_aula.add(a);
    }
    
    public void adicionaCurso (Curso c)
    {
        this.lista_curso.add(c);
    }

    @Override
    public String toString() {
        String alunos = lista_alunos.get(0).toString();
        return alunos;
    }
    
    
    
}
