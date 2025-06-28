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
    private ArrayList<Habito> habitosHj = new ArrayList<>();
    private ArrayList<Habito> feitosHj = new ArrayList<>();
    
    
    public void adicionarHabito(Habito h){
        if(habitosHj!=null){
            if(!habitosHj.contains(h)){
                habitosHj.add(h);
            } else{
                System.out.println("Este hábito já foi adicionado");
            }
        } else {
            habitosHj.add(h);
        }
    }
    
    public void alterarStatus(Habito h){
        if(habitosHj.contains(h) && feitosHj.contains(h)){
            h.setStatusHj(Boolean.FALSE);
            feitosHj.remove(h); // se já tiver na lista, remove (desmarcar)
        } else if(habitosHj.contains(h) && !feitosHj.contains(h)){
            h.setStatusHj(Boolean.TRUE);
            feitosHj.add(h); // se não tiver na lista, adiciona (marcado)
    }
}
    public ArrayList<Habito> getHabitosHj() {
        return this.habitosHj;
    }

    public void setHabitosHj(ArrayList<Habito> habitosHj) {
        this.habitosHj = habitosHj;
    }

    public ArrayList<Habito> getFeitosHj() {
        return this.feitosHj;
    }

    public void setFeitosHj(ArrayList<Habito> feitosHj) {
        this.feitosHj = feitosHj;
    }
}
