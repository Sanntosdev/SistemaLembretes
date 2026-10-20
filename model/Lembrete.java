package com.diogo.SistemaLembretes.model;


public class Lembrete {

     private String titulo;
     private String descricao;
     private String categoria;




     public String getTitulo() {
          return titulo;
     }

     public String setTitulo (String titulo) {



          if(titulo.length() > 4 && titulo.length() <= 50){

               this.titulo = titulo;
          }else{

               System.out.println("FORA DO PADRÃO");
               this.titulo = null;
          }

          return titulo;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {

          if(descricao.length() > 5 && descricao.length() <= 200){

               this.descricao = descricao;
          }else{

               System.out.println("FORA DO PADRÃO");

          }


     }

     public String getCategoria() {
          return categoria;
     }

     public void setCategoria(String categoria) {


          if(categoria.length() >= 4 && categoria.length() <= 50){

               this.categoria = categoria;
          }else{

               System.out.println("FORA DO PADRÃO");
          }


     }

     @Override
     public String toString() {
          return "Titulo : " + this.titulo + "\n" + "Descrição : " + this.descricao + "\n" + "Categoria : " + this.categoria + "\n";



     }
}


