package mistake_of_Nu_wa;

/**
 * Created by cxy on 2018/7/1.
 */
public class NvWa {
    public static void main(String[] args){
        //第一条生产线， 男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线， 女性生产线
        HumanFactory femalHumanFactory = new FemaleFactory();
        //生产线建立完毕， 开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femalHumanFactory.createYellowHuman();
        System.out.println("---生产一个黄色女性---");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("\n---生产一个黄色男性---");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
        /*
		* ......
		* 后面继续创建
		*/
    }
}
