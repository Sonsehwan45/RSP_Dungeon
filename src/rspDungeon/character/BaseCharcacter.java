package rspDungeon.character;

public class BaseCharcacter {
    // ----기본 정보----
    String name; //캐릭터 이름

    // ----능력치----
    int maxHP; //최대HP
    int currentHP; //현재HP
    int power; //공격력
    int resilience; //회복력
    int level; //현재 레벨

    // ----소유 목록----
    int currentMoney; // 소지금
    int potionCount; //포션 수

    //공격받기(진 경우)
    public void takeDamage(int damage) {
        currentHP -= damage;
        if(currentHP <= 0){
            System.out.println("ㅠㅠ 사망하셨습니다.");
            System.out.println("게임을 종료합니다.");
        }
    }

    //회복(비긴 경우)
    public void sameRSP(){
        currentHP += (resilience/2);
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
}
