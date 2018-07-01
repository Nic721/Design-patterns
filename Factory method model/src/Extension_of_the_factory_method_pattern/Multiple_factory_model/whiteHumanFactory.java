package Extension_of_the_factory_method_pattern.Multiple_factory_model;

import Nuwa_created_man.Human;
import Nuwa_created_man.WhiteHuman;

/**
 * Created by cxy on 2018/7/1.
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    public Human createHuman(){
        return new WhiteHuman();
    }
}
