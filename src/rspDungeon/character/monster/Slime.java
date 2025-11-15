package rspDungeon.character.monster;

public class Slime extends Monster{
    public Slime(int stage){
        super(stage);
        this.name = "Slime";
        this.maxHP = 80;
        this.currentHP = 80;
        this.power = 10;
        this.resilience = 0;
    }

    //공격하기(이긴 경우)
    public void attack(int currentHP){

    }

    //회복(비긴 경우)
    public void heal(){

    }
}
