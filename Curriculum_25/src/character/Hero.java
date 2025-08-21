package character;

import java.util.Random;

public class Hero extends Character {

    public Hero(String name) {
        super(name);  // Characterのコンストラクタを呼ぶ

        Random rand = new Random();
        setHp(rand.nextInt(1000) + 1);
        setMp(rand.nextInt(1000) + 1);
        setAttack(rand.nextInt(500) + 1);
        setSpeed(rand.nextInt(1000) + 1);
        setDefense(rand.nextInt(300) + 1);
    }
}