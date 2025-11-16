package rspDungeon.character.player;

import rspDungeon.character.Character;

import java.util.Scanner;

public abstract class Player extends Character {
    // ----능력치----
    public int level; //현재 레벨

    // ----소유 목록----
    public int currentMoney; // 소지금
    public int potionCount; //포션 수

    public Scanner sc;

    public Player(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public int choiceRSP(){
        System.out.println("[1]가위, [2]바위, [3]보 를 선택하세요. (숫자로 입력하세요)");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("가위를 선택하셨습니다.");
                break;
            case 2:
                System.out.println("바위를 선택하셨습니다.");
                break;
            case 3:
                System.out.println("보를 선택하셨습니다.");
                break;
        }
        return choice;
    }

    //포션 사용
    public void usePotion(){
        if(potionCount == 0){
            System.out.println("포션이 없습니다.");
        }else{
            currentHP += 50;
            potionCount--;
        }
    }

    //공격하기(이긴 경우)
    public abstract void attack(Character target);

    public abstract void levelUp();
}
