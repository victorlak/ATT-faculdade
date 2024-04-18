/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2;

/**
 *
 * @author Victor
 */
public class Produto {
    private String codigo;
    private double custo;
    private double preco;
    private String nome;

    public Produto() {
        this.codigo = "";
        this.custo = 0.0;
        this.nome = "";
        this.preco = 0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getCusto() {
        return custo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "{ "+"Codigo:"+ this.codigo + " / "+"Nome:"+this.nome + " / "+"Preço:"+this.preco+" / "+"Custo:"+this.custo+" }";
    }
    
    
}
