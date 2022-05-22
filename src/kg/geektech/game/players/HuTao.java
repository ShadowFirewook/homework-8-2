package kg.geektech.game.players;

public class HuTao extends kg.geektech.game.players.Hero {
    private int huTaoFullHPValue = this.getHealth();

    public int getHuTaoFullHPValue() {
        return huTaoFullHPValue;
    }

    public void setHuTaoFullHPValue(int huTaoFullHPValue) {
        this.huTaoFullHPValue = huTaoFullHPValue;
    }

    public HuTao(String name, int health, int damage){
        super(name, health, damage, SuperAbility.Танец_бабочки);
    }
    @Override
    public void applySuperPower(kg.geektech.game.players.Boss boss, kg.geektech.game.players.Hero[] heroes) {
        this.setHealth(this.getHealth() - this.getHealth() / 100 * 33);
        this.setDamage(this.getDamage() + getHuTaoFullHPValue() / 100 * 10);
        if (this.getHealth() <= getHuTaoFullHPValue() /2){
            this.setDamage(getDamage() + (getDamage() / 3));
        }
        boss.setHealth(boss.getHealth() - this.getDamage());
        this.setDamage(this.getDamage() / 10);
        if (boss.getHealth() <= 0){
            this.setHealth(this.getHealth() + getHuTaoFullHPValue() / 100 * 2);
        }
        System.out.println("Ху Тао применила свою способность");
    }
}
