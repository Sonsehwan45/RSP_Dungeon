package rspDungeon.character.monster;

import rspDungeon.character.Character;

public class Minotaur extends Monster {
    int attackCount;

    public Minotaur(int stage){
        super(stage);
        this.name = "Minotaur";
        this.maxHP = 200;
        this.currentHP = 200;
        this.power = 20;
        this.resilience = 20;
        this.attackCount = 0;
    }

    @Override
    public void attack(Character target) {
        this.attackCount += 1;
        if(this.attackCount == 3){
            target.currentHP -= power + 10;
            this.attackCount = 0;
        }else{
            target.currentHP -= power;
        }

    }

    @Override
    public void heal() {
        if((currentHP + resilience / 2) < maxHP){
            currentHP += resilience / 2;
        }else{
            currentHP = maxHP;
        }
    }
}
