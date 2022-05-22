package kg.geektech.game.players;

public class Magic extends kg.geektech.game.players.Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(kg.geektech.game.players.Boss boss, kg.geektech.game.players.Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+1);
            System.out.println("Маг увеличил урон героя " + heroes[i].getName() + " на 1 единицу");
        }
    }
}
