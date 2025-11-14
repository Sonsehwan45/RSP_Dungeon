package rspDungeon.character.player;

import rspDungeon.character.Charcacter;

public class Player extends Charcacter {
    // ----능력치----
    public int level; //현재 레벨

    // ----소유 목록----
    public int currentMoney; // 소지금
    public int potionCount; //포션 수

    //포션 사용
    public void usePotion(){
        if(potionCount == 0){
            System.out.println("포션이 없습니다.");
        }else{
            currentHP += 50;
            potionCount--;
        }
    }
}
