package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
            System.out.println("Elf killed " + c.getClass().getSimpleName());
        } else {
            c.power -= 1;
            System.out.println("Elf decreased " + c.getClass().getSimpleName() + "'s power by 1.");
        }
    }
}