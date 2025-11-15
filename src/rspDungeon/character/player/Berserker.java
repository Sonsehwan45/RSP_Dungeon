package rspDungeon.character.player;

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

    public void attack(int currentHP){

    }

    public void heal(){

    }
}
