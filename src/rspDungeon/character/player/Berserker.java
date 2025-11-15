package rspDungeon.character.player;

import rspDungeon.character.Character;

import java.util.Scanner;

public class Berserker extends Player {

    public Berserker(Scanner sc){
        super(sc);
        this.name = "Berserker";

        this.maxHP = 60;
        this.currentHP = 60;
        this.power = 15;
        this.resilience = 5;
        this.level = 1;
        this.currentMoney = 100;
        this.potionCount = 1;
    }

    //공격하기(이긴 경우)
    @Override
    public void attack(Character target) {
        target.currentHP -= power;
    }

    public void heal(){
        if((currentHP + resilience/2) < maxHP){
            currentHP += resilience/2;
        }else{
            currentHP = maxHP;
        }
    }

    public void levelUp(){
        maxHP += 10;
        if(currentHP + 10 < maxHP){
            currentHP += 10;
        }else{
            currentHP = maxHP;
        }
        power += 15;
        resilience += 5;
    }
}
