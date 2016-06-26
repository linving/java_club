package club.dal;

import club.Interceptor.LogInterceptor;
import club.annotation.AOP;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 13:06
 */
public class UserDAL extends BaseDAL {

    @AOP(value = LogInterceptor.class)
    public void getUser() {
        System.out.println("从数据访问获取数据");
    }
}
