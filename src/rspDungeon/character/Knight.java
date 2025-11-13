package rspDungeon.character;

public class Knight extends BaseCharcacter{

    public Knight() {
        this.name = "Knight";

        this.maxHP = 80;       // 기사는 튼튼하게
        this.currentHP = 80;     // 시작 시 HP는 최대치
        this.power = 10;          // 공격력
        this.resilience = 10;      // 회복력 (비길 때 사용)
        this.level = 1;           // 레벨
        this.currentMoney = 100;    // 소지금
        this.potionCount = 2;     // 포션 1개
    }

}
