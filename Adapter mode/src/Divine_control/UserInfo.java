package Divine_control;

/**
 * Created by cxy on 2018/7/5.
 */
public class UserInfo implements IUserInfo {

    /**
    姓名， 这个很重要
    */
    @Override
    public String getUserName() {
        System.out.println("姓名叫做...");
        return null;
    }

    /*
	* 获得家庭地址， 下属送礼也可以找到地方
	*/
    @Override
    public String getHomeAddress() {
        System.out.println("这里是员工的家庭地址...");
        return null;
    }

    /**
    手机号码
    */
    @Override
    public String getMobileNumber() {
        System.out.println("这个人的手机号码是0000...");
        return null;
    }

    /**
    办公室电话， 烦躁的时候最好"不小心"把电话线踢掉
    */
    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公室电话是...");
        return null;
    }

    /**
    员工的职位， 是部门经理还是普通职员
    */
    @Override
    public String getJobPosition() {
        System.out.println("这个人的职位是BOSS...");
        return null;
    }

    /**
    获得家庭电话号码
    */
    @Override
    public String getHomeTelNumber() {
        System.out.println("员工的家庭电话是...");
        return null;
    }
}
