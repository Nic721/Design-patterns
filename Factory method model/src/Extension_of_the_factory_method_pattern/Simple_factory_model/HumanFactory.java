package Extension_of_the_factory_method_pattern.Simple_factory_model;

import Nuwa_created_man.Human;

/**
 * Created by cxy on 2018/7/1.
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c){
        //定义一个生产出的人种
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人种生成错误！ ");
        }
        return (T) human;
    }
}
