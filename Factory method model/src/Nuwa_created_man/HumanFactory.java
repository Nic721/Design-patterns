package Nuwa_created_man;

/**
 * Created by cxy on 2018/7/1.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        Human human = null;
        try{
            human = (T) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}
