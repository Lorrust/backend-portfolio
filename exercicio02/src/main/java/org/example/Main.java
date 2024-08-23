package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> heroes = new ArrayList<>();
        Character mage = new Character("Mage", 50, 30);
        heroes.add(mage);
        Character summoner = new Character("Summoner", 300, 20);
        heroes.add(summoner);
        Character paladin = new Character("Paladin", 300, 50);
        heroes.add(paladin);

        for (Character hero : heroes) {
            List<Character> enemies = getEnemies();
            for (Character enemy : enemies) {
                System.out.println("\n" + hero.name + " vs. " + enemy.name);
                while (hero.health > 0 && enemy.health > 0) {
                    hero.attack(enemy);
                    enemy.attack(hero);
                }
                hero.verifyAlive(enemy);
            }
        }
    }

    private static List<Character> getEnemies() {
        List<Character> enemies = new ArrayList<>();
        Character orc = new Character("Orc", 100, 10);
        enemies.add(orc);
        Character goblin = new Character("Goblin", 50, 5);
        enemies.add(goblin);
        Character wolf = new Character("Wolf", 75, 15);
        enemies.add(wolf);
        Character knight = new Character("Knight", 200, 20);
        enemies.add(knight);
        Character dragon = new Character("Dragon", 500, 50);
        enemies.add(dragon);
        return enemies;
    }
}