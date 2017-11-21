package com.company;

/**
 * Created by dougw on 10/14/2016.
 */
public class Lynx extends Cat implements CanSpeak {
    public Lynx() {
        System.out.println("A new instance of Lynx created!");
    }

    public void growl() {
        System.out.println("Grrrr!");
    }
}
