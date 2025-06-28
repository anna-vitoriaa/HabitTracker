/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habittracker;

import java.util.ArrayList;

/**
 *
 * @author USer
 */
public class HabitosDiarios {
    ArrayList<Habito> habitosHj = new ArrayList<>();
    ArrayList<Habito> feitosHj = new ArrayList<>();
    
    
    public void adicionarHabito(Habito h){
        if(habitosHj!=null){
            for(Habito hab : habitosHj){
                if(!hab.equals(h)){
                    habitosHj.add(h);
                } else{
                    System.out.println("Este hábito já foi adicionado");
                }
            }
        } else {
            habitosHj.add(h);
        }
    }
    
    public void desMarcar(Habito h){
        for(Habito hab : habitosHj){
                if(!hab.equals(h)){
                    habitosHj.add(h); // se não tiver na lista, adiciona (marcado)
                } else{
                    habitosHj.remove(h); // se já tiver na lista, remove (desmarcado)
                }
            }
    }

    public HabitosDiarios() {
    }

    public ArrayList<Habito> getHabitosHj() {
        return habitosHj;
    }
    
}
