package rspDungeon.character.monster;

import rspDungeon.character.Character;

public class Minotaur extends Monster {
    int attackCount;

    public Minotaur(int stage){
        super(stage);
        this.name = "Minotaur";
        this.maxHP = 200;
        this.currentHP = 200;
        this.power = 20;
        this.resilience = 20;
        this.attackCount = 0;
    }

    @Override
    public void showImage(){
        System.out.println(
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠉⠉⠛⠁⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣉⠛⡿⣿⣿⠵⠒⢆⠀⠀⠀⢀⠠⠀⠈⠝⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⡀⠀⠁⠀⠀⢭⡢⠔⠁⡠⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⢰⠃⠘⠊⡄⠰⠀⠀⠀⠈⠛⢻⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⢠⡏⠀⠀⠀⠈⠒⠒⠒⠊⠀⢀⣎⢿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⢀⣤⠶⣒⠚⠋⠀⠀⣯⡄⠀⡞⠩⠋⠱⢂⡎⠹⠁⢻⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠶⣟⣵⣾⣿⣿⣏⡀⠀⠈⠉⠀⢧⣂⣀⡰⠀⠀⠀⡳⡙⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡭⣹⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡻⠰⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣱⣟⣯⣿⣿⣿⡍⠀⠀⠀⠀⠀⠀⠀⠀⠀⢔⡿⢉⢁⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⠓⣿⣿⣷⡿⠏⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠉⢀⣄⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡻⠯⡀⠙⠿⠯⣤⠀⠀⠀⠀⢹⠀⠀⠀⠀⠀⠀⠀⠼⠿⢗⣒⣂\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣟⡽⢞⣟⡚⣍⠿⠟⠻⠿⣿⣿⣛⣋⢺⣿⣿⣧⡣⢄⠀⠀⠀⠀⠀⢠⡖⢸⠀⠀⠀⠀⢰⠀⠀⢸⣿⣿⣿⣿\n" +
                "⣿⣫⢷⢒⡶⠭⠵⣒⣒⠒⠚⢫⡹⠿⠿⠿⡛⢘⡉⢁⣭⣤⣤⣶⣦⠞⢿⣿⠟⠫⠠⣀⣶⣶⡤⣠⠞⢂⣸⠀⠀⠀⠀⡏⡆⠀⡘⣿⣿⣿⣿\n" +
                "⣤⢤⣌⠉⣱⢖⣒⣒⣒⣭⣝⣛⡻⣧⣾⡶⣫⣾⣿⣿⣿⣿⣿⣿⣿⣷⣥⣊⣙⢢⡇⣋⡏⠋⣼⣣⡄⢿⢗⢍⡢⢄⡼⠀⡷⡪⢂⣿⣿⣿⣿\n" +
                "⣿⣿⣶⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣟⣿⣟⣯⠙⣿⣿⣷⣌⢒⢇⣇⣏⡴⢳⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡩⣿⡟⠛⠛⠍⠃⢻⣿⣿⡟⡭⠚⡟⠁⠀⠁⣹⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⢸⣿⣿⣧⡀⠀⠀⠀⠀⢀⣿⣿⣿⣿\n");
    }

    @Override
    public void attack(Character target) {
        if(target.currentHP - power <= 0){
            target.currentHP = 0;
            System.out.println("------------------------------------------------------------------------");
            System.out.println(target.name + "이(가) 사망했습니다.");
            System.out.println("------------------------------------------------------------------------");
        }
        else {
            this.attackCount += 1;
            if (this.attackCount == 3) {
                target.currentHP -= power + 10;
                this.attackCount = 0;
                System.out.println("------------------------------------------------------------------------");
                System.out.println(target.name + "이 " + (power + 10) + "만큼 데미지를 입습니다.");
                System.out.println(target.name + "의 현재 HP : " + target.currentHP);
                System.out.println("------------------------------------------------------------------------");
            } else {
                target.currentHP -= power;
                System.out.println("------------------------------------------------------------------------");
                System.out.println(target.name + "이 " + power + "만큼 데미지를 입습니다.");
                System.out.println(target.name + "의 현재 HP : " + target.currentHP);
                System.out.println("------------------------------------------------------------------------");
            }
        }
    }

    @Override
    public void heal() {
        if((currentHP + resilience / 2) < maxHP){
            currentHP += resilience / 2;
        }else{
            currentHP = maxHP;
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println(name + "의 현재 HP : " + currentHP);
        System.out.println("------------------------------------------------------------------------");
    }
}
