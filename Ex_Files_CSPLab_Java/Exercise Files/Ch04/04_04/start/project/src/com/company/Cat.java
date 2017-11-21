package com.company;

/**
 * Created by dougw on 10/14/2016.
 */
public class Cat {
    public String petName;

    public Cat() {
        System.out.println("A new instance of Cat created!");
    }

    public void speak() {
        System.out.println(petName + ", says, \"Meow!\"");
    }
}
