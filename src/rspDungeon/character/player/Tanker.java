package rspDungeon.character.player;

import rspDungeon.character.Character;

import java.util.Scanner;

public class Tanker extends Player {
    public Tanker(Scanner sc) {
        super(sc);
        this.name = "Tanker";

        this.maxHP = 100;
        this.currentHP = 100;
        this.power = 5;
        this.resilience = 15;
        this.level = 1;
        this.currentMoney = 100;
        this.potionCount = 3;
    }

    //공격하기(이긴 경우)
    @Override
    public void attack(Character target) {
        target.currentHP -= power;
    }

    //회복(비긴 경우)
    public void heal(){
        if((currentHP + resilience/2) < maxHP){
            currentHP += resilience/2;
        }else{
            currentHP = maxHP;
        }
    }

    public void levelUp(){
        maxHP += 15;
        if(currentHP + 15 < maxHP){
            currentHP += 15;
        }else{
            currentHP = maxHP;
        }
        power += 5;
        resilience += 10;
    }
}
