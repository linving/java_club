package club.Interceptor;

/**
 * Created by 1dian_tech50 on 2016/6/26.
 * User : linving
 * Date : 2016/6/26
 * Time : 9:25
 */
public interface Interceptor {

    /**
     * 运行拦截前的方法
     */
    void before();

    /**
     * 运行拦截后的方法
     */
    void after();
}
