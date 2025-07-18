package com.github.tavinescada;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Funcs {
    public void retornaData(){
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");

        Calendar calendas = Calendar.getInstance();
        
        Date hoje = calendas.getTime();

        calendas.add(Calendar.DAY_OF_MONTH, 20); //calcular data 20 dias no futuro
        Date futuro = calendas.getTime();

        /*calendas = Calendar.getInstance(); //voltando para a data atual
        Date hojeNovamente = calendas.getTime();*/

        System.out.println("Data atual: " + formatacao.format(hoje));
        System.out.println("Data daqui a vinte dias: " + formatacao.format(futuro));
        //System.out.println("Hoje de novo: " + formatacao.format(hojeNovamente));
        
    }
}
