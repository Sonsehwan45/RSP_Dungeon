package rspDungeon.character.monster;

import rspDungeon.character.Character;

public class Slime extends Monster{
    public Slime(int stage){
        super(stage);
        this.name = "Slime";
        this.maxHP = 50 * stage;
        this.currentHP = 50 * stage;
        this.power = 10 + (2 * stage);
        this.resilience = 10 + stage;
    }

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
}
