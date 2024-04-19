/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import classes.Conta;
import classes.PessoaFisica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class Cadastro {

    private List<PessoaFisica> devedores;

    public Cadastro() {
        this.devedores = new ArrayList<>();
    }

    public void addPessoa(PessoaFisica pessoa) {
        devedores.add(pessoa);
    }

    public String maiorDevedor() {
        String cpf = "";
        double divida = 0;
        double maiorDivida = 0.0;
        for (PessoaFisica p : devedores) {
            divida = 0.0;
            for(Conta c : p.getContas()){
                divida = divida + c.getValor();
            }
            if(divida > maiorDivida){
                maiorDivida = divida;
                cpf = p.getCpf();
            }
        }
        return cpf;
    }
    public void exibirDividasDeTodos(){
        for(PessoaFisica devedor: devedores){
            System.out.println("CPF:"+devedor.getCpf()+"/// Divida:"+devedor.saldoDevedor());
        }
    }
}
