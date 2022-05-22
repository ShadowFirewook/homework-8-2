package kg.geektech.game.general;

import kg.geektech.game.players.*;

import java.util.Random;

public class RPG_Game {

    private static int roundNumber;
    public static Random random = new Random();

    public static void startGame() {
        Boss boss = new Boss("Bolot", 1450, 60);
        Warrior warrior = new Warrior("Hercules", 270, 10);
        Medic doctor = new Medic("Aibolit", 250, 5, 15);
        Magic magic = new Magic("Gendelf", 260, 20);
        Berserk berserk = new Berserk("Viking", 280, 15);
        Medic assistant = new Medic("Strange", 290, 10, 5);
        HuTao huTao = new HuTao("’Û “‡Ó", 400,4);
        Josuke josuke = new Josuke("Josuke", 270,10);
        Hero[] heroes = {warrior, doctor, magic, berserk, assistant,huTao,josuke};

        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }
    }

    private static void round(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.hit(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].hit(boss);
                heroes[i].applySuperPower(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println(roundNumber + " ROUND ______________");
        System.out.println("BOSS " + boss);
        for (int i = 0; i < heroes.length; i++) {
            /*System.out.println(heroes[i].getClass().getSimpleName() +
                    " health: " + heroes[i].getHealth() + " [" +
                    heroes[i].getDamage() + "]");*/
            System.out.println(heroes[i]);
        }
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }
}
