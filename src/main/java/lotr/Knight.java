package lotr;

public class Knight extends Warrior {
    public Knight() {
        super((int)(Math.random() * 11) + 2, (int)(Math.random() * 11) + 2);
    }
}