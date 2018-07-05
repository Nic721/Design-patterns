package Extension_of_the_adapter_pattern;

import Divine_control.IUserInfo;
import Extension_of_the_adapter_pattern.IOuterUserBaseInfo;
import Extension_of_the_adapter_pattern.IOuterUserHomeInfo;
import Extension_of_the_adapter_pattern.IOuterUserOfficeInfo;

import java.util.Map;

/**
 * Created by cxy on 2018/7/5.
 */
public class OuterUserInfo implements IUserInfo {
    //源目标对象
    private IOuterUserBaseInfo baseInfo = null; //员工的基本信息
    private IOuterUserHomeInfo homeInfo = null; //员工的家庭信息
    private IOuterUserOfficeInfo officeInfo = null; //工作信息
    //数据处理
    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;
    //构造函数传递对象
    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        //数据处理
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }
    //家庭地址
    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }
    //家庭电话号码
    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String)this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
    //职位信息
    @Override
    public String getJobPosition() {
        String jobPosition = (String)this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }
    //手机号码
    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }
    //办公电话
    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber= (String)this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }
    // 员工的名称
    @Override
    public String getUserName() {
        String userName = (String)this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }
}
