package Change_is_eternal;

import java.util.ArrayList;

/**
 * Created by cxy on 2018/7/3.
 */
public class ClientBMW {
    public static void main(String[] args){
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom"); //客户要求， run的时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类， 制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benzModel.run();
        //按照同样的顺序， 我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        bmwModel.run();
    }
}
