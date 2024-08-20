package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Character mage = new Character("Mage", 250, 30);

        List<Character> enemies = new ArrayList<>();
        Character orc = new Character("Orc",100, 10);
        enemies.add(orc);
        Character goblin = new Character("Goblin",50, 5);
        enemies.add(goblin);
        Character wolf = new Character("Wolf",75, 15);
        enemies.add(wolf);
        Character knight = new Character("Knight",200, 20);
        enemies.add(knight);
        Character dragon = new Character("Dragon",500, 50);
        enemies.add(dragon);

        while (mage.health > 0) {
            for (Character enemy : enemies) {
                while (enemy.health > 0) {
                    mage.attack(enemy);
                }
            }
        }
    }
}