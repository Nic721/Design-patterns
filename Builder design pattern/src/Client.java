import java.util.ArrayList;

/**
 * Created by cxy on 2018/4/15.
 */
public class Client {
    public static void main(String[] args){
//        ArrayList<String> sequence = new ArrayList<String>();
//        sequence.add("engine boom");
//        sequence.add("start");
//        sequence.add("stop");
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
//        benz.run();
//
//        BMWBuilder bmwBuilder = new BMWBuilder();
//        bmwBuilder.setSequence(sequence);
//        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
//        bmwModel.run();
        Director director = new Director();
        for(int i=0;i<5;i++){
            director.getABenzModel().run();
        }
        for(int i=0;i<10;i++){
            director.getBBenzModel().run();
        }
        for(int i=0;i<10;i++){
            director.getCBMWModel().run();
        }
    }
}
