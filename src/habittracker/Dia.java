/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habittracker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author USer
 */
public class Dia {
    private String data;
    private String diaSemana;
    private HabitosDiarios habitosHj;
    private int quantHabitosHj;
    private int quantConcluidosHj;
    
    public Float porcConcluidosHj(){
        return (float) this.quantHabitosHj*this.quantConcluidosHj/100;
    }

    public Dia(HabitosDiarios habitosHj) {
        LocalDate lc = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = LocalDate.now().format(dtf);
        this.diaSemana = lc.getDayOfWeek().toString();
        this.habitosHj = habitosHj;
        this.quantHabitosHj = habitosHj.getHabitosHj().size();
        this.quantConcluidosHj = habitosHj.getFeitosHj().size();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public HabitosDiarios getHabitosHj() {
        return habitosHj;
    }

    public void setHabitosHj(HabitosDiarios habitosHj) {
        this.habitosHj = habitosHj;
    }

    public int getQuantHabitosHj() {
        return quantHabitosHj;
    }

    public void setQuantHabitosHj(int quantHabitosHj) {
        this.quantHabitosHj = quantHabitosHj;
    }

    public int getQuantConcluidosHj() {
        return quantConcluidosHj;
    }

    public void setQuantConcluidosHj(int quantConcluidosHj) {
        this.quantConcluidosHj = quantConcluidosHj;
    }
    
}
