/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Disciplina {
    private String nome;
    private int semestre;
    private String horario;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String nome, int semestre, String horario) {
        this.nome = nome;
        this.semestre = semestre;
        this.horario = horario;
    }
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public Disciplina() {
        this.nome = "";
        this.semestre = 0;
        this.horario = "";
    }
    public Disciplina(Disciplina copia){
        this.nome = copia.getNome();
        this.semestre = copia.getSemestre();
        this.horario = copia.getHorario();
    }
    public void copiar(Disciplina copia){
        this.nome = copia.getNome();
        this.semestre = copia.getSemestre();
        this.horario = copia.getHorario();
    }
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe:");
        System.out.println("Nome:");
        this.nome = leitor.next();
        System.out.println("Semestre:");
        this.semestre = leitor.nextInt();
        System.out.println("Horario:");
        this.horario = leitor.next();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public String getHorario() {
        return horario;
    }

    public String getNome() {
        return nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "nome:"+this.nome+"/"+"Semestre:"+this.semestre+"/"+"Horario:"+this.horario;
    }

    
    
    
    
}
