package Nuwa_created_man;

/**
 * Created by cxy on 2018/7/1.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
