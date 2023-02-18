package Bestiary;

import java.util.Random;
public class WildBoar {
    private int hp = 20;
    private final int strength = 5;
    private int damage;

    public void attack() {
        Random random = new Random();
        int d20 = random.nextInt(20);
        d20++;
        if (d20 == 1) {
            System.out.println("The wild boar missed!");
        } else if (d20 > 1 && d20 < 20) {
            damage = strength;
            System.out.printf("The boar hit you and did %d damage", damage);
        } else {
            damage = strength * 2;
            System.out.printf("The boar's attack was ferocious and dealt %d damage", damage);
        }
    }
}
