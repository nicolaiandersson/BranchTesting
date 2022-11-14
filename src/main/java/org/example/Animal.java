package org.example;

abstract class Animal {
    private String name;
    private String foodType;


    public abstract void makeSound();

    public abstract Boolean eat(String foodType);

    public abstract void showMood(boolean mood);
}
