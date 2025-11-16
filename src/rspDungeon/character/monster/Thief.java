package rspDungeon.character.monster;

import rspDungeon.character.Character;
import rspDungeon.character.player.Player;

public class Thief extends Monster {
    public Thief(int stage){
        super(stage);
        this.name = "Thief";
        this.maxHP = 25 * stage;
        this.currentHP = 25 * stage;
        this.power = 15 + (5 * stage);
        this.resilience = 5 + stage;
    }

    @Override
    public void attack(Character target) {
        target.currentHP -= power;
        Player player = (Player)target;

        if(target.currentHP - power <= 0){
            target.currentHP = 0;
            if(player.currentMoney > 0 && player.currentMoney < 10){
                System.out.println("소지금 " + player.currentMoney + "원을 훔칩니다.");
                player.currentMoney = 0;
            }
            else if(player.currentMoney >= 10){
                player.currentMoney -= 10;
                System.out.println("소지금 10원을 훔칩니다.");
            }
            else{
                System.out.println("도둑이 돈을 훔치려 했지만 땡전 한 푼 없습니다!");
            }
        }
        else{
            target.currentHP -= power;
            if(player.currentMoney > 0 && player.currentMoney < 10){
                System.out.println("소지금 " + player.currentMoney + "원을 훔칩니다.");
                player.currentMoney = 0;
            }
            else if(player.currentMoney >= 10){
                player.currentMoney -= 10;
                System.out.println("소지금 10원을 훔칩니다.");
            }
            else{
                System.out.println("도둑이 돈을 훔치려 했지만 땡전 한 푼 없습니다!");
            }
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
