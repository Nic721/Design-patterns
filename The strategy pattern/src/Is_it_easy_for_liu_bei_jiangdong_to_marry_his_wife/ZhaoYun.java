package Is_it_easy_for_liu_bei_jiangdong_to_marry_his_wife;

/**
 * Created by cxy on 2018/7/10.
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("---刚刚到吴国的时候拆第一个---");
        context = new Context(new BackDoor()); //拿到妙计
        context.operate(); //拆开执行
        System.out.println("\n\n\n\n\n\n\n\n");
        //刘备乐不思蜀了， 拆第二个了
        System.out.println("---刘备乐不思蜀了， 拆第二个了---");
        context = new Context(new GivenGreenLight());
        context.operate();
        //孙权的小兵追来了， 咋办？ 拆第三个
        System.out.println("---孙权的小兵追来了， 咋办？ 拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
