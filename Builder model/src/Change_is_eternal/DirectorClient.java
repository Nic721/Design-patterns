package Change_is_eternal;

/**
 * Created by cxy on 2018/7/3.
 */
public class DirectorClient {
    public static void main(String[] args){
        Director director = new Director();
        //1万辆A类型的奔驰车
        for(int i = 0; i < 10000; i++){
            director.getABenzModel().run();
        }
        //100万辆B类型的奔驰车
        for (int i = 0; i < 1000000; i++){
            director.getBBenzModel().run();
        }
        //1000万辆C类型的宝马车
        for (int i = 0; i < 10000000; i++){
            director.getCBMWModel().run();
        }
    }
}
