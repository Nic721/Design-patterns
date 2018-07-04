package Brilliant_engineering_building_hummer;

/**
 * Created by cxy on 2018/7/4.
 */
public abstract class HummerModel1 {
    /*
	* 首先， 这个模型要能够被发动起来， 别管是手摇发动， 还是电力发动， 反正
	* 是要能够发动起来， 那这个实现要在实现类里了
	*/
    public abstract void start();
    //能发动， 还要能停下来， 那才是真本事
    public abstract void stop();
    //喇叭会出声音， 是滴滴叫， 还是哔哔叫
    public abstract void alarm();
    //引擎会轰隆隆地响， 不响那是假的
    public abstract void engineBoom();
    //那模型应该会跑吧， 别管是人推的， 还是电力驱动的， 总之要会跑
    public abstract void run();
}

