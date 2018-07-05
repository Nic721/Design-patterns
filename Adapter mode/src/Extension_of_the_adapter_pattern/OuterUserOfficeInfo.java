package Extension_of_the_adapter_pattern;

import Extension_of_the_adapter_pattern.IOuterUserOfficeInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cxy on 2018/7/5.
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    /*
	* 员工的工作信息， 比如， 职位等
	*/
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
