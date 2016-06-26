package club.dal;

import club.Interceptor.LogInterceptor;
import club.Interceptor.TimeInterceptor;
import club.annotation.AOP;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 14:17
 */
public class AdminDAL extends BaseDAL {
    @AOP(value = TimeInterceptor.class)
    public void getAdmin() {
        System.out.println("数据访问层 获取管理员");
    }

}
