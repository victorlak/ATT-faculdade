/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import classes.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class Loja {
    private List<Pedido> pedidos;

    public Loja() {
        this.pedidos = new Array<>();
    }
    
    public int numeroDePedidos(){
        int soma = 0;
        for(Pedido p : pedidos){
            soma++;
        }
        return soma;
    }
    public double valorTotal(){
        double valorTotal = 0.0;
        for(Pedido p : pedidos){
            valorTotal = valorTotal + p.valorTotal();
        }
        return valorTotal;
    }
    
    
}
