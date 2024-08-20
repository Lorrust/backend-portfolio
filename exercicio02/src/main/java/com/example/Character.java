package com.example;

public class Character {
    String name;
    Integer health;
    Integer attack;

    public void verifyAlive() {
        if (health > 0) {
            System.out.println(this.name + " is alive.");
        } else {
            System.out.println(this.name + " is dead.");
        }
    }

    public void attack(Character target) {
        target.takeDamage(this.attack);
    }

    public void takeDamage(Integer damage) {
        if (this.health > 0) {
            this.health -= damage;
        } else {
            System.out.println(this.name + " was defeated.");
        }
    }

    public Character(String name, Integer health, Integer attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }
}
