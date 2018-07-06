package Who_sent_the_spy_around_han_feizi;

/**
 * Created by cxy on 2018/7/6.
 */
public class Watch extends Thread {
    private HanFeiZi1 hanFeiZi;
    private LiSi1 lisi;
    private String type;
    //通过构造函数传递参数， 我要监控的是谁， 谁来监控， 要监控什么
    public Watch(HanFeiZi1 _hanFeiZi, LiSi1 _lisi, String _type){
        this.hanFeiZi =_hanFeiZi;
        this.lisi = _lisi;
        this.type = _type;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            if (this.type.equals("breakfast")){ //监控是否在吃早餐
                //如果发现韩非子在吃饭， 就通知李斯
                if (this.hanFeiZi.isHavingBreakfast()){
                    this.lisi.update("韩非子在吃饭");
                    //重置状态， 继续监控
                    this.hanFeiZi.setHavingBreakfast(false);
                }
            }else if (this.type.equals("fun")){ //监控是否在娱乐
                if (this.hanFeiZi.isHavingFun()){
                    this.lisi.update("韩非子在娱乐");
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }
    }
}
