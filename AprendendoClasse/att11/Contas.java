/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class Contas {
    private String numeroConta;
    private String titular;
    private double saldo;
    private List<Transacao> transacoes;

    public Contas() {
        this.numeroConta = "";
        this.titular = "";
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }
    public Contas(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.transacoes = new ArrayList<>();
    }
    public void depositar(Double deposito){
        double valorAtualizado = this.saldo + deposito;
        this.saldo = valorAtualizado;
    }
    public void saque(Double saque){
        double valorAtualizado = this.saldo - saque;
        this.saldo = valorAtualizado;
    }
    

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double Saldo) {
        this.saldo = Saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }
    

    @Override
    public String toString() {
        return "Contas{" + "numeroConta=" + numeroConta + ", titular=" + titular + ", Saldo=" + saldo + '}';
    }
    
    
}
