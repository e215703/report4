package jp.ac.uryukyu.ie.e215703;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    /**
     * 倒れたはずの敵は攻撃できないことを検証。
     * 検証手順
     *  (1) ヒーローと敵を準備。ヒーローの攻撃力は敵を一撃で倒せるほど強い状態とする。
     *  (2) ヒーローが殴り、敵も殴る。敵は一撃で倒されていることを期待。
     *  (3) 敵が死んだ状態ならば攻撃できないはず。
     * 　　つまり攻撃実行してもヒーローのHPは減っていないことを期待。これを検証する。
     */
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

