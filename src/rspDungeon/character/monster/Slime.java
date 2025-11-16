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

    public String chageRSP(int choiceRSP){
        String result = "";
        switch(choiceRSP) {
            case 1:
                result =  "가위";
                break;
            case 2:
                result = "바위";
                break;
            case 3:
                result = "보";
                break;
        }
        return result;
    }

    @Override
    public void attack(Character target) {
        if(target.currentHP - power <= 0){
            target.currentHP = 0;
        }
        else{
            target.currentHP -= power;
        }
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
