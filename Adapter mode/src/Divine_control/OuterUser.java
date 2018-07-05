package Divine_control;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cxy on 2018/7/5.
 */
public class OuterUser implements IOuterUser {
    /*
	* 用户的基本信息
	*/
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber","这个员工电话是...");
        return baseInfoMap;
    }

    /**
    员工的工作信息， 比如， 职位等
    */
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }

    /**
    员工的家庭信息
    */
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }
}
