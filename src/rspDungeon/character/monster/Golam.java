package rspDungeon.character.monster;

import rspDungeon.character.Character;

public class Golam extends Monster {
    public Golam(int stage){
        super(stage);
        this.name = "Golam";
        this.maxHP = 60 * stage;
        this.currentHP = 60 * stage;
        this.power = 5 + stage;
        this.resilience = 15 + stage;
    }

    @Override
    public void attack(Character target) {
        target.currentHP -= power;
    }

    @Override
    public void heal() {
        if((currentHP + resilience) < maxHP){
            currentHP += resilience;
        }else{
            currentHP = maxHP;
        }
    }
}
