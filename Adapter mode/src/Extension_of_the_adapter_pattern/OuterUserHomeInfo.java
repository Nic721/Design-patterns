package Extension_of_the_adapter_pattern;

import Extension_of_the_adapter_pattern.IOuterUserHomeInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cxy on 2018/7/5.
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    /*
	* 员工的家庭信息
	*/
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }
}
