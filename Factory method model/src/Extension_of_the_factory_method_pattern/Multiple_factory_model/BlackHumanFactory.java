package Extension_of_the_factory_method_pattern.Multiple_factory_model;

import Nuwa_created_man.BlackHuman;
import Nuwa_created_man.Human;

/**
 * Created by cxy on 2018/7/1.
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
