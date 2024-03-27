/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class Funcionario {
    private String nome;
    private int id;
    private List<Projeto> projetos;

    public Funcionario() {
        this.nome = "";
        this.id = -1;
        this.projetos = new ArrayList<>();
    }

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public void addProjeto(Projeto projeto){
        this.projetos.add(projeto);
    }
    public void removeProjeto(Projeto projeto){
        this.projetos.remove(projeto);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
    public int numerosDeProjetos(){
        return projetos.size();
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", id=" + '}';
    }
    

    
    
    
}
