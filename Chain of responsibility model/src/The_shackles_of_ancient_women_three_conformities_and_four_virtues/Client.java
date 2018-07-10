package The_shackles_of_ancient_women_three_conformities_and_four_virtues;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cxy on 2018/7/10.
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
        }
        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for(IWomen women:arrayList) {
            if (women.getType() == 1) { //未结婚少女， 请示父亲
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(women);
            }else if(women.getType() ==2) { //已婚少妇， 请示丈夫
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.HandleMessage(women);
            }else if(women.getType() == 3) { //母亲请示儿子
                System.out.println("\n--------母亲向儿子请示-------");
                son.HandleMessage(women);
            }else{
                //暂时什么也不做
            }
        }
    }
}
