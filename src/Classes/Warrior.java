package Classes;

import java.util.Random;

public class Warrior extends General {
    public Warrior() {
        setLevel(1); setStrength(10);setDexterity(10);setHp(100);setMp(20);
    }
    public void piercingCut() {
        Integer costPiercingCut = getMp() - 5;
        Random random = new Random();
        int d20 = random.nextInt(20);
        d20++;
        if (d20 == 1) {
            System.out.printf("Fail! You Missed!");
            setMp(costPiercingCut);
        } else if (d20 > 1 && d20 < 19){
            setDamage(getLevel() * getStrength() * 3);
            System.out.printf("You hit the enemy and deal %d massive damage!", getDamage());
            setMp(costPiercingCut);
        } else {
            setDamage(getLevel() * getStrength() * 5);
            System.out.printf("Critical! You hit the enemy and deal %d massive damage!", getDamage());
            setMp(costPiercingCut);
        }
    }
}

