package The_modified;

import The_shackles_of_ancient_women_three_conformities_and_four_virtues.IWomen;
/**
 * Created by cxy on 2018/7/10.
 */
public class Father extends Handler {
    //父亲只处理女儿的请求
    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }
    //父亲的答复
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
