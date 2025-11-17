import rspDungeon.character.monster.*;
import rspDungeon.character.player.Berserker;
import rspDungeon.character.player.Knight;
import rspDungeon.character.player.Player;
import rspDungeon.character.player.Tanker;
import rspDungeon.map.Map;
import rspDungeon.map.MonsterMap;
import rspDungeon.map.Store;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        //플레이할 캐릭터 선택
        Player player = choicePlayer(sc);

        player.showImage();

        //생성될 맵을 저장할 배열 선언
        Map[] MapList = createMapList();

        System.out.println("\n던전에 입장하겠습니까?");
        System.out.println("[1] YES [2] NO");
        System.out.print("원하는 선택지의 번호를 입력하세요 : ");
        int choice1 = sc.nextInt();
        if(choice1 == 2) {
            System.exit(0);
        }
        System.out.println();

        for(Map dungeon : MapList){
            dungeon.dungeonPlay(player);
            if(player.currentHP == 0){
                System.out.println(player.name + "이(가) 죽었습니다.");
                System.exit(0);
            }else{
                System.out.println("" +
                        "\n다음 단계로 넘어가겠습니까?");
                System.out.println("[1] YES [2] NO");
                System.out.print("원하는 선택지의 번호를 입력하세요 : ");
                int choice = sc.nextInt();
                if(choice == 2){
                    System.exit(0);
                }
                System.out.println();
            }
        }

    }

    //캐릭터 선택
    public static Player choicePlayer(Scanner sc){
        System.out.println("플레이할 캐릭터를 고르시오.");
        System.out.println("[1] 기사 [2] 탱커 [3] 광전사");
        System.out.print("원하는 선택지의 번호를 입력하세요 : ");
        int choice = sc.nextInt();
        System.out.println(

        );

        Player player = null;

        if(choice == 1){
            player = new Knight(sc);
        } else if (choice == 2) {
            player = new Tanker(sc);
        }else if (choice == 3) {
            player = new Berserker(sc);
        }

        return player;
    }

    public static Monster choiceMonster(int stage){
        Random rand = new Random();
        int choiceMonster = rand.nextInt(3) + 1;
        Monster monster = null;
        if(choiceMonster == 1){
            monster = new Slime(stage);
        }else if (choiceMonster == 2){
            monster = new Thief(stage);
        }
        else if(choiceMonster == 3){
            monster = new Golam(stage);
        }
        return monster;
    }

    public static Map[] createMapList(){
        Map[] MapList = new Map[10];
        //맵 생성
        for(int i = 1; i <= 10; i++){
            switch(i){
                case 1,2,3,6,7,8 -> {
                    Monster monster = choiceMonster(i);
                    String dungeonName = monster.name + "던전";
                    MapList[i-1] = new MonsterMap(dungeonName, i, monster);
                }
                case 4, 9 -> {
                    MapList[i-1] = new Store(i, "상점");
                }
                case 5 ->{
                    Monster monster = new Minotaur(i);
                    String dungeonName = monster.name + "던전";
                    MapList[i-1] = new MonsterMap(dungeonName, i, monster);
                }
                case 10 ->{
                    Monster monster = new Dracula(i);
                    String dungeonName = monster.name + "던전";
                    MapList[i-1] = new MonsterMap(dungeonName, i, monster);
                }
            }
        }
        return MapList;
    }
}