package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;
    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int berserkPower = (boss.getDamage()) / 3;
        boss.setHealth(boss.getHealth() - berserkPower);
        System.out.println("Викинг нанес часть урона босса ему же");

    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}
