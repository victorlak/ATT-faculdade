package com.mycompany.atividade2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class GerenciadorProduto {
    private List<Produto> produtos;

    public GerenciadorProduto() {
        produtos = new ArrayList<>();
    }
    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    public void removeProduto(String codigo){
        if(buscarProduto(codigo)!=null){
            produtos.remove(codigo);
        }
    }
    public void atualizarProduto(String codigo, Produto produto){
        for(Produto p : produtos){
            if(p.getCodigo().equals(codigo)){
                p.setCodigo(produto.getCodigo());
                p.setCusto(produto.getCusto());
                p.setNome(produto.getNome());
                p.setPreco(produto.getPreco());
            }
         }
    }
    public Produto buscarProduto(String codigo){
        for(Produto p : produtos){
            if(p.getCodigo().equals(codigo)){
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for(Produto p : produtos){
            saida.append(p.toString()).append("\n");
        }
        return saida.toString();
    }
    
}