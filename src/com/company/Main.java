package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(50);
        boss.setBossDefense("Super defense");
        boss.setBosshealth(100);
        System.out.println(boss.getBossDamage() + "bossDamage " + boss.getBosshealth() + "bossHealth " + boss.getBossDefense() + " bossDefence");
        createHeroes();
    }

    public static String createHeroes() {
        Hero hero1 = new Hero(100, 20, "Magic");
        Hero hero2 = new Hero(100, 40);
        Hero hero3 = new Hero(100, 30, "Mysrical");
        Hero heroes[] = {hero1, hero2, hero3};
        for (int i = 0; i < heroes.length; i++) {

            System.out.println(heroes[i].getHealth() + " " + heroes[i].getDamage() + " " + heroes[i].getPower());
        }
        return " ";
    }

}
