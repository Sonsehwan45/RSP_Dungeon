package rspDungeon.character.monster;

import rspDungeon.character.Character;

import java.util.Random;

public abstract class Monster extends Character {

    Monster(int stage){}
    @Override
    public int choiceRSP(){
        Random rand = new Random();
        int choice = rand.nextInt(3) + 1;

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
}
