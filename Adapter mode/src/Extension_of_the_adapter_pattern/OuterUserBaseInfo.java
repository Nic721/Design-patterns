package Extension_of_the_adapter_pattern;

import Extension_of_the_adapter_pattern.IOuterUserBaseInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cxy on 2018/7/5.
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
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
}
