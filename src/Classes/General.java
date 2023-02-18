package Classes;

import java.util.Random;

public class General {
    private Integer strength, hp, level, mp, dexterity, damage;

    public void attack() {
        Random random = new Random();
        int d20 = random.nextInt(20);
        d20++;
        if (d20 == 1) {
            System.out.printf("Fail! You Missed!");
        } else {
            damage = strength;
            System.out.println("You hit the enemy!");
        }
    }
    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
