package com.diogo.SistemaLembretes.app;

import com.diogo.SistemaLembretes.model.Lembrete;
import com.diogo.SistemaLembretes.persistencia.ArquivoTXT;
import com.diogo.SistemaLembretes.service.ControleLembretes;

import java.util.Scanner;

public class Main {

    static int menu(){

        Scanner resp = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1 - Adicionar lembretes");
        System.out.println("2 - Ver lembretes pendentes");
        System.out.print("Escolha o que deseja : ");
        int menu = resp.nextInt();
        System.out.println("===== MENU =====");

        return menu;
    }
    public static  void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Lembrete lembrete = new Lembrete();
        ArquivoTXT txt = new ArquivoTXT();
        ControleLembretes controleLembretes = new ControleLembretes(lembrete, leitura, txt);

        String resp = "";

        do{

            switch (menu()){

                case 1 :

                    controleLembretes.adicionar();
                    break;

                case 2 :

                    controleLembretes.mostraLembretes();
                    break;
            }

            System.out.print("deseja continuar : ");
            resp = leitura.nextLine();


        }while (resp.equalsIgnoreCase("Sim"));








    }


}
