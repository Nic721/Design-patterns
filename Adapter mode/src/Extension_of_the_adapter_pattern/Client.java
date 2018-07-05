package Extension_of_the_adapter_pattern;

import Divine_control.IUserInfo;

/**
 * Created by cxy on 2018/7/5.
 */
public class Client {
    public static void main(String[] args){
        //外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        //传递三个对象
        IUserInfo youngGirl = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
        //从数据库中查到101个
        for (int i = 0; i < 101; i++){
            youngGirl.getMobileNumber();
        }
    }
}
