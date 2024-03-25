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
public class Projeto {
    private String nome;
    private int id;
    private List<Funcionario> funcionarios;
    private String descricao;

    public Projeto() {
        this.nome = "";
        this.id = -1;
        this.funcionarios = new ArrayList<>();
        this.descricao = "";
    }
    
    public Projeto(String nome, int id, String descricao) {
        this.nome = nome;
        this.id = id;
        this.funcionarios = new ArrayList<>();
        this.descricao = descricao;
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void removeFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Projeto{" + "nome=" + nome + ", id=" + id + ", descricao=" + descricao + '}';
    }
    
    
    
}
