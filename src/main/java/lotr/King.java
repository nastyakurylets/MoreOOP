package lotr;

public class King extends Warrior {
    public King() {
        super((int)(Math.random() * 11) + 5, (int)(Math.random() * 11) + 5);
    }
}
