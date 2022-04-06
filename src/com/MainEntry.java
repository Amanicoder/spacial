package com;

import org.models.*;

import java.util.ArrayList;
import java.util.Collections;

public class MainEntry {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("moi", 1,2));
        humans.add(new Human("jojo", 40,20));
        humans.add(new Human("fofo", 15,27));
        humans.add(new Human("tito", 30,18));

        ArrayList<Dragon> dragons = new ArrayList<>();
        dragons.add(new Dragon("drago",37,33, 74,30));
        dragons.add(new Dragon("drago",303,43, 50,100));
        dragons.add(new Dragon("drago",34,23, 33,50));
        dragons.add(new Dragon("drago",87,40, 64,70));
        dragons.add(new Dragon("cake",44,33,33,22));

        ArrayList<Orc> orcs = new ArrayList<>();
        orcs.add(new Orc("nanoo",13,102,103,53,34));
        orcs.add(new Orc("baobao",23,100,23,4,4));
        orcs.add(new Orc("etoile",3,12,34,41,113));
        orcs.add(new Orc("nav",6,63,80,42,28));

        System.out.println("---------Orcs---------");
        for(Orc o : orcs){
            System.out.println(o);
        }
        Collections.sort(orcs);
        System.out.println("------------------");
        for(Orc o : orcs){
            System.out.println(o);
        }

        System.out.println("---------dragons---------");
        for(Dragon d : dragons){
            System.out.println(d);
        }
        Collections.sort(dragons);
        System.out.println("------------------");
        for(Dragon d : dragons){
            System.out.println(d);
        }
    }

}
