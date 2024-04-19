/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
3. **Classe `Departamento`:**
    - Atributos: nome do departamento, gerente do departamento
(do tipo `Gerente`), lista de funcionários (do tipo `Funcionário`).
    - Métodos: construtores, getters e setters, métodos para adicionar
e remover funcionários, método para definir o gerente do departamento.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class Departamento {
    private String nome;
    private Gerente gerente;
    private List<Funcionario> funcionarios;

    public Departamento() {
        this.nome = "";
        this.gerente = new Gerente();
        this.funcionarios = new ArrayList<>();
    }
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void removerFuncionario(String nome){
        for(Funcionario f : funcionarios){
            if(f.getNome().equals(nome)){
                funcionarios.remove(f);
            }
        }
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
