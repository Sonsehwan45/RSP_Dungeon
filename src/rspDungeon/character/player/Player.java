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

    public abstract void showImage();

    public void showInfo(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println(name + "의 레벨 : " + level);
        System.out.println("총HP: " + maxHP);
        System.out.println("현재 HP: " + currentHP);
        System.out.println("공격력: " + power);
        System.out.println("회복력: " + resilience);
        System.out.println("소지금: " + currentMoney);
        System.out.println("포션 : " + potionCount +"개");
        System.out.println("------------------------------------------------------------------------");
    }

    @Override
    public int choiceRSP(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("[1] 가위, [2] 바위, [3] 보");
        System.out.print("원하는 선택지의 번호를 입력하세요 : ");
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
        System.out.println("------------------------------------------------------------------------");
        return choice;
    }

    //포션 사용
    public void usePotion(){
        System.out.println("------------------------------------------------------------------------");
            if(currentHP + 50 > maxHP){
                currentHP = maxHP;
            }else{
                currentHP += 50;
            }
            potionCount--;
            if(potionCount < 0){
                potionCount = 0;
            }
            System.out.println("HP를 50 회복합니다.");
            System.out.println(name + "의 HP : " + currentHP);
        System.out.println("------------------------------------------------------------------------");
    }

    //공격하기(이긴 경우)
    public abstract void attack(Character target);

    public abstract void levelUp();
}
