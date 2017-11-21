package com.company;

import com.company.Cat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat pet = new Cat();

        pet.petName = "Hoover";

        pet.speak();

        //pet.age;

        System.out.println(pet.petName + " is " + pet.getAge() + " years old.");

        Lynx wildAnimal = new Lynx();
        wildAnimal.petName = "Hijinks";
        wildAnimal.growl();
    }
}
