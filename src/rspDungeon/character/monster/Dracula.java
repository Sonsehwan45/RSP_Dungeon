package rspDungeon.character.monster;

import rspDungeon.character.Character;

public class Dracula extends Monster {
    public Dracula(int stage){
        super(stage);
        this.name = "Dracula";
        this.maxHP = 500;
        this.currentHP = 500;
        this.power = 30;
        this.resilience = 30;
    }

    @Override
    public void attack(Character target) {
        target.currentHP -= power;
        if(this.currentHP + 10 <= maxHP){
            currentHP += 10;
        }else{
            currentHP = maxHP;
        }
    }

    //회복(비긴 경우)
    public void heal(){
        if((currentHP + resilience/2) <= maxHP){
            currentHP += resilience/2;
        }else{
            currentHP = maxHP;
        }
    }
}
