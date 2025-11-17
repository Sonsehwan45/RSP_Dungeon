package rspDungeon.character.monster;

import rspDungeon.character.Character;
import rspDungeon.character.player.Player;

public class Thief extends Monster {
    public Thief(int stage){
        super(stage);
        this.name = "Thief";
        this.maxHP = 25 * stage;
        this.currentHP = 1;
        this.power = 15 + (5 * stage);
        this.resilience = 5 + stage;
    }

    @Override
    public void showImage(){
        System.out.println(
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠉⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⡿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠻⣷⣦⣄⣀⣀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⠟⠁⠀⠀⠀⠀⢀⣀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⡟⠁⠀⠀⠀⠀⠀⣰⡿⢛⣿⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡏⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⡏⠀⠀⠀⠀⢠⣄⠀⣹⣿⠋⠘⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢆⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⠀⠀⠀⠀⠀⠸⣧⡞⢉⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⠀⠀⠀⠀⠀⠘⠛⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠘⢿⣿⠿⠿⠛⠛⠛⠙⠻\n" +
                "⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠\n" +
                "⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⢀⣀⣤⣶⣿⣿\n" +
                "⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⢀⣴⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣶⣶⣶⣶⣾⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⠛⠉⠙⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠉⠛⢿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⡇⠀⠀⠀⠀⠀⠀⠉⠛⠻⢿⣿⡿⠃⠀⠀⠀⠀⠈⢻⣿⣦⣀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⢻⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣀⠀⢀⣼⣿⣿⣿⣿\n");
    }

    @Override
    public void attack(Character target) {
        target.currentHP -= power;
        Player player = (Player)target;

        if(target.currentHP - power <= 0){
            target.currentHP = 0;
            System.out.println("------------------------------------------------------------------------");
            System.out.println(target.name + "이(가) 사망했습니다.");
            System.out.println("------------------------------------------------------------------------");
        }
        else{
            target.currentHP -= power;
            if(player.currentMoney > 0 && player.currentMoney < 10){
                System.out.println("------------------------------------------------------------------------");
                System.out.println("소지금 " + player.currentMoney + "원을 훔칩니다.");
                player.currentMoney = 0;
            }
            else if(player.currentMoney >= 10){
                player.currentMoney -= 10;
                System.out.println("------------------------------------------------------------------------");
                System.out.println("소지금 10원을 훔칩니다.");
            }
            else{
                System.out.println("------------------------------------------------------------------------");
                System.out.println("도둑이 돈을 훔치려 했지만 땡전 한 푼 없습니다!");
            }
            System.out.println(target.name + "이 " + power + "만큼 데미지를 입습니다.");
            System.out.println(target.name + "의 현재 HP : " + target.currentHP);
            System.out.println("------------------------------------------------------------------------");
        }
    }

    //회복(비긴 경우)
    public void heal(){
        if((currentHP + resilience/2) < maxHP){
            currentHP += resilience/2;
        }else{
            currentHP = maxHP;
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println(name + "의 현재 HP : " + currentHP);
        System.out.println("------------------------------------------------------------------------");
    }
}
