package rspDungeon.map;

import rspDungeon.character.monster.Monster;
import rspDungeon.character.player.Player;

import java.util.Scanner;

public class MonsterMap extends Map {
    private final Monster monster;

    public MonsterMap(String name, int stage, Monster monster){
        super(stage, name);
        this.monster = monster;
    }

    @Override
    public boolean dungeonPlay(Player player){
        showInfo();
        System.out.println(this.monster.name + " 이(가) 나타났다.");

        while(player.currentHP > 0 && this.monster.currentHP > 0){

            Scanner sc = player.sc;

            monster.showImage();
            System.out.println(player.name + "의 HP : " + player.currentHP);
            System.out.println(monster.name + "의 HP : " + monster.currentHP + "\n");

            System.out.println("[1] RSP 대결, [2] 포션 사용 [3]플레이어 상태");
            System.out.print("원하는 선택지의 번호를 입력하세요 : ");
            int choice = sc.nextInt();
            System.out.println();

            if(choice == 1){
                int playerChoice = player.choiceRSP();

                int monsterChoice = this.monster.choiceRSP();

                if((playerChoice == 1 && monsterChoice == 1) || (playerChoice == 2 && monsterChoice == 2) || (playerChoice == 3 && monsterChoice == 3)){
                    System.out.println("비겼습니다.");
                    player.heal();
                    this.monster.heal();
                }
                else if((playerChoice == 1 && monsterChoice == 3) || (playerChoice == 2 && monsterChoice == 1) || (playerChoice == 3 && monsterChoice == 2)){
                    System.out.println("이겼습니다.");
                    player.attack(monster);
                }
                else if((monsterChoice == 1 && playerChoice == 3) || (monsterChoice == 2 && playerChoice == 1) || (monsterChoice == 3 && playerChoice == 2)){
                    System.out.println("졌습니다.");
                    this.monster.attack(player);
                }
                System.out.println();
            }
            else if(choice == 2){
                if(player.potionCount > 0){
                    player.usePotion();
                }
                else{
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("물약이 없습니다.");
                    System.out.println("------------------------------------------------------------------------");
                }
                System.out.println();
            }
            else if(choice == 3){
                player.showInfo();
            }
        }
        isCleared = player.currentHP != 0;

        if(isCleared){
            player.levelUp();
        }
        return isCleared;
    }
}
