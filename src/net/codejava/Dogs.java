package net.codejava;

public class Dogs {
    String name;
    float weight;
    String color;
 
 
    {
        color = "Brown";
    }
 
    Dogs(String name) {
        this.name = name;
    }
 
    void bark() {
        System.out.println("Gow gow!");
    }
 
    void waveTail() {
        System.out.println("Waving...");
    }
}

