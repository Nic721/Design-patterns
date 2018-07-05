package Divine_control;

import java.util.Map;

/**
 * Created by cxy on 2018/7/5.
 */
public interface IOuterUser {
    //基本信息， 比如名称、 性别、 手机号码等
    public Map getUserBaseInfo();
    //工作区域信息
    public Map getUserOfficeInfo();
    //用户的家庭信息
    public Map getUserHomeInfo();
}
