package rspDungeon.character;

public abstract class Character {
    // ----기본 정보----
    public String name; //캐릭터 이름

    // ----능력치----
    public int maxHP; //최대HP
    public int currentHP; //현재HP
    public int power; //공격력
    public int resilience; //회복력

    //가위, 바위, 보 선택
    public abstract int choiceRSP();

    //공격하기(이긴 경우)
    public abstract void attack(int currentHP);

    //회복(비긴 경우)
    public abstract void heal();
}
