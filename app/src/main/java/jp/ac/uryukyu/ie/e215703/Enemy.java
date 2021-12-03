package jp.ac.uryukyu.ie.e215703;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if(this.dead){
            return;
        }
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
        hero.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    /**
     * 自身のnameを返すgetter
     * @return 自身のname
     */
    public String getName(){
        return name;
    }

    /**
     * 自身のnameを設定するsetter
     * @param newName 設定したいname
     */
    public void setName(String newName){
        name = newName;
    }

    /**
     * 自身のhitPointを返すgetter
     * @return 自身のhitPoint
     */
    public int getHitPoint(){
        return hitPoint;
    }

    /**
     * 自身のhitPointを設定するsetter
     * @param newHitPoint 設定したいhitPoint
     */
    public void setHitPoint(int newHitPoint){
        hitPoint = newHitPoint;
    }

    /**
     * 自身のattackを返すgetter
     * @return 自身のattack
     */
    public int getAttack(){
        return attack;
    }

    /**
     * 自身のattackを設定するsetter
     * @param newAttack 設定したいattack
     */
    public void setAttack(int newAttack){
        attack = newAttack;
    }

    /**
     * 自身のdeadを返すgetter
     * @return 自身のdead
     */
    public boolean isDead(){
        return dead;
    }

    /**
     * 自身のdeadを設定するsetter
     * @param newDead 設定したいdead
     */
    public void setIsDead(boolean newDead){
        dead = newDead;
    }
}