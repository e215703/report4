package jp.ac.uryukyu.ie.e215703;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void attackWithWeaponSkillTest() {
        int attack = 100;
        int enemyHp = 10000;
        Warrior demoWarrior = new Warrior("デモ戦士", 10, attack);
        Enemy slime = new Enemy("スライムもどき", enemyHp, 100);
        for(int i = 0; i <= 2; i++){
            int beforeHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int afterHp = slime.getHitPoint();
            assertEquals(attack * 1.5, beforeHp - afterHp);
        }
    }
}

