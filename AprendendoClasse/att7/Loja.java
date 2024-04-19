/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

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
        this.pedidos = new ArrayList<>();
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
    public String clienteComMaisPedidos(){
        
        String clienteRetorno = "";
        int controle = 0;
        for(int i = 0; i < pedidos.size(); i++){
            int quantidadePedidos = 0;
            String nome = pedidos.get(i).getCliente().getNome();
            for(int j = 0; j < pedidos.size(); j++){
                  if(pedidos.get(i).getCliente().getNome().equals(pedidos.get(j).getCliente().getNome()))
                  quantidadePedidos++;
            }
            if(quantidadePedidos > controle){
                  controle = quantidadePedidos;
                  clienteRetorno = nome;
            }
        }
        return clienteRetorno;
    }
    public String maiorGasto(){
        double maiorGasto = 0.0;
        String nome = "";
        for(Pedido p : pedidos){
            if(p.valorTotal() > maiorGasto){
                maiorGasto = p.valorTotal();
                nome = p.getCliente().getNome();
            }
        }
        return nome;
    }
    
}
