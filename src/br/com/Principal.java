package br.com;

public class Principal {
    public static void main(String[] args) {
        Coca coca1 = new Coca(3, 4.5);
        Coca coca2 = new Coca(1, 4.5);

        if (coca1.equals(coca2)){
        System.out.println("São do mesmo tamanho");
        } else{
            System.out.println("São diferentes");
        }
    }
}