package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(50);
        boss.setBossDefense("Super defense");
        boss.setBosshealth(100);
        System.out.println(boss.getBossDamage() + "bossDamage " + boss.getBosshealth() + "bossHealth " + boss.getBossDefense() + " bossDefence");
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getPower());
        }


    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Magic");
        Hero hero2 = new Hero(100, 40);
        Hero hero3 = new Hero(100, 30, "Mystical");
        Hero heroes[] =  {hero1, hero2, hero3};
        return heroes;
    }

}
