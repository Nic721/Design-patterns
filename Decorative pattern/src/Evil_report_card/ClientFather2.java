package Evil_report_card;

/**
 * Created by cxy on 2018/7/6.
 */
public class ClientFather2 {
    public static void main(String[] args){
        //把美化过的成绩单拿过来
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        //看成绩单
        sr.report();
        //然后老爸， 一看， 很开心， 就签名了
        sr.sign("老三"); //我叫小三， 老爸当然叫老三
    }
}
