package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> jupSan = new ArrayList<>();
        ArrayList<Integer> takSan = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < 50; i++) {
            counter = random.nextInt(100);
            if(counter % 2 == 0){
                jupSan.add(counter);
            }
            if (counter % 2 != 0){
                takSan.add(counter);
            }
            System.out.print(counter + ", ");
         }
        System.out.println("\n");
        System.out.println("Jup sandar:" + jupSan);
        System.out.println("Tak sandar:" + takSan);
    }
}

   /* ArrayList тузунуз
      1ден 100го чейинки 50 сан менен толтурунуз
      Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
      Аларды консольго чыгарыныз*/