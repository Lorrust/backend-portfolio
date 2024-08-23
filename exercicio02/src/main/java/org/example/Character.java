package org.example;

public class Character {
    String name;
    Integer strength;
    Integer health;
    Integer maxHealth;

    public void verifyAlive(Character enemy) {
        if (this.health > 0 && enemy.health <= 0) {
            System.out.println(this.name + " defeated " + enemy.name + "!");
        } else {
            System.out.println(this.name + " was defeated by " + enemy.name + "!");
        }
    }

    public void attack(Character target) {
        if (this.health > 0 && target.health > 0) {
            System.out.println(this.name + " attacks " + target.name + "!");
            target.takeDamage(this.strength);
        }
    }

    public void takeDamage(Integer damage) {
        if (this.health <= 0) {
            System.out.println(this.name + " was defeated!");
        } else {
            System.out.println(this.name + " takes " + damage + " damage!");
            this.health -= damage;
            System.out.println(this.name + "'s Health: " + health + "/" + this.maxHealth);
        }
    }

    public Character(String name, Integer maxHealth, Integer strength) {
        this.name = name;
        this.strength = strength;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
    }
}
