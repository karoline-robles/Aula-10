package br.com.esquals;

import javax.sound.midi.Soundbank;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        Pessoa karol = new Pessoa("Karol", 29, 00000);
        Pessoa ana = new Pessoa("Karol ", 29, 00000);
        String nome1 = "Karol";
        String nom2 = "Karol";

        if (nome1.equals(nom2)) {
            System.out.println("Objetos iguais");

        } else {
            System.out.println("Objetos diferentes");
        }
        System.out.println(karol.toString());
    }

}