/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class PessoaFisica {
    private String nome;
    private String cpf;
    private String email;
    private List<Conta> contas;

    public PessoaFisica() {
        this.contas = new ArrayList<>();
        this.cpf = "";
        this.email="";
        this.nome="";
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public PessoaFisica(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public double saldoDevedor(){
        double valorTotal =0.0;
        for(Conta c: contas){
            valorTotal = valorTotal + c.getValor();
        }
        return valorTotal;
    }
    
    
    
}
