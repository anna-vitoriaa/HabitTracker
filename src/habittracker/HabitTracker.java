/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package habittracker;

import java.util.Scanner;

/**
 *
 * @author USer
 */
public class HabitTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HabitosDiarios hb = new HabitosDiarios();

        while (true) {    
            Dia d = new Dia(hb);
            System.out.println("======== HABIT TRACKER =========");
            System.out.println("HOJE - "+d.getData()+" - "+d.getDiaSemana());
            for(Habito h : hb.getHabitosHj()){
                if(hb.getFeitosHj().contains(h)){
                    System.out.print("[X] ");
                } else {
                    System.out.print("[ ] ");
                }
                System.out.print(h.getNome()+"\n");
            }
            System.out.println("\n\n1             Adicionar habito");
            System.out.println("2             Alterar status");
            System.out.println("3             Sair\n");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
        
            
            switch (op) {
                case 1:
                    System.out.println("Nome do hábito: ");
                    String nome = sc.next();
                    System.out.println("Frequencia semanal desejada: ");
                    int fsd = sc.nextInt();
                    hb.adicionarHabito(new Habito(nome, fsd));
                    break;
                case 2:
                    for(int i=0; i<hb.getHabitosHj().size(); i++){
                        if(hb.getFeitosHj().contains(hb.getHabitosHj().get(i))){
                            System.out.print(i+"  [X] ️");
                        } else {
                            System.out.print(i+"  [ ] ");
                        }
                        System.out.print(hb.getHabitosHj().get(i).getNome()+"\n");
                    }   System.out.println("\n\nQual habito?");
                    op = sc.nextInt();
                    hb.alterarStatus(hb.getHabitosHj().get(op));
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }

    }
    
}
