/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;

/**
 *
 * @author Victor
 */
public class Imovel {
    private String tipo;
    private int numeroQuartos;
    private int numeroBanheiros;
    private int area;
    private double preco;

    public int getArea() {
        return area;
    }

    public int getNumeroBanheiros() {
        return numeroBanheiros;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setNumeroBanheiros(int numeroBanheiros) {
        this.numeroBanheiros = numeroBanheiros;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{Tipo:"+this.tipo+"Numero de quartos"+this.numeroQuartos+"Numero de banheiros:"+this.numeroBanheiros+"Area:"+this.area+"Preco:"+this.preco+"}";
    }
    
    
}
