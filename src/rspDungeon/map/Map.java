package rspDungeon.map;

import rspDungeon.character.player.Player;

public abstract class Map {
    public String name;
    public int stage;
    public boolean isCleared;

    public Map(int stage, String name) {
        this.stage = stage;
        this.name = name;
        this.isCleared = false; // 처음엔 항상 클리어하지 않은 상태
    }

    // 던전 정보 출력
    public void showInfo(){
        System.out.println("--- [" + this.stage + "단계: " + this.name + "] ---");
    }

    //던전 플레이 진행
    public abstract void dungeonPlay(Player player);
}