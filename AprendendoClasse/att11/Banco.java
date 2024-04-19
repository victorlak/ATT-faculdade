/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Classes.Contas;
import Classes.Transacao;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class Banco {
    private String nome;
    private List<Contas> contas;
    private List<Transacao> transacoes;

    public Banco(String nome) {
        this.nome = nome;
        
    }
    public void addConta(Contas conta){
        contas.add(conta);
    }
    public void removerConta(String numeroConta){
        contas.remove(numeroConta);
    }
    public void addTransacao(Transacao transacao){
        transacoes.add(transacao);
    }
    public void removeTransacao(int id){
        transacoes.remove(id);
    }
    public void exibirContas(){
        for(Contas c : contas){
            System.out.println(c);
        }
    }
    public void exibirTransacoes(){
        for(Transacao t : transacoes){
            System.out.println(t);
        }
    }
    public Contas contaMaiorSaldo(){
        Contas c = contas.get(0);
        for(Contas conta : contas){
            if(conta.getSaldo() > c.getSaldo()){
                c = conta;
            }
        }
        return c;
    }
    public Contas contaMenorSaldo(){
        Contas c = contas.get(0);
        for(Contas conta : contas){
            if(conta.getSaldo() < c.getSaldo()){
                c = conta;
            }
        }
        return c;
    }
    public int totalDevedores(){
        int devedores = 0;
        for(Contas c : contas){
            if(c.getSaldo() < 0){
                devedores++;
            }
        }
        return devedores;
    }
    public int totalCredores(){
        int credores = 0;
        for(Contas c : contas){
            if(c.getSaldo() > 0){
                credores++;
            }
        }
        return credores;
    }
    public double dividaTotal(){
        double dividaTotal = 0.0;
        for(Contas c : contas){
            if(c.getSaldo() < 0){
                dividaTotal = dividaTotal + c.getSaldo();
            }
        }
        return dividaTotal;
    }
    public double saldoTotal(){
        double saldoTotal = 0.0;
        for(Contas c : contas){
            if(c.getSaldo() > 0){
                saldoTotal = saldoTotal + c.getSaldo();
            }
        }
        return saldoTotal;
    }
    
    
}
