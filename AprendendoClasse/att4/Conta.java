/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Victor
 */
public class Conta {
    private int id;
    private String codigoDeBarras;
    private double valor;

    public Conta() {
        this.id=0;
        this.codigoDeBarras = "";
        this.valor = 0.0;   
    }

    public Conta(int id, String codigoDeBarras, double valor) {
        this.id = id;
        this.codigoDeBarras = codigoDeBarras;
        this.valor = valor;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{id:"+this.id+"/"+"codido:"+this.codigoDeBarras+"/"+"valor:"+this.valor+"}";
    }
    
    
    
}
