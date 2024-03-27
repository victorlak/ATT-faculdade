/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class Universidade {
    private String nome;
    private List<Estudante> matriculados;
    private List<Curso> cursosDisponiveis;

    public Universidade() {
        this.nome ="";
        this.cursosDisponiveis = new ArrayList<>();
        this.matriculados = new ArrayList<>();
    }

    public Universidade(String nome, List<Estudante> matriculados, List<Curso> cursosDisponiveis) {
        this.nome = nome;
        this.matriculados = matriculados;
        this.cursosDisponiveis = cursosDisponiveis;
    }
    public int alunosMatriculados(){
        return matriculados.size();
    }
    public Curso cursoComMaisAlunos(){
        int controle = 0;
        Curso cursoComMaisAlunos = null;
        for(Curso c : cursosDisponiveis){
            if(c.numeroDeMatriculados() > controle){
                controle = c.numeroDeMatriculados();
                cursoComMaisAlunos = c;
            }
        }
        return cursoComMaisAlunos;
    }
    public List<Curso> cursosMaisMatriculados(){
        List<Curso> aux = cursosDisponiveis;
        List<Curso> topCincoCursos = new ArrayList<>();
        Curso curso = new Curso();
        int controle = 0;
        for(int i = 0; i < 5; i++){
            for(Curso c : aux){
                if(c.numeroDeMatriculados() > controle){
                    controle = c.numeroDeMatriculados();
                    curso = c;
                }    
            }
            controle = 0;
            topCincoCursos.add(curso);
            aux.remove(curso);
            
        }
        return topCincoCursos;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estudante> getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(List<Estudante> matriculados) {
        this.matriculados = matriculados;
    }

    public List<Curso> getCursosDisponiveis() {
        return cursosDisponiveis;
    }

    public void setCursosDisponiveis(List<Curso> cursosDisponiveis) {
        this.cursosDisponiveis = cursosDisponiveis;
    }
    
    
}
