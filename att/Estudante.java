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
public class Estudante {
    private String nome;
    private String numeroMatricula;
    private List<Curso> cursos;

    public Estudante() {
        this.nome ="";
        this.numeroMatricula="";
        cursos = new ArrayList<>();
    }

    public Estudante(String nome, String numeroMatricula, List<Curso> cursos) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.cursos = cursos;
    }
    public void cancelarMatricula(Curso curso){
        cursos.remove(curso);
    }
    public void matricular(Curso curso){
        cursos.add(curso);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ", numeroMatricula=" + numeroMatricula + ", cursos=" + cursos + '}';
    }
    
    
}
