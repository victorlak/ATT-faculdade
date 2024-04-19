/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author 14626232639
 */
public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private Contabancaria conta;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.conta = new Contabancaria();
    }

    public Cliente() {
        this.nome = "";
        this.cpf = "";
        this.conta = new Contabancaria();
        this.idade = 0;
    }
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preencha os dados:");
        System.out.println("Nome:");
        this.nome = leitor.next();
        System.out.println("cpf:");
        this.cpf = leitor.next();
        System.out.println("Idade:");
        this.idade = leitor.nextInt();
    }
    public void depositar(){
        Scanner leitor = new Scanner(System.in);
        double deposito;
        double saldoAtualizado;
        System.out.println("informe o valor:");
        deposito = leitor.nextDouble();
        saldoAtualizado = conta.getSaldo()+ deposito;
        conta.setSaldo(saldoAtualizado);
    }
    public void exibirSaldo(){
        double saldo = conta.getSaldo();
        System.out.println(saldo);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
/*
    public Contabancaria getConta() {
        return conta;
    }

    public void setConta(Contabancaria conta) {
        this.conta = conta;
    }
    
   */ 
}
