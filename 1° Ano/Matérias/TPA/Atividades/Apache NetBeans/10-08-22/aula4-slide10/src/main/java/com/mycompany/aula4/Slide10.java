/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula4;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Slide10 {
    public static void main(String[] args) {
        String str = "Isto é um String do Java";
        String xyz = new String ("Isto é uma String do Java");
        
        //maneira errada de comparar string, portanto dará diferente
        if(str==xyz)
            System.out.println("IGUAL");
        else
            System.out.println("DIFERENTE");
        //maneira correta de comparar Strings
        if (str.equals(xyz))
            System.out.println("Tamanho" + str.length());
            System.out.println("Substring" + str.substring(0,10));
            System.out.println("Caracter na posição 5" + str.charAt(5));
            //outros métodos
            //quebra sempre que encontrar espaços
            String palavras[]=str.split("");
            System.out.println("Palavras:" + palavras[0]);
            System.out.println("Palavras:" + palavras[1]);
            System.out.println("Palavras:" + palavras[2]);
            //aponta o index
            int i = str.indexOf("uma");
            System.out.println("Índice: " + i); //o indice conta a partir de 0
            //compara o inicio e o fim da string
            boolean teste = (str.startsWith("Olá") || str.endsWith("Mundo"));
            System.out.println("Resultado:" + teste);
            //elimina espaços vazios no inicio e fim da string
            str=str.trim();
            System.out.println(str);
            //substitui caracteres
            str=str.replace('a', '@');
            System.out.println(str);
            //substitui palavras
            str=str.replaceAll("string", "Cadeia de caracteres");
            System.out.println(str);
    }   
            
}
 