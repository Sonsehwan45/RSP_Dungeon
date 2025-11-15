package rspDungeon.character.player;

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
    public void attack(int currentHP){

    }

    //회복(비긴 경우)
    public void heal(){

    }
}
