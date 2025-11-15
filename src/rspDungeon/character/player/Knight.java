package rspDungeon.character.player;

import rspDungeon.character.Character;

import java.util.Scanner;

public class Knight extends Player {

    public Knight(Scanner sc) {
        super(sc);
        this.name = "Knight";

        this.maxHP = 80;       // 기사는 튼튼하게
        this.currentHP = 80;     // 시작 시 HP는 최대치
        this.power = 10;          // 공격력
        this.resilience = 10;      // 회복력 (비길 때 사용)
        this.level = 1;           // 레벨
        this.currentMoney = 100;    // 소지금
        this.potionCount = 2;     // 포션 1개
    }

    //공격하기(이긴 경우)
    @Override
    public void attack(Character target) {
        target.currentHP -= power;
    }

    public void heal(){
        if((currentHP + resilience/2) < maxHP){
            currentHP += resilience/2;
        }else{
            currentHP = maxHP;
        }
    }

    public void levelUp(){
        maxHP += 10;
        if(currentHP + 10 < maxHP){
            currentHP += 10;
        }else{
            currentHP = maxHP;
        }
        power += 10;
        resilience += 10;
    }
}
