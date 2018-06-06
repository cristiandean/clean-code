package br.com.cleancode;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(8);

        MultiplicaParImpar calcula = new MultiplicaParImpar(list);
        System.out.println(calcula.getResultado());
    }
}