package Evil_report_card;

/**
 * Created by cxy on 2018/7/6.
 */
public abstract class SchoolReport {
    //成绩单主要展示的就是你的成绩情况
    public abstract void report();
    //成绩单要家长签字， 这个是最要命的
    public abstract void sign(String name);
}
