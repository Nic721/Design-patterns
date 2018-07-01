package Extension_of_the_factory_method_pattern.Multiple_factory_model;

import Nuwa_created_man.Human;
import Nuwa_created_man.YellowHuman;

/**
 * Created by cxy on 2018/7/1.
 */
public class YellowHumanFactory {
    public Human createHuman(){
        return new YellowHuman();
    }
}
