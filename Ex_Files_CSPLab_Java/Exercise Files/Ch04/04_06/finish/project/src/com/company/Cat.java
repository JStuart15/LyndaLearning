package com.company;

/**
 * Created by dougw on 10/14/2016.
 */
public class Cat implements CanSpeak {
    public String petName;
    private int age;

    public Cat() {
        System.out.println("A new instance of Cat created!");
        age = 0;
    }

    public void speak() {

        System.out.println(petName + ", says, \"Meow!\"");
    }

    public int getAge() {
        return age;
    }
}
