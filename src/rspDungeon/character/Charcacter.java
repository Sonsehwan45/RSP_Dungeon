package rspDungeon.character;

public abstract class Charcacter {
    // ----기본 정보----
    public String name; //캐릭터 이름

    // ----능력치----
    public int maxHP; //최대HP
    public int currentHP; //현재HP
    public int power; //공격력
    public int resilience; //회복력

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
}
