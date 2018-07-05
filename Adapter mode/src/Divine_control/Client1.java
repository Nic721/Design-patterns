package Divine_control;

/**
 * Created by cxy on 2018/7/5.
 */
public class Client1 {
    public static void main(String[] args){
        //没有与外系统连接的时候， 是这样写的
        IUserInfo youngGirl = new UserInfo();
        //从数据库中查到101个
        for (int i = 0; i < 101; i++){
            youngGirl.getMobileNumber();
        }
    }
}
