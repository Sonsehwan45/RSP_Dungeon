package rspDungeon.map;

import rspDungeon.character.monster.Monster;
import rspDungeon.character.player.Player;

public class MonsterMap extends Map {
    private Monster monster;

    MonsterMap(String name, int stage, Monster monster){
        super(stage, name);
        this.monster = monster;
    }

    @Override
    public void dungeonPlay(Player player){
        showInfo();
        System.out.println(this.monster.name + " 이(가) 나타났다.");


    }
}
