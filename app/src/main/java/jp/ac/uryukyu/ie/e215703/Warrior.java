package jp.ac.uryukyu.ie.e215703;

public class Warrior extends Hero{
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("戦士%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if(this.dead){
            return;
        }
        int damage = (int)(attack * 1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);

    }
}
