package com.diogo.SistemaLembretes.app;

import com.diogo.SistemaLembretes.model.Lembrete;
import com.diogo.SistemaLembretes.service.ControleLembretes;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static  void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        Lembrete lembrete = new Lembrete();
        ControleLembretes controleLembretes = new ControleLembretes(lembrete, leitura);



         String resp = "";



          do{

              System.out.print("Digite : ");
              int escolha = leitura.nextInt();
              leitura.nextLine();
              System.out.println("----------");

              switch (escolha){

                  case 1 :
                      controleLembretes.adicionar();
                      break;

                  case 2 :
                      controleLembretes.mostra();
                      break;
              }

              System.out.print("deseja continuar : ");
              resp = leitura.nextLine();


          }while (resp.equalsIgnoreCase("Sim"));




    }


}
