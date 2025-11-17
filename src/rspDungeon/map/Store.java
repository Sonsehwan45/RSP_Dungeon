package rspDungeon.map;

import rspDungeon.character.player.Player;

import java.util.Scanner;

public class Store extends Map{

    public Store(int stage, String name){
        super(stage, name);
    }

    @Override
    public boolean dungeonPlay(Player player) {
        showInfo();
        Scanner sc = player.sc;

        while(true){
            System.out.println();
            System.out.println("현재 소지금은 " + player.currentMoney + "원 입니다.");
            System.out.print("[1]물약 구매(개당 50원) [2]능력치 강화(1회 50원) [3]상점 퇴장");
            System.out.print("원하는 선택지의 번호를 입력하세요 : ");

            int choice = sc.nextInt();
            System.out.println();

            if(choice == 3){
                isCleared = true;
                break;
            }
            else if(choice == 1){
                System.out.println("현재 포션 " + player.potionCount + "개를 소지하고 있습니다.");
                System.out.println("물약 1개에 50원 입니다. 구매하시겠습니까?");
                System.out.println("[1]구매한다. [2]구매하지 않는다.");
                System.out.print("원하는 선택지의 번호를 입력하세요 : ");
                int buyPotion = sc.nextInt();
                System.out.println();

                if(buyPotion == 2){
                    continue;
                }else if(buyPotion == 1){
                    if(player.currentMoney < 50){
                        System.out.println("소지금이 부족합니다.");
                        continue;
                    }else{
                        if(player.potionCount == 3){
                            System.out.println("포션을 이미 최대치로 가지고 있습니다.");
                        }else{
                            player.potionCount++;
                            player.currentMoney -= 50;
                            System.out.println("포션을 1개 구매합니다.");
                        }
                    }
                }
            }
            else if(choice == 2){
                int choiceAbility;

                do {
                    System.out.println("강화할 능력을 고르시오. 강화 비용 : 50원");
                    System.out.println("[1] 최대 체력(+10) | [2] 공격력(+5) | [3] 회복력(+5) | [4] 돌아가기");
                    System.out.print("원하는 선택지의 번호를 입력하세요 : ");

                    choiceAbility = sc.nextInt();
                    System.out.println();

                    if(choiceAbility == 4){
                        break;
                    }
                    else{
                        if(player.currentMoney < 50){
                            System.out.println("소지금이 부족합니다.");
                            continue;
                        }else{
                            if(choiceAbility == 1){
                                player.maxHP += 10;
                                player.currentHP += 10;
                                player.currentMoney -= 50;
                                System.out.println("최대 체력이 " + player.maxHP + "이(가) 되었습니다.");
                                System.out.println("현재 소지금은 " + player.currentMoney + "원 입니다.");
                            }
                            else if(choiceAbility == 2){
                                player.power += 5;
                                player.currentMoney -= 50;
                                System.out.println("공격력이 " + player.power + "이(가) 되었습니다.");
                                System.out.println("현재 소지금은 " + player.currentMoney + "원 입니다.");
                            }
                            else if(choiceAbility == 3){
                                player.resilience += 5;
                                player.currentMoney -= 50;
                                System.out.println("회복력이 " + player.resilience + "이(가) 되었습니다.");
                                System.out.println("현재 소지금은 " + player.currentMoney + "원 입니다.");
                            }
                        }
                    }
                }while(true);
            }
        }
        return isCleared;
    }
}
