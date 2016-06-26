package club.Interceptor;

/**
 * Created by 1dian_tech50 on 2016/6/26.
 * User : linving
 * Date : 2016/6/26
 * Time : 9:33
 * 日记 拦截器
 */
public class LogInterceptor implements Interceptor {

    @Override
    public void before() {
        System.out.println("运行前");
    }

    @Override
    public void after() {
        System.out.println("运行后");
    }
}
