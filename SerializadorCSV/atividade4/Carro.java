/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade4;

/**
 *
 * @author Victor
 */
public class Carro {
    private String modelo;
    private String marca;
    private String ano;
    private double preco;

    public Carro() {
        this.modelo = "";
        this.marca = "";
        this.ano = "";
        this.preco = 0.0;
    }
    
    
    public String getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "{Modelo: "+this.modelo + "Marca:"+this.marca + "Ano:"+ this.ano +"Preço:"+this.preco+"}";
    }
    
    
}
