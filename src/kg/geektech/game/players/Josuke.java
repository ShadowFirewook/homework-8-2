package kg.geektech.game.players;

import java.util.Random;

public class Josuke extends kg.geektech.game.players.Hero {



    public Josuke(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.Stand);
    }
    @Override
    public void applySuperPower(kg.geektech.game.players.Boss boss, kg.geektech.game.players.Hero[] heroes) {
        int crazyDiamond = boss.getDamage() ;
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            i =random.nextInt(heroes.length);
            heroes[i].setHealth(heroes[i].getHealth() - crazyDiamond);
            if ( heroes[i].getHealth() >= 0 ){
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage() * 2);
                System.out.println("ƒжоске вернул количество здоровь€ герою " + heroes[i].getName() + " которое было у него до начала раунда");
            }else {
                System.out.println("√ерой" + heroes[i].getName() + " умер от действий стенда");
            }
        }
    }
}
