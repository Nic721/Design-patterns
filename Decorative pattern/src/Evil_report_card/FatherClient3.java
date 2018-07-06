package Evil_report_card;

/**
 * Created by cxy on 2018/7/6.
 */
public class FatherClient3 {
    public static void main(String args){
        //把成绩单拿过来
        SchoolReport sr;
        //原装的成绩单
        sr = new FouthGradeSchoolReport();
        //加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        //又加了成绩排名的说明
        sr = new SortDecorator(sr);
        //看成绩单
        sr.report();
        //然后老爸一看， 很开心， 就签名了
        sr.sign("老三"); //我叫小三， 老爸当然叫老三
    }
}
