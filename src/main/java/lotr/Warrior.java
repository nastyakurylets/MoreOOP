package lotr;

public abstract class Warrior extends Character {
    public Warrior(int power, int hp) {
        super(power, hp);
    }

    public void kick(Character c) {
        int damage = (int)(Math.random() * this.power);
        c.setHp(c.getHp() - damage);
        System.out.println(this.getClass().getSimpleName() + " dealt " + damage + " damage to " + c.getClass().getSimpleName());
    }
}