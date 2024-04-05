/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class GerenciadorAnimal {
    private List<Animal> animais;

    public GerenciadorAnimal() {
        this.animais = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animais.add(animal);
    }
    public void removeAnimal(String nome){
        for(Animal a : animais){
            if(a.getNome() == nome){
                animais.remove(a);
            }
        }
    }
    public Animal buscar(String nome){
        Animal procurado = new Animal();
        for(Animal a : animais){
            if(a.getNome().equals(nome)){
                procurado = a;
            }
        }
        return procurado;
    }
    
    
}
