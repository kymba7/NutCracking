package com.company.model.abstracts;

public abstract class Nuts {
    public String name;
    public double weight;
    public String sound;

    public Nuts(String name, double weight, String sound) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
    }

    public void crackNut(){
        System.out.println(this.sound);
        System.out.println("Cracked a " + name);
    }
}


