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
public class Curso {
    private String nome;
    private String codigo;
    private List<Estudante> matriculados;

    public Curso() {
        this.nome = "";
        this.codigo ="";
        this.matriculados = new ArrayList<>();
    }

    public Curso(String nome, String codigo, List<Estudante> matriculados) {
        this.nome = nome;
        this.codigo = codigo;
        this.matriculados = matriculados;
    }
    public void addEstudante(Estudante estudante){
        matriculados.add(estudante);
    }
    public void removerEstudante(Estudante estudante){
        matriculados.remove(estudante);
    }
    public int numeroDeMatriculados(){
        return matriculados.size();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudante> getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(List<Estudante> matriculados) {
        this.matriculados = matriculados;
    }
    
    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", codigo=" + codigo + ", matriculados=" + matriculados + '}';
    }
    
    
}
