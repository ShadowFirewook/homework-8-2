package kg.geektech.game.players;

public abstract class Hero extends kg.geektech.game.players.GameEntity implements kg.geektech.game.players.HavingSuperPower {
    private SuperAbility superAbility;

    public Hero(String name, int health, int damage, SuperAbility superAbility) {
        super(name, health, damage);
        this.superAbility = superAbility;
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }

    public void hit(kg.geektech.game.players.Boss boss) {
        if (boss.getHealth() > 0) {
            boss.setHealth(boss.getHealth() - this.getDamage());
        }
    }
}
