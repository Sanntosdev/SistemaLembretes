package com.diogo.SistemaLembretes.service;

import com.diogo.SistemaLembretes.model.Lembrete;
import com.diogo.SistemaLembretes.persistencia.ArquivoTXT;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleLembretes {

    Lembrete lembrete;
    Scanner leitura;
    ArquivoTXT txt;


    public ControleLembretes(Lembrete lembrete, Scanner leitura, ArquivoTXT txt) {

        this.lembrete = lembrete;
        this.leitura = leitura;
        this.txt = txt;
    }

    public ArrayList<Lembrete> lembretes = new ArrayList<Lembrete>();


    public void adicionar() {

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

            System.out.print("Deseja adicionar em txt : ");
            String resp1 = leitura.nextLine();
            if (resp1.equalsIgnoreCase("Sim")) {

                txt.escrever(lembretes);
            }

            System.out.print("Deseja adicionar mais algum lembrete : : ");
            resp = leitura.nextLine();
            System.out.println("---------------");

        } while (resp.equalsIgnoreCase("Sim"));




    }

    public void mostraLembretes() {

        txt.mostrarlembretes();
        System.out.println("--------------");

    }


}
