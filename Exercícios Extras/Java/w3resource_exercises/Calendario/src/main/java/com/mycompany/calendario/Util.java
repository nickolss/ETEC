/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calendario;
import java.util.Calendar;
/**
 *
 * @author nicks
 */
public class Util {
    Calendar cal = Calendar.getInstance();
    
    public void exibirDatas(){
        System.out.println("**************");
        System.out.println("* CALENDÁRIO *");
        System.out.println("**************");
        System.out.println("");
        System.out.println("Dia: " + cal.get(Calendar.DATE));
        System.out.println("Mês: " + cal.get(Calendar.MONTH));
        System.out.println("Ano: " + cal.get(Calendar.YEAR));
        System.out.println("");
        System.out.println("Hora Atual:" +
                cal.get(Calendar.HOUR_OF_DAY) +":"+
                cal.get(Calendar.MINUTE) +":"+
                cal.get(Calendar.SECOND));
    }
}
