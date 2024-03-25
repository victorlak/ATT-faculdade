/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author 14626232639
 */
public class Transacao {
    private int id;
    private String tipo;
    private double valor;
    private String data;
    private Contas contaAssociada;

    public Transacao() {
        this.id = -1;
        this.tipo = "";
        this.valor = 0.0;
        this.data = "";
        
    }

    public Transacao(int id, String tipo, double valor, String data, Contas contaAssociada) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.contaAssociada = contaAssociada;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Contas getContaAssociada() {
        return contaAssociada;
    }

    public void setContaAssociada(Contas contaAssociada) {
        this.contaAssociada = contaAssociada;
    }

    @Override
    public String toString() {
        return "Transacao{" + "id=" + id + ", tipo=" + tipo + ", valor=" + valor + ", data=" + data + ", contaAssociada=" + contaAssociada + '}';
    }
    
    
    
    
}
