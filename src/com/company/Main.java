package com.company;

public class Main {

    public static void main(String[] args) {
        Animal akula = new Shark();
        Animal cherepaha = new Turtle();
        Animal orel = new Eagle();

        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                System.out.println(animal.getClass());
                Shark.attack();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            } else if (animal instanceof Turtle) {
                System.out.println(animal.getClass());
                Turtle.swim();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            } else {
                System.out.println(animal.getClass());
                Eagle.fly();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    Shark[] sharks = {new Shark()};
    Turtle[] turtles = {new Turtle()};
    Eagle[] eagles = {new Eagle()};
    }
}

