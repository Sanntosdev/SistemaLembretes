package com.diogo.SistemaLembretes.service;

import com.diogo.SistemaLembretes.model.Lembrete;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleLembretes {

    Lembrete lembrete;
    Scanner leitura;


    public ControleLembretes(Lembrete lembrete, Scanner leitura) {

        this.lembrete = lembrete;
        this.leitura = leitura;
    }

    ArrayList<Lembrete> lembretes = new ArrayList<Lembrete>();


    public void adicionar(){

        String resp;
        do {

              Lembrete lembrete = new Lembrete();

              System.out.print("Titulo : ");
              lembrete.setTitulo(leitura.nextLine());

              System.out.print("Descrição : ");
              lembrete.setDescricao(leitura.nextLine());

              System.out.print("Categoria : ");
              lembrete.setCategoria(leitura.nextLine());


              lembretes.add(lembrete);

              System.out.print("Quer continuar : ");
              resp = leitura.nextLine();
              System.out.println("---------------");

          }while (resp.equalsIgnoreCase("Sim"));


            if(resp.equalsIgnoreCase("Não")){

                return;
            }






    }

    public void mostra(){

        for(Lembrete l : lembretes){

            System.out.println(l.getTitulo());
            System.out.println(l.getDescricao());
            System.out.println(l.getCategoria());
            System.out.println("----------------");
        }
    }




}
