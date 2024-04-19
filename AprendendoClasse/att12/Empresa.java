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
public class Empresa {
    
    private String nome;
    private List<Funcionario> funcionarios;
    private List<Projeto> projetos;

    public Empresa() {
        funcionarios = new ArrayList<>();
        projetos = new ArrayList<>();
    }

    public Empresa(String nome, List<Funcionario> funcionarios, List<Projeto> projetos) {
        this.nome = nome;
        this.funcionarios = funcionarios;
        this.projetos = projetos;
    }
    public void addProjeto(Projeto projeto){
        projetos.add(projeto);
    }
    public void removeProjeto(Projeto projeto){
        projetos.remove(projeto);
    }
    public Funcionario maisProdutivo(){
        int controle = 0;
        Funcionario funcionarioMaisProdutivo = null;
        for(Funcionario f : funcionarios){
            if(f.numerosDeProjetos()> controle){
                controle = f.numerosDeProjetos();
                funcionarioMaisProdutivo = f;
            }
        }
        return funcionarioMaisProdutivo;
    }
    public Funcionario menosProdutivo(){
        int controle = Integer.MAX_VALUE;
        Funcionario funcionarioMenosProdutivo = null;
        for(Funcionario f : funcionarios){
            if(f.numerosDeProjetos()< controle){
                controle = f.numerosDeProjetos();
                funcionarioMenosProdutivo = f;
            }
        }
        return funcionarioMenosProdutivo;
    }
    
}
