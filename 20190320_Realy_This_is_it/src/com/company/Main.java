package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s = "bob";
        String t = "betty";
        String u = "Chuck";

        System.out.println("bob.compareTo(betty) is " + s.compareTo(t));

        System.out.println("s.compareToIgnoreCase(u) is " + s.compareToIgnoreCase(u) );

        if(s.compareTo(t) < 0){
            System.out.println("Less");
        }else{
            System.out.println("More");
        }

        Person a = new Person("Fred", 28);
        Person b = new Person("Barney", 27);
        Person c = new Person("Wilma");
        Person d = new Person("Betty");
        Person e = new Person(12);
        Person f = new Person();

        System.out.println(a.toString());
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(e.compareTo(f));

        ///Reading into an array
        int max = 100;
        Person[] crowd = new Person[max];
        int n = 0;

        n = readPeople(crowd, max);
        print(crowd, n);

    }
    public static int readPeople(Person[] crowd, int limit){
        int n = 0;

        try {
            Scanner input = new Scanner(new File("people.txt"));
            while(input.hasNextLine() && n < limit){
                String line = input.nextLine();
                String[] parts = line.split("\\t");
                if(parts.length == 4){
                    String name = parts[0];
                    int age = (int)Math.round(Double.parseDouble(parts[3])/12);
                    Person pn = new Person(name, age);
                    crowd[n] = pn;
                    //    crowd[n] = new Person(name, age);
                    n++;
                }
            }

            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return n;
    }
    public static void print(Person[] crowd, int n){
        System.out.printf("----------- %d ----------------\n", n);
        for(int i=0;i<n;i++){
            System.out.printf("[%2d] %s\n", i, crowd[i]);
        }
    }
}
