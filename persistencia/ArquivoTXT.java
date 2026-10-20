package com.diogo.SistemaLembretes.persistencia;

import com.diogo.SistemaLembretes.model.Lembrete;


import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ArquivoTXT {

    private String arquivo = "C:\\Lembretes\\lembretes.txt";
    private int ID;

    public void escrever(ArrayList<Lembrete> lembretes){

         try(BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo,true))){

             for(Lembrete l : lembretes){

                 escritor.write(l.toString());
                 escritor.newLine();
             }


         } catch (Exception e) {

             JOptionPane.showMessageDialog(null , "HOUVE UM ERRO");
         }


    }

    public void mostrarlembretes(){

        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {

            String leitura = leitor.readLine();

            while (leitura != null){

                System.out.println(leitura);
                leitura = leitor.readLine();
            }


        }catch (Exception e){

            JOptionPane.showMessageDialog(null, "HOUVE UM ERRO");
        }
    }



}