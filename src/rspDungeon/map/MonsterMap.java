package rspDungeon.map;

import rspDungeon.character.monster.Monster;
import rspDungeon.character.player.Player;

import java.util.Scanner;

public class MonsterMap extends Map {
    private Monster monster;

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

            System.out.print("[1]가위 바위 보, [2]물약 먹기 선택하세요.");
            int choice = sc.nextInt();

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
            }
            else if(choice == 2){
                if(player.potionCount > 0){
                    player.usePotion();
                }
                else{
                    System.out.println("물약이 없습니다.");
                }
            }
        }
        isCleared = player.currentHP != 0;
        return isCleared;
    }
}
