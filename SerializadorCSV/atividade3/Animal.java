/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade3;

/**
 *
 * @author Victor
 */
public class Animal {
    private String codigo;
    private String raca;
    private String especie;
    private double peso;
    private int idade;
    
    public String getCodigo() {
        return codigo;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "{ Especie:"+ this.especie +"/"+"Raça:"+this.raca+"/"+"Peso:"+this.peso +"/"+"Idade:"+this.idade+"}";
    }
    
    
}
