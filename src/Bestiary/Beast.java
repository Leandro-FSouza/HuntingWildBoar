package Bestiary;

import java.util.Random;
public class Beast {
    private String name;
    private int hp, strength, damage;

    public void attack() {
        Random random = new Random();
        int d20 = random.nextInt(20);
        d20++;
        if (d20 == 1) {
            System.out.printf("The %s missed!", name);
        } else if (d20 > 1 && d20 < 20) {
            damage = strength;
            System.out.printf("The %s hit you and did %d damage", name, damage);
        } else {
            damage = strength * 2;
            System.out.printf("The %s 's attack was ferocious and dealt %d damage", name, damage);
        }
    }
}
